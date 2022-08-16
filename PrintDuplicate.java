package week2day1;

public class PrintDuplicate {
	public static void main(String[] args) {
		int[] array= {15,12,14,16,18,14,15,17,16,18,12,20};
		System.out.println("duplicate element array:");
		
		for(int i = 0; i< array.length; i++)
			for (int j = 0; j < array.length; j++) {
				if(array[i]==array[j]) {
					System.out.println(array[j]);
				
			}
		}
	}

}
