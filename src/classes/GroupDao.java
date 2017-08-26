package classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GroupDao extends Group {
	public Map<Integer, String> groups = new HashMap<>();

	public GroupDao(String name, int id) {
		super(name, id);

	}

	public void ListOfGroups() {
		Set<Entry<Integer, String>> entrySet = groups.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

	public void addGroup(Group group) {

		groups.put(this.id, this.name);
		System.out.println("Group added!");
	}

	public String editGroup(int id, int newId) {
		Set<Integer> keySet = groups.keySet();
		for (Integer key : keySet) {
			if (key == id) {
				String name = groups.get(key);
				groups.remove(key, name);
				groups.put(newId, name);
			}
		}
		return "Group changed";
	}
	
	
	public String deleteGroup(int id){
		String name = groups.get(id);
		groups.remove(id, name);
		return "Group deleted";
	}
	public String showGroup(Group group){
		
		return "id "+this.id+", name " + this.name;
	}
}
