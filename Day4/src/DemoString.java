
public class DemoString {
   public static void main(String[] args) {
	String name = "citi";
	System.out.println("initial value of name:"+name);
	//name = name.concat(",Pune");
	//System.out.println("value of name after concatation:"+name);
    String name1 = new String("citi");
    if (name1.equals(name)) {
    	System.out.println("equals");
    }
    else
    {
    	System.out.println("not equal");
    }
   
   //name1.length()
   System.out.println(name1.indexOf(name1));
   System.out.println(name1.length());
   System.out.println(name1.endsWith(name));
   System.out.println(name1.toCharArray());
   System.out.println(name1.charAt(2));
   System.out.println(name1.codePointAt(2));
   System.out.println(name1.substring(2));
   System.out.print(name1.charAt(1));
   System.out.print(name1.charAt(2));
   System.out.print(name1.charAt(3));
   System.out.println(name1.charAt(0));
   System.out.println(name1);
   
   
   
   
   
   }
}
 