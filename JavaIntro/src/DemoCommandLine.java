public class DemoCommandLine {
	public static void main(String[] args)
	{
		System.out.println("num of argument:-"+args.length);
		//System.out.println("argument:-"+args[0]);
		//String sum = args[0]+ args[1]+args[2];
//		int a = Integer.parseInt(args[0]);
//		int b = Integer.parseInt(args[1]);
//		int c = Integer.parseInt(args[2]);
		
		int sum = 0;
		

		for(String arg: args){
	sum = sum+Integer.parseInt(arg);
	
		}
	System.out.println(sum);
	}
}
