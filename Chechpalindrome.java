package week3.day2;

public class Chechpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss="madam";
		String rev="";
		char [] chararr=ss.toCharArray();
			for(int i=chararr.length-1;i>=0;i--) {
				rev=rev+chararr[i];
			}
			if(ss.equalsIgnoreCase(rev)){
				System.out.println("palindrome");
			}
			else {
			System.out.println("not palindrome");
			}
		}
		
}

