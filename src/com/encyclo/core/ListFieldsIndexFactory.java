package com.encyclo.core;

import com.google.protobuf.Descriptors.Descriptor;

public class ListFieldsIndexFactory extends FieldIndexFactory {

	public ListFieldsIndexFactory() {
		super(null);
	}

	@Override
	public FieldIndex create(Descriptor descriptor) {
		return new ListFieldsIndex();
	}

}
