package encyclo;

import java.util.HashMap;
import java.util.Map;

import com.google.protobuf.Descriptors.Descriptor;

import encyclo.Models.Entity;

public class Database {

	public static final Map TABLES = new HashMap<String, String>();
	
	private Entity _entity = Entity.newBuilder().build();
	
	public Database(Descriptor model, FieldIndex index) {
		
	}
	
	public static void main(String[] args) {
		Database database = new Database(Entity.getDescriptor(), new IdFieldIndex(Entity.ID_FIELD_NUMBER));
	}
	
}