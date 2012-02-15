package com.encyclo.core;

import com.google.protobuf.Descriptors.Descriptor;

public abstract class FieldIndexFactory {

	protected FieldIndexFactory _nextIndex;
	
	public FieldIndexFactory(FieldIndexFactory nextIndex) {
		_nextIndex = nextIndex;
	}
	
	public abstract FieldIndex create(Descriptor descriptor);
}