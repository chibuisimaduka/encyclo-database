package encyclo;

public abstract class FieldIndex {

	private FieldIndex _nextIndex;
	
	public FieldIndex(FieldIndex nextIndex) {
		_nextIndex = nextIndex;
	}
	
	public final SearchResponse search(SearchQuery query) {
		return _nextIndex == null ? searchIndex(new SearchResponse(), query) : searchIndex(_nextIndex.search(query), query);
	}
	
	protected abstract SearchResponse searchIndex(SearchResponse response, SearchQuery query);
}