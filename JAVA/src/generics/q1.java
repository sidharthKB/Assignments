package generics;
import java.util.HashSet;
import java.util.Objects;
class Employe{
	int id;
	String Name;
	int Salary;
	String Department;
	public  Employe(int id, String name, int salary, String department) {
		this.id = id;
		Name = name;
		Salary = salary;
		Department = department;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", Name=" + Name + ", Salary=" + Salary + ", Department=" + Department + "]";
	}
}
public class q1 {
	public static void main(String[] args) {
		HashSet<Employe> ob = new HashSet<Employe>();
		ob.add(new Employe(1,"Saxena",21000,"CSE"));
		ob.add(new Employe(2,"Amal",31000,"Mec"));
		ob.add(new Employe(3,"Kishore",27000,"CSE"));
		ob.add(new Employe(4,"Rick",40000,"Civil"));
		ob.add(new Employe(2,"Zaheer",32000,"EEE"));
		for (Employe a : ob) {
			System.out.println(a);
		}
	}
}

