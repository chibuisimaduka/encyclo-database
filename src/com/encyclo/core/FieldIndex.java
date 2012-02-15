package com.encyclo.core;

import com.encyclo.messages.Search.SearchQuery;
import com.encyclo.messages.Search.SearchResponse;

public abstract class FieldIndex {

	private FieldIndex _nextIndex;
	
	public FieldIndex(FieldIndex nextIndex) {
		_nextIndex = nextIndex;
	}
	
	public final SearchResponse.Builder search(SearchQuery query) {
		return _nextIndex == null ? searchIndex(SearchResponse.newBuilder(), query) : searchIndex(_nextIndex.search(query), query);
	}
	
	protected abstract SearchResponse.Builder searchIndex(SearchResponse.Builder response, SearchQuery query);
}