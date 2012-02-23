package com.encyclo.core;

import static com.encyclo.core.DatabaseUtils.and;
import static com.encyclo.core.DatabaseUtils.select;
import static com.encyclo.core.DatabaseUtils.where;

import java.util.HashMap;
import java.util.Map;

import com.encyclo.messages.CustomModels.Document;
import com.encyclo.messages.CustomModels.Entity;
import com.encyclo.messages.Search.SearchQuery;
import com.encyclo.messages.Search.SearchResponse;
import com.encyclo.messages.Search.SearchQuery.WhereStatement.Operator;
import com.google.protobuf.Descriptors.Descriptor;

public class Index {

	public static final Map<Integer, String> TABLES = new HashMap<Integer, String>();
	
	private Descriptor _model;
	private FieldIndexFactory _fieldIndexFactory;
	private FieldIndex _fieldIndex;
	
	public Index(Descriptor model, FieldIndexFactory index) {
		_model = model;
		_fieldIndexFactory = index;
		
		_fieldIndex = _fieldIndexFactory.create(model);
	}
	
	public SearchResponse search(SearchQuery query) {
		long timeBeforeMillis = System.currentTimeMillis();
		SearchResponse.Builder response = _fieldIndex.search(query, _model.toProto().newBuilderForType());
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
		Index entityIndex = new Index(Entity.getDescriptor(),
				new HashMapFieldIndexFactory(Entity.ID_FIELD_NUMBER,
					new ListFieldsIndexFactory()));
		
		Index documentIndex = new Index(Document.getDescriptor(),
				new HashMapFieldIndexFactory(Document.LANGUAGE_FIELD_NUMBER));
		
		SearchQuery query = SearchQuery.newBuilder()
			.setIndexName("entities")
			.setTableName("entity")
			.addSelectField(select(Entity.PARENT_ID_FIELD_NUMBER))
			.setWhereStatement(
					where(Entity.PARENT_ID_FIELD_NUMBER, Operator.EQUALS, "6",
							and(Entity.USER_ID_FIELD_NUMBER, Operator.EQUALS, "10").build()))
			.build();
		
		index.search(query);
	}
	
}