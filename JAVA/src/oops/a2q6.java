package oops;

abstract class Persistence 
{
    abstract public String persist();
}
class FilePersistence extends Persistence
{
    public String persist() 
    {
    	return "FilePersistance";
    }
}
class DatabasePersistence extends Persistence
{
    public String persist()
    {
    	return "DatabasePersistence";
    }
}
class Persistenceprovider
{
	public static Persistence getPersistence()
	{
		return new FilePersistence();
	}
}
public class a2q6 
{
	public static void main(String[] args) 
	{
		Persistence f=Persistenceprovider.getPersistence();
        System.out.println(f.persist());
	}
}
