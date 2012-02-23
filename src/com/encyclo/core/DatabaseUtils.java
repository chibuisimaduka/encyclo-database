package com.encyclo.core;

import java.util.Arrays;

import com.encyclo.messages.Search.SearchQuery.SelectField;
import com.encyclo.messages.Search.SearchQuery.WhereStatement;
import com.encyclo.messages.Search.SearchQuery.WhereStatement.LogicalStatement;
import com.encyclo.messages.Search.SearchQuery.WhereStatement.Operator;
import com.encyclo.messages.Search.SearchQuery.WhereStatement.LogicalStatement.LogicalStatementType;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;

public class DatabaseUtils {

	public static FieldDescriptor field(Descriptor model, int fieldId) {
		return model.getFields().get(fieldId - 1);
	}
	
	public static SelectField select(int fieldId, SelectField... selectFields) {
		return SelectField.newBuilder().setFieldId(fieldId).addAllSelectField(Arrays.asList(selectFields)).build();
	}
	
	public static WhereStatement.Builder where(int field, Operator operator, LogicalStatement... additionalStatements) {
		return WhereStatement.newBuilder().setField(field).setOperator(operator).addAllAdditionalStatement(Arrays.asList(additionalStatements));
	}
	
	public static WhereStatement.Builder where(int field, Operator operator, String value, LogicalStatement... additionalStatements) {
		return WhereStatement.newBuilder().setField(field).setOperator(operator).setValue(value).addAllAdditionalStatement(Arrays.asList(additionalStatements));
	}
	
	public static LogicalStatement.Builder and(int field, Operator operator, LogicalStatement... additionalStatements) {
		return buildAdditionalStatement(LogicalStatementType.AND, field, operator, additionalStatements);
	}
	
	public static LogicalStatement.Builder and(int field, Operator operator, String value, LogicalStatement... additionalStatements) {
		return buildAdditionalStatement(LogicalStatementType.AND, field, operator, value, additionalStatements);
	}
	
	public static LogicalStatement.Builder or(int field, Operator operator, LogicalStatement... additionalStatements) {
		return buildAdditionalStatement(LogicalStatementType.OR, field, operator, additionalStatements);
	}
	
	public static LogicalStatement.Builder or(int field, Operator operator, String value, LogicalStatement... additionalStatements) {
		return buildAdditionalStatement(LogicalStatementType.OR, field, operator, value, additionalStatements);
	}
	
	public static LogicalStatement.Builder xor(int field, Operator operator, LogicalStatement... additionalStatements) {
		return buildAdditionalStatement(LogicalStatementType.XOR, field, operator, additionalStatements);
	}
	
	public static LogicalStatement.Builder xor(int field, Operator operator, String value, LogicalStatement... additionalStatements) {
		return buildAdditionalStatement(LogicalStatementType.XOR, field, operator, value, additionalStatements);
	}
	
	public static LogicalStatement.Builder buildAdditionalStatement(LogicalStatementType logicalType, int field, Operator operator, LogicalStatement... additionalStatements) {
		return LogicalStatement.newBuilder().setLogicalType(logicalType).setWhereStatement(where(field, operator, additionalStatements));
	}
	
	public static LogicalStatement.Builder buildAdditionalStatement(LogicalStatementType logicalType, int field, Operator operator, String value, LogicalStatement... additionalStatements) {
		return LogicalStatement.newBuilder().setLogicalType(logicalType).setWhereStatement(where(field, operator, value, additionalStatements));
	}
	
}
