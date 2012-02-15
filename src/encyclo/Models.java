// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models.proto

package encyclo;

public final class Models {
  private Models() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class Entity extends
      com.google.protobuf.GeneratedMessage {
    // Use Entity.newBuilder() to construct.
    private Entity() {
      initFields();
    }
    private Entity(boolean noInit) {}
    
    private static final Entity defaultInstance;
    public static Entity getDefaultInstance() {
      return defaultInstance;
    }
    
    public Entity getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return encyclo.Models.internal_static_encyclo_Entity_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return encyclo.Models.internal_static_encyclo_Entity_fieldAccessorTable;
    }
    
    // optional int32 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private boolean hasId;
    private int id_ = 0;
    public boolean hasId() { return hasId; }
    public int getId() { return id_; }
    
    // repeated .encyclo.Document documents = 2;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    private java.util.List<encyclo.Models.Document> documents_ =
      java.util.Collections.emptyList();
    public java.util.List<encyclo.Models.Document> getDocumentsList() {
      return documents_;
    }
    public int getDocumentsCount() { return documents_.size(); }
    public encyclo.Models.Document getDocuments(int index) {
      return documents_.get(index);
    }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasId()) {
        output.writeInt32(1, getId());
      }
      for (encyclo.Models.Document element : getDocumentsList()) {
        output.writeMessage(2, element);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getId());
      }
      for (encyclo.Models.Document element : getDocumentsList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, element);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static encyclo.Models.Entity parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static encyclo.Models.Entity parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static encyclo.Models.Entity parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static encyclo.Models.Entity parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static encyclo.Models.Entity parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static encyclo.Models.Entity parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static encyclo.Models.Entity parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static encyclo.Models.Entity parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static encyclo.Models.Entity parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static encyclo.Models.Entity parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(encyclo.Models.Entity prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private encyclo.Models.Entity result;
      
      // Construct using encyclo.Models.Entity.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new encyclo.Models.Entity();
        return builder;
      }
      
      protected encyclo.Models.Entity internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new encyclo.Models.Entity();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return encyclo.Models.Entity.getDescriptor();
      }
      
      public encyclo.Models.Entity getDefaultInstanceForType() {
        return encyclo.Models.Entity.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public encyclo.Models.Entity build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private encyclo.Models.Entity buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public encyclo.Models.Entity buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.documents_ != java.util.Collections.EMPTY_LIST) {
          result.documents_ =
            java.util.Collections.unmodifiableList(result.documents_);
        }
        encyclo.Models.Entity returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof encyclo.Models.Entity) {
          return mergeFrom((encyclo.Models.Entity)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(encyclo.Models.Entity other) {
        if (other == encyclo.Models.Entity.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (!other.documents_.isEmpty()) {
          if (result.documents_.isEmpty()) {
            result.documents_ = new java.util.ArrayList<encyclo.Models.Document>();
          }
          result.documents_.addAll(other.documents_);
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setId(input.readInt32());
              break;
            }
            case 18: {
              encyclo.Models.Document.Builder subBuilder = encyclo.Models.Document.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addDocuments(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      
      // optional int32 id = 1;
      public boolean hasId() {
        return result.hasId();
      }
      public int getId() {
        return result.getId();
      }
      public Builder setId(int value) {
        result.hasId = true;
        result.id_ = value;
        return this;
      }
      public Builder clearId() {
        result.hasId = false;
        result.id_ = 0;
        return this;
      }
      
      // repeated .encyclo.Document documents = 2;
      public java.util.List<encyclo.Models.Document> getDocumentsList() {
        return java.util.Collections.unmodifiableList(result.documents_);
      }
      public int getDocumentsCount() {
        return result.getDocumentsCount();
      }
      public encyclo.Models.Document getDocuments(int index) {
        return result.getDocuments(index);
      }
      public Builder setDocuments(int index, encyclo.Models.Document value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.documents_.set(index, value);
        return this;
      }
      public Builder setDocuments(int index, encyclo.Models.Document.Builder builderForValue) {
        result.documents_.set(index, builderForValue.build());
        return this;
      }
      public Builder addDocuments(encyclo.Models.Document value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.documents_.isEmpty()) {
          result.documents_ = new java.util.ArrayList<encyclo.Models.Document>();
        }
        result.documents_.add(value);
        return this;
      }
      public Builder addDocuments(encyclo.Models.Document.Builder builderForValue) {
        if (result.documents_.isEmpty()) {
          result.documents_ = new java.util.ArrayList<encyclo.Models.Document>();
        }
        result.documents_.add(builderForValue.build());
        return this;
      }
      public Builder addAllDocuments(
          java.lang.Iterable<? extends encyclo.Models.Document> values) {
        if (result.documents_.isEmpty()) {
          result.documents_ = new java.util.ArrayList<encyclo.Models.Document>();
        }
        super.addAll(values, result.documents_);
        return this;
      }
      public Builder clearDocuments() {
        result.documents_ = java.util.Collections.emptyList();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:encyclo.Entity)
    }
    
    static {
      defaultInstance = new Entity(true);
      encyclo.Models.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:encyclo.Entity)
  }
  
  public static final class Document extends
      com.google.protobuf.GeneratedMessage {
    // Use Document.newBuilder() to construct.
    private Document() {
      initFields();
    }
    private Document(boolean noInit) {}
    
    private static final Document defaultInstance;
    public static Document getDefaultInstance() {
      return defaultInstance;
    }
    
    public Document getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return encyclo.Models.internal_static_encyclo_Document_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return encyclo.Models.internal_static_encyclo_Document_fieldAccessorTable;
    }
    
    // optional int32 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private boolean hasId;
    private int id_ = 0;
    public boolean hasId() { return hasId; }
    public int getId() { return id_; }
    
    // repeated .encyclo.Entity entities = 2;
    public static final int ENTITIES_FIELD_NUMBER = 2;
    private java.util.List<encyclo.Models.Entity> entities_ =
      java.util.Collections.emptyList();
    public java.util.List<encyclo.Models.Entity> getEntitiesList() {
      return entities_;
    }
    public int getEntitiesCount() { return entities_.size(); }
    public encyclo.Models.Entity getEntities(int index) {
      return entities_.get(index);
    }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasId()) {
        output.writeInt32(1, getId());
      }
      for (encyclo.Models.Entity element : getEntitiesList()) {
        output.writeMessage(2, element);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getId());
      }
      for (encyclo.Models.Entity element : getEntitiesList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, element);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static encyclo.Models.Document parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static encyclo.Models.Document parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static encyclo.Models.Document parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static encyclo.Models.Document parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static encyclo.Models.Document parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static encyclo.Models.Document parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static encyclo.Models.Document parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static encyclo.Models.Document parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static encyclo.Models.Document parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static encyclo.Models.Document parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(encyclo.Models.Document prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private encyclo.Models.Document result;
      
      // Construct using encyclo.Models.Document.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new encyclo.Models.Document();
        return builder;
      }
      
      protected encyclo.Models.Document internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new encyclo.Models.Document();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return encyclo.Models.Document.getDescriptor();
      }
      
      public encyclo.Models.Document getDefaultInstanceForType() {
        return encyclo.Models.Document.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public encyclo.Models.Document build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private encyclo.Models.Document buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public encyclo.Models.Document buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.entities_ != java.util.Collections.EMPTY_LIST) {
          result.entities_ =
            java.util.Collections.unmodifiableList(result.entities_);
        }
        encyclo.Models.Document returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof encyclo.Models.Document) {
          return mergeFrom((encyclo.Models.Document)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(encyclo.Models.Document other) {
        if (other == encyclo.Models.Document.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (!other.entities_.isEmpty()) {
          if (result.entities_.isEmpty()) {
            result.entities_ = new java.util.ArrayList<encyclo.Models.Entity>();
          }
          result.entities_.addAll(other.entities_);
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setId(input.readInt32());
              break;
            }
            case 18: {
              encyclo.Models.Entity.Builder subBuilder = encyclo.Models.Entity.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addEntities(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      
      // optional int32 id = 1;
      public boolean hasId() {
        return result.hasId();
      }
      public int getId() {
        return result.getId();
      }
      public Builder setId(int value) {
        result.hasId = true;
        result.id_ = value;
        return this;
      }
      public Builder clearId() {
        result.hasId = false;
        result.id_ = 0;
        return this;
      }
      
      // repeated .encyclo.Entity entities = 2;
      public java.util.List<encyclo.Models.Entity> getEntitiesList() {
        return java.util.Collections.unmodifiableList(result.entities_);
      }
      public int getEntitiesCount() {
        return result.getEntitiesCount();
      }
      public encyclo.Models.Entity getEntities(int index) {
        return result.getEntities(index);
      }
      public Builder setEntities(int index, encyclo.Models.Entity value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.entities_.set(index, value);
        return this;
      }
      public Builder setEntities(int index, encyclo.Models.Entity.Builder builderForValue) {
        result.entities_.set(index, builderForValue.build());
        return this;
      }
      public Builder addEntities(encyclo.Models.Entity value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.entities_.isEmpty()) {
          result.entities_ = new java.util.ArrayList<encyclo.Models.Entity>();
        }
        result.entities_.add(value);
        return this;
      }
      public Builder addEntities(encyclo.Models.Entity.Builder builderForValue) {
        if (result.entities_.isEmpty()) {
          result.entities_ = new java.util.ArrayList<encyclo.Models.Entity>();
        }
        result.entities_.add(builderForValue.build());
        return this;
      }
      public Builder addAllEntities(
          java.lang.Iterable<? extends encyclo.Models.Entity> values) {
        if (result.entities_.isEmpty()) {
          result.entities_ = new java.util.ArrayList<encyclo.Models.Entity>();
        }
        super.addAll(values, result.entities_);
        return this;
      }
      public Builder clearEntities() {
        result.entities_ = java.util.Collections.emptyList();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:encyclo.Document)
    }
    
    static {
      defaultInstance = new Document(true);
      encyclo.Models.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:encyclo.Document)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_encyclo_Entity_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_encyclo_Entity_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_encyclo_Document_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_encyclo_Document_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014models.proto\022\007encyclo\":\n\006Entity\022\n\n\002id\030" +
      "\001 \001(\005\022$\n\tdocuments\030\002 \003(\0132\021.encyclo.Docum" +
      "ent\"9\n\010Document\022\n\n\002id\030\001 \001(\005\022!\n\010entities\030" +
      "\002 \003(\0132\017.encyclo.EntityB\t\n\007encyclo"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_encyclo_Entity_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_encyclo_Entity_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_encyclo_Entity_descriptor,
              new java.lang.String[] { "Id", "Documents", },
              encyclo.Models.Entity.class,
              encyclo.Models.Entity.Builder.class);
          internal_static_encyclo_Document_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_encyclo_Document_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_encyclo_Document_descriptor,
              new java.lang.String[] { "Id", "Entities", },
              encyclo.Models.Document.class,
              encyclo.Models.Document.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}