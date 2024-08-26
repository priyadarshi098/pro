package corepractice;

public class HashPractice {
	
	static void arrayElementFrequencyCount(int[] arr) {
		int[] duparr = {8,7,6,5,2};
		for(int i = 0; i < duparr.length; i++) {
			int count = 0;
			for(int j = 0; j < arr.length; j++) {
				if(duparr[i] == arr[j]) {
					count++;
				}
			}
			System.out.println(duparr[i]+" "+count+" times");
		}
	}

	public static void main(String... strings) {
		arrayElementFrequencyCount(new int[] {8,7,6,5,8,2,6});
	}
}
