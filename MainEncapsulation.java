class Main
 {
  public String name; 
  public String getName() 
{
    return name;
  }
  public void setName(String newName)
 {
    this.name = newName;
  }
}

public class MainEncapsulation
{
  public static void main(String[] args) 
	{
    		 Main myObj = new  Main();
    		myObj.setName("Maryam"); 
   		System.out.println(myObj.getName());
  	}
}