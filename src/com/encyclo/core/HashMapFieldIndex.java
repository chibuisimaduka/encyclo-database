package com.encyclo.core;

import com.encyclo.messages.Search.SearchQuery;
import com.encyclo.messages.Search.SearchResponse.Builder;

public class HashMapFieldIndex extends FieldIndex {

	private int _field;
	
	public HashMapFieldIndex(int fieldNumber, String string, FieldIndex nextIndex) {
		super(nextIndex);
	}

	@Override
	protected Builder searchIndex(Builder response, SearchQuery query) {
		if (query.getSelectFieldList().contains(_field)) {
			response.addResponseMessage(value);
		}
		return null;
	}

}
