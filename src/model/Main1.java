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
 * made with HashMap of Java
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

		/** An integer that represents the one hundred percent, the total of trees*/
		final int PERCENTAGE= 100;
		
		/** Amount of times a key it's appearing*/
		int rep=0;
		
		/** The first line, that it's going to be the empty line*/
		String line= br.readLine();
		
		/** An integer that represents the total of trees that the user inputs*/
		int size= 0;
		
		/**
		 * pre:
		 * pos:
		 */
		for (int i = 0; i < cases; i++) {
			while((line= br.readLine())!=null && !line.isEmpty()) {
				if(tree.containsKey(line)) {
					rep= tree.get(line);
					tree.put(line, rep+1);
				}else {
					tree.put(line, 1);
				}
				size++;
			}
			
			/**
			 * how to loop in hashMap? Map.Entry<K,V>
			 * entrySet() shows all the maps, set viewing of the mappings in the map (API)
			 */
			for(Map.Entry<String, Integer> me : tree.entrySet()) {
				//to round it to 4 decimals it's used %.4f o DecimalFormat d = new DecimalFormat("#.####");
				String key = me.getKey();
				Integer total = me.getValue();
				System.out.printf("%.4f", key, (total/size)*PERCENTAGE);
			}
			if (i<cases-1) {
				System.out.println(" ");
			}
		}
	}
}
