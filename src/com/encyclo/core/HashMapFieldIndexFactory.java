package com.encyclo.core;

import com.google.protobuf.Descriptors.Descriptor;

public class HashMapFieldIndexFactory extends FieldIndexFactory {

	private int _field;
	
	public HashMapFieldIndexFactory(int field, FieldIndexFactory nextIndex) {
		super(nextIndex);
		_field = field;
	}

	@Override
	public FieldIndex create(Descriptor descriptor) {
		return new HashMapFieldIndex(_field, Database.TABLES.get(_field), _nextIndex.create(descriptor));
	}

}
