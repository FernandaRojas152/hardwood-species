package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/**
 * @version September 15th 2020
 * @author Fernanda A00352189
 * Class Main1
 * made with HashMap of Java
 */
public class Main1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		/** HashMap of Java that represents the group of trees */
		HashMap<String, Integer> tree;

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
			tree=new HashMap<String, Integer>();
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
			/**for(Map.Entry<String, Integer> me : tree.entrySet()) {
				//shows 4 decimals it's used %.4f o DecimalFormat d = new DecimalFormat("#.####");
				String key = me.getKey();
				Integer total = me.getValue();
				double p= (total*1.0/size)*PERCENTAGE;

				System.out.printf("%s %.4f\n", key, p);
				//System.out.println(key+ " "+ df.format(p));
			}*/

			ArrayList<String> a= new ArrayList<>(tree.keySet());
			Collections.sort(a, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2 ) {
					return o1.compareTo(o2);
				}
			});
			for(int j=0; j<a.size(); j++) {
				int total= tree.get(a.get(j));
				double p= (total*1.0/size)*PERCENTAGE;
				System.out.printf("%s %.4f\n", a.get(j), p);
			}
			if (i<cases-1) {
				System.out.println(" ");
			}
		}
	}
}
