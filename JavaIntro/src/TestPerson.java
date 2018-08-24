
public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //cls_name ref_name;
		Person p;
		//ref_name=new Cls_name();
		p=new Person();
		//ref_name.name_of_function();
		//p.setValues(12,"city");
		p.display();
		
		Person p1;
		//ref_name=new Cls_name();
		p1=new Person(123,"abcd");
		//ref name.name_of_function();
		
		//p1.setValues();
		p1.display();
		p1.setAge(1000);
		p1.display();
		
	}

}
