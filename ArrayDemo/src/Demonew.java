
public class Demonew {
        public static void main(String[] args) {
        	int[][]values = new int [3][];
        	
        	values[0]=new int [4];
        	values[0][0]=12;
        	values[0][1]=34;
        	values[0][2]=44;
        	values[0][3]=54;
        	
            values[1]=new int [4];
            values[1][0]=34;
            values[1][1]=55;
            values[1][2]=65;
            values[1][3]=78;
            
            values[2]=new int [3];
            values[2][0]=90;
            values[2][1]=23;
            values[2][2]=90;
            
        int i = 0, j=0;
            while (i<values.length) {
           	 while (j<values[i].length) {
           		 System.out.print(values[i][j]+"\t"+",");
           		 j++;
           		 
           	 }
           	 System.out.println();
           	i++;
     
            
            
		}
}
}

