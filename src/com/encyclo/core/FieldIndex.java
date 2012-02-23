package com.encyclo.core;

import com.encyclo.messages.Search.SearchQuery;
import com.encyclo.messages.Search.SearchResponse;
import com.encyclo.messages.Search.SearchResponse.Builder;

public abstract class FieldIndex {

	private FieldIndex _nextIndex;
	
	public FieldIndex(FieldIndex nextIndex) {
		_nextIndex = nextIndex;
	}
	
	protected abstract SearchResponse.Builder searchIndex(SearchQuery query, Builder builder);

	public Builder search(SearchQuery query, Builder builder) {
		return _nextIndex == null ? searchIndex(query, builder) : searchIndex(query, _nextIndex.search(query, builder));
	}

	
}