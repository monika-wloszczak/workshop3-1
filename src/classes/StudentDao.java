package classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentDao extends Student{
	public StudentDao(int studentId, String name, String lastName, int age, String email, int groupId) {
		super(studentId, name, lastName, age, email, groupId);
		// TODO Auto-generated constructor stub
	}

Map<Integer, String>students = new HashMap<>();

public void ListOfStudents() {
	Set<Entry<Integer, String>> entrySet = students.entrySet();
	for (Entry<Integer, String> entry : entrySet) {
		System.out.println(entry.getKey() + " " + entry.getValue());
	}
}
	public String addStudent(int studentId, String name, String lastName, int age, String email, int groupId){
	students.put(this.studentId, this.name + " " +this.lastName+ " " +this.age+ " " +this.groupId+ " " +this.email );
		
		
		return "student added";	
	}
	public String removeStudent(int id){
		String student = students.get(id);
		students.remove(id,student);
		return "student removed";
	}
	public String showStudent(int id){
		String student = students.get(id);
		return "ID: " + "Student: " +student; 
	}
	
	public String editStudentId(int id, int newId){
		Set<Integer> keySet = students.keySet();
		for (Integer key : keySet) {
			if (key == id) {
				String name = students.get(key);
				students.remove(key, name);
				students.put(newId, name);
			}
		}
		return "Student data edited";
	}

	public String editStudentData(int id, String newData){
		Set<Integer> keySet = students.keySet();
		for (Integer key : keySet) {
			if (key == id) {
				String name = students.get(key);
				students.remove(key, name);
				students.put(id, newData);
			}
		}
		return "Student data edited";
	}

}
