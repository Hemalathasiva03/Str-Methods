import java.util.Scanner;

public class StringMain 
{
public static void main(String[] args) 
{
System.out.println("Enter The String : "); 
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();            //String str ="hema latha";
StringMethods obj=new StringMethods(str);
System.out.println(obj.CharAt(3)); 
System.out.println(obj.CodePointAt(6));  
System.out.println(obj.CodePointBefore(3)); 
System.out.println(obj.CodePointCount(1, 4)); 
System.out.println(obj.compareTo("hema latha")); 
System.out.println(obj.compareToIgnorecase("HEMA LATHA")); 
System.out.println(obj.concat("marimuthu")); 
System.out.println(obj.contains("h"));
System.out.println(obj.ContentEquals("hema latha"));
System.out.println(obj.equals("hema latha"));
System.out.println(obj.equalsIgnorecase("HEMA LATHA"));
System.out.println(obj.Indexof("hema"));
System.out.println(obj.isEmpty());
System.out.println(obj.toUppercase());
System.out.println(obj.toLowercase());
System.out.println(obj.toString());
System.out.println(obj.replace('a','s'));

}

}