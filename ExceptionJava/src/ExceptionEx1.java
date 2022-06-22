
public class ExceptionEx1 {

	public static void main(String[] args) {
String s="java";
try {
int i=10/5;
System.out.println(i);
}
catch(Exception e)
{
	e.getLocalizedMessage();
	System.out.println("catch block is executed");
}

/*catch(NullPointerException e)
{
	System.out.println("catch block:"+e.getMessage());
}
catch(ArithmeticException e)
{
	System.out.println("catch block:"+e.getMessage());
}*/

/*try {
	
String s1=s.concat("hi");
System.out.println(s1);
System.out.println();
System.out.println("try block excuted");
}
catch(Exception e)
{
	e.getLocalizedMessage();
	System.out.println("catch block is executed");
}*/
	}

}
