import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ChefGustau {

	private static String FIBER = "FIBER";
	private static String FAT = "FAT";
	private static String CARB = "CARB";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String finalAnwser = "";
		Scanner in = new Scanner(System.in);
        int numberOfDays = in.nextInt();
        int numberOfIngredients = in.nextInt();
        int sixtyPercent = (int) Math.round((numberOfIngredients+.5) * 0.6);
        List <String> ingredients = new ArrayList<String>();
        for (int i = 0; i < numberOfDays; i++) {
            String ingredientId = in.next();
            //System.out.println(ingredientId);
            ingredients.add(ingredientId);
        }
        List<String> top3 = topThreeIngredients(ingredients);
        
        //if (ingredients.get(0).startsWith(top3.get(0))) {
        	boolean sixty = checkSixtyPercentPresent(ingredients, top3.get(0), sixtyPercent);
        	if (sixty) {
        		finalAnwser = buildFinal(ingredients, top3.get(0), numberOfIngredients);
        	} else {
        		boolean sixty1 = checkSixtyPercentPresent(ingredients, top3.get(1), sixtyPercent);
        		if(sixty1) {
        			finalAnwser = buildFinal(ingredients, top3.get(1), numberOfIngredients);
        		} else {
        			finalAnwser = buildFinal(ingredients, top3.get(2), numberOfIngredients);
        		}
        	}
      System.out.println(finalAnwser);
        
	}

	
	private static String buildFinal(List<String> ingredients, String topIng, int noOfIngredients) {
		// TODO Auto-generated method stub
		
		return null;
	}

	

	private static List<String> topThreeIngredients(List<String> ingredients) {
		// TODO Auto-generated method stub
		List<String> res = new ArrayList<String>();
		if(ingredients.get(0).startsWith(FIBER)) {
			res.add(FIBER);
			get2ndIng(ingredients, FIBER, res);
		} else if (ingredients.get(0).startsWith(FAT)) {
			res.add(FAT);
			get2ndIng(ingredients, FAT, res);
		} else {
			res.add(CARB);
			get2ndIng(ingredients, CARB, res);
		}
		return res;
	}


	private static void get2ndIng(List<String> ingredients, String topIng, List<String> res) {
		// TODO Auto-generated method stub
		Iterator <String> itr = ingredients.iterator();
		while (itr.hasNext()) {
			String temp = "";
			if (temp.startsWith(topIng))
				continue;
			if (temp.startsWith(CARB)) {
				res.add(CARB);
				if (res.contains(FIBER))
					res.add(FAT);
				else 
					res.add(FIBER);
			} else if (temp.startsWith(FIBER)){
				res.add(FIBER);
				if (res.contains(CARB))
					res.add(FAT);
				else 
					res.add(CARB);
			}else {
				res.add(FAT);
				if (res.contains(CARB))
					res.add(FIBER);
				else 
					res.add(CARB);
			}
		}
	}


	public static int total = 0;
	private static boolean checkSixtyPercentPresent(List<String> ingredients, String type, int sixtyPercent) {
		// TODO Auto-generated method stub
		//int total = 0 ;
		ingredients.forEach((a)-> {
			a.startsWith(type);
			total++;
		});
		if (total > sixtyPercent)
			return true;
		return false;
	}

}
