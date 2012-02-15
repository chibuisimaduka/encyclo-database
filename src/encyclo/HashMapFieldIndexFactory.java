package encyclo;

import com.google.protobuf.Descriptors.Descriptor;

public class HashMapFieldIndexFactory extends FieldIndexFactory {

	private int fieldNumber;
	
	public HashMapFieldIndexFactory(FieldIndexFactory nextIndex) {
		super(nextIndex);
	}

	@Override
	public FieldIndex create(Descriptor descriptor) {
		return new HashMapFieldIndex(Database.TABLES.get(fieldNumber));
	}

}