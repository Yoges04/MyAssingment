package week2day1;

public class OddIndexUpperCase {
	public static void main(String[] args) {
		String text="bikeride";
	      text = text.toLowerCase();
	      char[] ch = text.toCharArray();
	      for(int i=0; i<ch.length; i=i+2){
	         ch[i] = Character.toUpperCase(ch[i]);
	      }
	      System.out.println(new String(ch));

	}
}
