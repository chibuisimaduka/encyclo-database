package com.encyclo.core;

import com.google.protobuf.Descriptors.Descriptor;

public class IdFieldIndexFactory extends FieldIndexFactory {

	int[] _idsFieldNumbers;
	
	public IdFieldIndexFactory(int[] idsFieldNumbers, FieldIndexFactory nextIndex) {
		super(nextIndex);
		_idsFieldNumbers = idsFieldNumbers;
	}

	@Override
	public FieldIndex create(Descriptor descriptor) {
		return new IdFieldIndex(_idsFieldNumbers, Index.TABLES.get(_idsFieldNumbers));
	}

}
