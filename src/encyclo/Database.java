package encyclo;

import java.util.HashMap;
import java.util.Map;

import encyclo.Models.Entity;

public class Database {

	private static final Map TABLES = new HashMap<String, String>();
	
	private Entity _entity = Entity.newBuilder().build();
	
	public Database() {
	}
	
	public static void main(String[] args) {
		Database database = new Database(Entity.getDescriptor());
	}
	
}