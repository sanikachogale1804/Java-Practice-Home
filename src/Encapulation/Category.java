package Encapulation;

public class Category {
	
	private int id;
	private String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}

	public String getName()
	{
		return this.name;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
	Category()
	{
		
	}
	
	Category(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
}
