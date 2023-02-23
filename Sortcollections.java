package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sortcollections {

	public static void main(String[] args) {
		String name= "Wipro, HCL , CTS, Aspire Systems";
		List<String>namelist=new ArrayList<String>(Arrays.asList(name));
		Collections.sort(namelist);
     List<String>output =new ArrayList<String>();
		for(int i=namelist.size()-1;i>=0;i--) {
			output.add(namelist.get(i));

		}
		System.out.println(output);
	}
}
