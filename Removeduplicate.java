package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicate {

	public static void main(String[] args) {
	String str="Paypal India";
	char[] arr=str.toLowerCase().toCharArray();
	Set<Character>strset=new LinkedHashSet<Character>();
	Set<Character>dupset=new LinkedHashSet<Character>();
for(Character character:arr) {
	if(strset.add(character)) {
		dupset.add(character);
		
	}
}
System.out.println(dupset);
strset.removeAll(strset);
for(Character output:strset) {
	if(output!=' ') {
		System.out.println(output);
	}
	
}
	}

}
