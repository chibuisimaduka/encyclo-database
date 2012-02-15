package com.encyclo.core;

import java.util.HashMap;
import java.util.Map;

import com.encyclo.messages.CustomModels.Entity;
import com.encyclo.messages.Search.SearchQuery;
import com.encyclo.messages.Search.SearchQuery.WhereStatement;
import com.encyclo.messages.Search.SearchQuery.WhereStatement.LogicalStatement;
import com.encyclo.messages.Search.SearchQuery.WhereStatement.Operator;
import com.encyclo.messages.Search.SearchQuery.WhereStatement.LogicalStatement.LogicalStatementType;
import com.google.protobuf.Descriptors.Descriptor;

public class Database {

	public static final Map<Integer, String> TABLES = new HashMap<Integer, String>();
	
	public Database(Descriptor model, FieldIndexFactory index) {
		
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
			.setWhereStatement(WhereStatement.newBuilder()
					.setField(Entity.PARENT_ID_FIELD_NUMBER)
					.setOperator(Operator.EQUALS)
					.setValue("6")
					.addAdditionalStatement(LogicalStatement.newBuilder()
							.setLogicalType(LogicalStatementType.AND)
							.setWhereStatement(buildWhereStatement(Entity.USER_ID_FIELD_NUMBER, Operator.EQUALS, "10"))
			.build();
	}
	
	private static WhereStatement buildWhereStatement(int field, Operator operator) {
		if (operator != Operator.IS_NULL || operator != Operator.IS_NULL) {
			throw new IllegalArgumentException("A value is expected for the given operator.");
		}
		return WhereStatement.newBuilder().setField(field).setOperator(operator).build();
	}
	
	private static WhereStatement buildWhereStatement(int field, Operator operator, String value) {
		return WhereStatement.newBuilder().setField(field).setOperator(operator).setValue(value).build();
	}
	
}