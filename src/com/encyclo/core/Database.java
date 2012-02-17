package com.encyclo.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.encyclo.messages.CustomModels.Entity;
import com.encyclo.messages.Search.SearchQuery;
import com.encyclo.messages.Search.SearchResponse;
import com.encyclo.messages.Search.SearchQuery.WhereStatement;
import com.encyclo.messages.Search.SearchQuery.WhereStatement.LogicalStatement;
import com.encyclo.messages.Search.SearchQuery.WhereStatement.Operator;
import com.encyclo.messages.Search.SearchQuery.WhereStatement.LogicalStatement.LogicalStatementType;
import com.google.protobuf.Descriptors.Descriptor;

public class Database {

	public static final Map<Integer, String> TABLES = new HashMap<Integer, String>();
	
	private Descriptor _model;
	private FieldIndexFactory _fieldIndexFactory;
	private FieldIndex _fieldIndex;
	
	public Database(Descriptor model, FieldIndexFactory index) {
		_model = model;
		_fieldIndexFactory = index;
		
		_fieldIndex = _fieldIndexFactory.create(model);
	}
	
	public SearchResponse search(SearchQuery query) {
		long timeBeforeMillis = System.currentTimeMillis();
		SearchResponse.Builder response = _fieldIndex.search(query);
		response.setQueryTimeMs((int) (System.currentTimeMillis() - timeBeforeMillis));
		return response.build();
	}
	
	public boolean clear() {
		_fieldIndex = _fieldIndexFactory.create(_model);
		return true;
	}
	
	public static void main(String[] args) {
//		Database database = new Database(Entity.getDescriptor(),
//				new IdFieldIndexFactory(new int[]{Entity.ID_FIELD_NUMBER}, 
//					new ListFieldsIndexFactory()));
		Database database = new Database(Entity.getDescriptor(),
				new HashMapFieldIndexFactory(Entity.ID_FIELD_NUMBER,
					new ListFieldsIndexFactory()));
		
		SearchQuery query = SearchQuery.newBuilder()
			.setIndexName("entities")
			.setTableName("entity")
			.addSelectField(Entity.ID_FIELD_NUMBER)
			.setWhereStatement(
					where(Entity.PARENT_ID_FIELD_NUMBER, Operator.EQUALS, "6",
							and(Entity.USER_ID_FIELD_NUMBER, Operator.EQUALS, "10").build()))
			.build();
		
		database.search(query);
	}
	
	private static WhereStatement.Builder where(int field, Operator operator, LogicalStatement... additionalStatements) {
		return WhereStatement.newBuilder().setField(field).setOperator(operator).addAllAdditionalStatement(Arrays.asList(additionalStatements));
	}
	
	private static WhereStatement.Builder where(int field, Operator operator, String value, LogicalStatement... additionalStatements) {
		return WhereStatement.newBuilder().setField(field).setOperator(operator).setValue(value).addAllAdditionalStatement(Arrays.asList(additionalStatements));
	}
	
	private static LogicalStatement.Builder and(int field, Operator operator, LogicalStatement... additionalStatements) {
		return buildAdditionalStatement(LogicalStatementType.AND, field, operator, additionalStatements);
	}
	
	private static LogicalStatement.Builder and(int field, Operator operator, String value, LogicalStatement... additionalStatements) {
		return buildAdditionalStatement(LogicalStatementType.AND, field, operator, value, additionalStatements);
	}
	
	private static LogicalStatement.Builder or(int field, Operator operator, LogicalStatement... additionalStatements) {
		return buildAdditionalStatement(LogicalStatementType.OR, field, operator, additionalStatements);
	}
	
	private static LogicalStatement.Builder or(int field, Operator operator, String value, LogicalStatement... additionalStatements) {
		return buildAdditionalStatement(LogicalStatementType.OR, field, operator, value, additionalStatements);
	}
	
	private static LogicalStatement.Builder xor(int field, Operator operator, LogicalStatement... additionalStatements) {
		return buildAdditionalStatement(LogicalStatementType.XOR, field, operator, additionalStatements);
	}
	
	private static LogicalStatement.Builder xor(int field, Operator operator, String value, LogicalStatement... additionalStatements) {
		return buildAdditionalStatement(LogicalStatementType.XOR, field, operator, value, additionalStatements);
	}
	
	private static LogicalStatement.Builder buildAdditionalStatement(LogicalStatementType logicalType, int field, Operator operator, LogicalStatement... additionalStatements) {
		return LogicalStatement.newBuilder().setLogicalType(logicalType).setWhereStatement(where(field, operator, additionalStatements));
	}
	
	private static LogicalStatement.Builder buildAdditionalStatement(LogicalStatementType logicalType, int field, Operator operator, String value, LogicalStatement... additionalStatements) {
		return LogicalStatement.newBuilder().setLogicalType(logicalType).setWhereStatement(where(field, operator, value, additionalStatements));
	}
	
}