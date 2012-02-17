package com.encyclo.core;

import com.encyclo.messages.Search.SearchQuery;
import com.encyclo.messages.Search.SearchResponse;
import com.google.protobuf.GeneratedMessage.Builder;

public abstract class FieldIndex {

	private FieldIndex _nextIndex;
	
	public FieldIndex(FieldIndex nextIndex) {
		_nextIndex = nextIndex;
	}
	
	public final SearchResponse.Builder search(Builder<?> response, SearchQuery query) {
		return _nextIndex == null ? searchIndex(response, query) : searchIndex(_nextIndex.search(query), query);
	}
	
	protected abstract SearchResponse.Builder searchIndex(SearchResponse.Builder response, SearchQuery query);
}