package com.encyclo.core;

import com.encyclo.messages.Search.SearchQuery;
import com.encyclo.messages.Search.SearchResponse.Builder;

public class ListFieldsIndex extends FieldIndex {

	public ListFieldsIndex() {
		super(null);
	}

	@Override
	protected Builder searchIndex(Builder response, SearchQuery query) {
		return null;
	}

}
