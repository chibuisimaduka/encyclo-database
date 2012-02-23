package com.encyclo.core;

import com.encyclo.messages.Search.SearchQuery;
import com.encyclo.messages.Search.SearchResponse.Builder;
import com.google.protobuf.Descriptors.FieldDescriptor;

public class HashMapFieldIndex extends FieldIndex {

	private FieldDescriptor _field;
	
	public HashMapFieldIndex(FieldDescriptor field, String string, FieldIndex nextIndex) {
		super(nextIndex);
	}

	@Override
	protected Builder searchIndex(SearchQuery query, Builder builder) {
		if (query.getSelectFieldList().contains(_field.getIndex())) {
			builder.setField(_field, arg1);
			response.addResponseMessage(value);
		}
		return null;
	}

}
