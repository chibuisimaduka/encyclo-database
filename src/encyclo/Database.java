package encyclo;

import java.util.HashMap;
import java.util.Map;

import com.google.protobuf.Descriptors.Descriptor;

import encyclo.Models.Entity;

public class Database {

	public static final Map<Integer, String> TABLES = new HashMap<Integer, String>();
	
	private Entity _entity = Entity.newBuilder().build();
	
	public Database(Descriptor model, FieldIndex index) {
		
	}
	
	public static void main(String[] args) {
		Database database = new Database(Entity.getDescriptor(),
				new IdFieldIndexFactory(new int[]{Entity.ID_FIELD_NUMBER}, 
					new ListFieldsIndexFactory()));
	}
	
}