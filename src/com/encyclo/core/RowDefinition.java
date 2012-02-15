package com.encyclo.core;

import com.google.protobuf.Descriptors.FieldDescriptor;

public class RowDefinition {

	public FieldDescriptor[] _ids;
	public FieldDescriptor[] _attributes;
	
	public RowDefinition(FieldDescriptor[] ids, FieldDescriptor... attributes) {
		_ids = ids;
		_attributes = attributes;
	}
	
}
