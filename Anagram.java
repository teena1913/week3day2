package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="race";
		String text2="care";
		if(text1.length()==text2.length()) {
			char[] arr=text1.toCharArray();
			char[] arr2=text2.toCharArray();
			Arrays.sort(arr);
			Arrays.sort(arr2);
			if(Arrays.equals(arr, arr2)) {
				System.out.println("anagram");
			}
			else {
			   System.out.println("not an anagram");
			}
		
		}
	}
}