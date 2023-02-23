package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Findseclarnum {
	public static void main(String[] args) {
			int[] data = {3,2,11,4,6,7,2,3,3,6,7};
			Set <Integer> setvalue=new TreeSet<Integer>();
		for(int i=0;i<=data.length-1;i++) {
	          setvalue.add(data[i]);
		}
	List<Integer>datalist=new ArrayList<Integer>(setvalue);

	System.out.println(datalist.get(datalist.size()-2));

		}

	}



