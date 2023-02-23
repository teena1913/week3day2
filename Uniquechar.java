package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class Uniquechar {

	public static void main(String[] args) {
		String name="teena";
		char[] arr=name.toCharArray();
		Set<Character>unique=new HashSet<Character>();
		for(Character output:arr) {
			if(!unique.add(output)) { //b,a,u
				unique.remove(output); //a,u
			}
		}
		System.out.println(unique);
	}
	

}
