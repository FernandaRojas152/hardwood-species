package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @version September 15th 2020
 * @author Fernanda A00352189
 * Class Main1
 * Made with HashMap of Java
 */
public class Main1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		/** HashMap of Java that represents the group of trees */
		HashMap<String, Integer> tree= new HashMap<String, Integer>();

		/** 
		 * It's used BufferedReader instead of Scanner to read the data because BufferedReader has
		 * more memory than a Scanner, so it is useful for long strings(which is this case)
		 * A little bit faster than Scanner, Buffer has better timings.
		 * Also works better with multiple threads.
		 */
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		/** The amount of test cases that are going to happen*/
		int cases= Integer.parseInt(br.readLine());
		
		/** */
		String line= br.readLine();
		
		/** */
		int size= 0;
		//tree.put("Ash", 1); just testing lol
		for (int i = 0; i < cases; i++) {
			while(line!=null && !line.isEmpty()) {
				size++;
			}
		}
		/**
		 * how to loop in hashMap? Map.Entry<K,V>
		 * entrySet() shows all the maps, set viewing of the mappings in the map (API)
		 */
		for(Map.Entry<String, Integer> me : tree.entrySet()) {
			//to round it to 4 decimals it's used %.4f o DecimalFormat d = new DecimalFormat("#.####");
			String key = me.getKey();
			Integer value = me.getValue();
			System.out.printf("%.4f", key, value/size);
		}
	}
}
