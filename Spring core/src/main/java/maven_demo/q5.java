package maven_demo;
import javax.annotation.Resource;
import javax.inject.Inject;
public class q5 {
	@Inject
	xyz name;
    @Resource
    compatetor comp;
    private String size;
    
		public String getSize() 
		{	
		return size;
	    }
   
	public void setSize(String size)
    {
		this.size = size;
	}

		void print() {
			System.out.println(size);
			name.bre();
			System.out.println(comp.toString());
		}
}
class xyz
{
	private String Name;
	private int roll;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	void bre() {
		System.out.println(Name+" "+roll);
	}
}
class compatetor{
	private String Names;

	public String getNames() {
		return Names;
	}

	public void setNames(String names) {
		Names = names;
	}
	@Override
	public String toString() 
	{
		return "compatetor [Names=" + Names + "]";
	}
}
