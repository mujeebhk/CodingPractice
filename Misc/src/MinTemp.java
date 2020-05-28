import java.util.Scanner;

public class MinTemp {

	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        in.next();
        String line;
        //int[] vals = new int[N];
        int min = 1000000;
        while (in.hasNext()) {
        	line = in.next();
        	//String strVals[] = line.split(" ");
        	//for (int i=0; i<strVals.length; i++) {
        		int temp = Integer.parseInt(line);
        		if (Math.abs(min) > Math.abs(temp))
                    min = temp;
        	//}
        		
        } 
        if (min == 1000000) {
        	System.out.println(0);
        	return;
        }
        
        
            System.out.println(min);
    }
}
