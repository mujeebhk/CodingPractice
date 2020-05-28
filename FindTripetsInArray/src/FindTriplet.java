import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindTriplet {

	
	private static Set<String> result= new HashSet<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int price[] = {0, -1, 2, -3, 1, 4,-4,5,-5}; 
		int n = price.length; 

		findTriplets(price, 0, 0, 3, ""); 

		Iterator itr = result.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	static void findTriplets (int[] list, int pointer, int sum, int numbersLeft, String previousNumbers) {
		if (pointer == list.length) 
			return;
		
		int currentNumber = list[pointer];
		//System.out.println("sum = " + (sum+currentNumber));
		// Do nothing
		findTriplets (list, pointer+1, sum, numbersLeft, previousNumbers);
		
		//Add the number
		if (numbersLeft == 1) {
			if (0 == (sum+list[pointer])) {
				result.add(previousNumbers+":"+ Integer.toString(list[pointer]));
				return;
			}
		} else {
			previousNumbers+=":"+ Integer.toString(list[pointer]);
			findTriplets(list, pointer+1, sum+list[pointer], numbersLeft-1, previousNumbers);
		}
		
		
		//
	}

}
