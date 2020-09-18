package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @version September 15th 2020
 * @author Fernanda A00352189
 * Class Main1
 * made with HashMap of Java
 */
public class Main1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		/** 
		 * It's used BufferedReader instead of Scanner to read the data because BufferedReader has
		 * more memory than a Scanner, so it is useful for long strings(which is this case)
		 * A little bit faster than Scanner, Buffer has better timings.
		 * Also works better with multiple threads.
		 */
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		/** The amount of test cases that are going to happen*/
		int cases= Integer.parseInt(br.readLine());


		/** The first line, that it's going to be the empty line*/
		String line=br.readLine();

		/**
		 * pre:
		 * pos:
		 */
		for (int i = 0; i < cases; i++) {
			HashMap<String, Integer> tree=new HashMap<String,Integer>();
			ArrayList<String> a= new ArrayList<>();
			double size= 0;
			while((line= br.readLine())!=null && !line.isEmpty()) {
				if(!tree.containsKey(line)) {
					a.add(line);
				}
				tree.put(line, tree.getOrDefault(line,0)+1);
				size++;
			}
			/**
			 * how to loop in hashMap? Map.Entry<K,V> m: tree.entrySet()
			 * entrySet() shows all the maps, set viewing of the mappings in the map (API)
			 */
			Collections.sort(a);
			StringBuilder builder=new StringBuilder();
			for(String t : a) {
				//shows 4 decimals it's used %.4f o DecimalFormat d = new DecimalFormat("#.####");
				builder.append(String.format("%s %.4f\n", t, (tree.get(t)/size)*100.0));
			}
			if (i<cases-1) {
				System.out.println(builder.toString());
			}else {
				System.out.print(builder.toString());
			}
		}
	}
}
