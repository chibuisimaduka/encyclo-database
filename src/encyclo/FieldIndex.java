package encyclo;

public abstract class FieldIndex {

	private FieldIndex _nextIndex;
	
	public FieldIndex(FieldIndex nextIndex) {
		_nextIndex = nextIndex;
	}
	
}