package practice.java;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class HashMapKey {
	public static void main(String[] args) {
		Map<Employee, Integer> map = new HashMap<>();
		map.put(new Employee(1, "Sonu", new Date()), 1);
		map.put(new Employee(1, "Sonu", new Date()), 1);
		map.put(new Employee(2, "Singh", new Date()), 2);
		map.put(new Employee(3, "Gautam", new Date()), 3);
		map.put(new Employee(4, "Raj", new Date()), 4);
		System.out.println(map);
	}
}

class Employee{
	private int id;
	private String name;
	private Date date;
	
	public Employee(int id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
//		result = prime * result + ((date == null) ? 0 : date.hashCode());
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (date == null) {
//			if (other.date != null)
//				return false;
//		} else if (!date.equals(other.date))
//			return false;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
}