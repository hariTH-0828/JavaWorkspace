package workspace;

import java.util.ArrayList;
import java.util.Scanner;

public class PatternMatches {
	
	public void SplitString(String getString) {
		getString = getString + "\0";
		ArrayList<String> strArr = new ArrayList<String>();
		String slice = "";
		for(int i = 0; i < getString.length() - 1;) {
			for(int j = i; j < getString.length(); j++) {
				if(getString.charAt(i) == getString.charAt(j)) {
					slice += getString.charAt(j);
				}
				else {
					i = j;
					break;
				}
			}
			strArr.add(slice.toString());
			slice = "";
		}
		patMatch(strArr);
	}
	
	public void patMatch(ArrayList<String> getData) {
		int count = 0;
		if(getData.size()%2 == 0) {
			for(int i = 0; i < getData.size();) {
				if(getData.get(i).length() == getData.get(i+1).length() && getData.get(i).charAt(0) == 'x') {
					count = 1;
				}
				else {
					count = 0;
					break;
				}
				i += 2;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PatternMatches patMat = new PatternMatches();
		System.out.println("Enter the String :");
		String getString = scan.nextLine();
		patMat.SplitString(getString);
		scan.close();
	}

}
