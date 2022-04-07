package workspace;

public class EasyArray {
	
	static String[] Splitter(String Data) {
		String strArray[] = Data.split(" ");
		return strArray;
	}
	
	static int[] StrToInt(String[] Data) {
		int[] numArray = new int[Data.length];
		for(int i = 0; i < Data.length; i++) {
			numArray[i] = Integer.parseInt(Data[i]);
		}
		return numArray;
	}

}
