
public class Demo1DObjects {
public static void main(String[] args) {
	Person[] persons;
	persons = new Person[5];
	persons[0] = new Person();
	persons[1] = new Person(12, "A");
	persons[2] = new Person(120, "B");
	persons[3] = new Person(30, "C");
	persons[4] = new Person(14, "A123");
	
	 for (int i=0;i<5;i++) 
     {
     	//System.out.println(persons[i].display());
		 persons[i].display();
     }
	 
     /*for(Person x:persons) {
     	System.out.println(x);
     }
	
	//persons[3].display();
}*/

}
}
