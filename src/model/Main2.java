package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

import datastructure.HTable;


/**
 * @version September 16th 2020
 * @author Fernanda
 * Made with my own implementation of HashTable
 * Class Main2
 */

public class Main2{	
	public static void main(String[] args) throws NumberFormatException, IOException {
		/** */
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int cases= Integer.parseInt(br.readLine());
		String line= br.readLine();
		
		for(int i=0; i<cases; i++) {
			HTable<String, Integer> map= new HTable<>();
			ArrayList<String> tree= new ArrayList<>(); 
			double size=0;
			int temp=0;
			
			while((line= br.readLine())!=null && !line.isEmpty()) {
				if(!map.contains(line)) {
					tree.add(line);
				}
				map.insert(line, temp+1);
				size++;
			}
			
			Collections.sort(tree);
			StringBuilder builder= new StringBuilder();
			for (String e : tree) {
				builder.append(String.format("%s %.4f\n",e, (map.getSlot(e)/size)*100.0));
			}
			
			if(i< cases-1) {
				System.out.println(builder.toString());
			}else
				System.out.print(builder.toString());
		}
	}

}
