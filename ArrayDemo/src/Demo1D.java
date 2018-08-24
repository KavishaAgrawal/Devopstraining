
public class Demo1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] numbers;
        numbers = new int [5];
        numbers[0]=10;
        numbers[1]=200;
        numbers[2]=100;
        numbers[3]=50;
        numbers[4]=40;
     // int sum = add(numbers);
        System.out.println("numbers:-"+numbers[0]);
       
        for (int i=0;i<5;i++) 
        {
        	System.out.println(numbers[i]);
        }
        for(int x:numbers) {
        	System.out.println(x);
        }
	}
//public static int add(int[] numbers) {
//return (numbers[0]+numbers[1]+numbers[2]);
//

}
