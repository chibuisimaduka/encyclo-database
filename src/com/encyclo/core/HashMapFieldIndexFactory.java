package com.encyclo.core;

import static com.encyclo.core.DatabaseUtils.field;

import com.google.protobuf.Descriptors.Descriptor;

public class HashMapFieldIndexFactory extends FieldIndexFactory {

	private int _field;
	
	public HashMapFieldIndexFactory(int field, FieldIndexFactory nextIndex) {
		super(nextIndex);
		_field = field;
	}

	@Override
	public FieldIndex create(Descriptor model) {
		return new HashMapFieldIndex(field(model,_field), Index.TABLES.get(_field), _nextIndex.create(model));
	}

}
