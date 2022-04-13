package workspace;

public class Sorting {

	static int[] sortSelection(int[] arrData) {
		
		for(int i = 0; i < arrData.length - 1; i++) {
			int minNum = arrData[i];
			int minLen = i;
			for(int j = i+1; j < arrData.length; j++) {
				if(minNum > arrData[j]) {
					minNum = arrData[j];
					minLen = j;
				}
			}
			int temp = arrData[i];
			arrData[i] = arrData[minLen];
			arrData[minLen] = temp;
		}
		return arrData;
	}
	
	public static void main(String[] args) {
		
		System.out.println(sortSelection(EasyArray.getValue()));
	}

}
