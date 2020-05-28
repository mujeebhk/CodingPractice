package com.acme.search;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadFile {

	public static Map<String, Integer> populateMap(String filename) throws IOException {

		Map<String, Integer> map = new HashMap<>();
		File f1 = new File(filename); // Creation of File Descriptor for input file
		String[] words = null; // Intialize the word Array
		FileReader fr = new FileReader(f1); // Creation of File Reader object
		BufferedReader br = new BufferedReader(fr); // Creation of BufferedReader object
		String s;
		
		
		while ((s = br.readLine()) != null) // Reading Content from the file
		{
			words = s.split(" "); // Split the word using space
			for (String word : words) {
				if (map.get(word) == null) {
					map.put(word, 1);
				} else {
					map.put(word, (map.get(word) + 1));
				}
			}
		}
		

		fr.close();

		return map;
	}
	
	public static void main(String [] args) {
		String[] filenames = {"testing.txt","testing2.txt","testing3.txt"};
		//String[] filenames = {"testing.txt"};
		
		for (int i=0; i<filenames.length; i++) {
			String filename = filenames[i];
		new Thread( () -> {
		try {
			
			Map<String, Integer> result = populateMap(filename);
			result.forEach((key, count)-> {
				System.out.println("Key :" +key +" Count : "+count);
			});
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}).start();
		
		}
		
	}

}
