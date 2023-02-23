package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissNum {

	public static void main(String[] args) {
	int[] num= {3,2,2,4,5,1,6,7,9};
	Set<Integer>numset=new TreeSet<Integer>();
	for(Integer output:num) {
		numset.add(output);
	}
List<Integer>ans=new ArrayList<Integer>(numset);	
	for(int i=0;i<ans.size();i++) {
		if(ans.get(i)!=i+1) {
			System.out.print(i+1);
			
		}
	}
	}
}
