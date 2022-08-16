package week2day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
	       String str1="stops";
	       String str2="potss";
	       char [] charArray1= str1.toCharArray();
	       char [] charArray2= str2.toCharArray();
	       Arrays.sort(charArray1);
	       Arrays.sort(charArray2);
	       System.out.println(charArray1);
	       System.out.println(charArray2);
	       System.out.println("do both arrays is match: ");
	       
	       System.out.println(Arrays.equals(charArray1,charArray2));
	       
	}

}