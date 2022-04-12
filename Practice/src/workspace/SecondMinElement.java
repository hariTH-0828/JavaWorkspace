package workspace;

public class SecondMinElement {

	public static void main(String[] args) {
		int[] input = EasyArray.getValue();
		int min = input[0];
		int smin = input[0];
		
		// Find Minimum number in array:
		for(int i = 1; i < input.length; i++) {
			if(min > input[i]) {
				min = input[i];
			}
		}
		
		// Find Second minimum number in array
		for(int i = 0; i < input.length; i++) {
			if(smin > input[i] && input[i] != min) {
				smin = input[i];
			}
		}
		System.out.println(smin);
		
	}
}
