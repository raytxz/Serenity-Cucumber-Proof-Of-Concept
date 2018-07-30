package Utility;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NricGenerator {
	
	private static final Map<Integer, Character> alphaMap = new HashMap<>();
	static
	{
		alphaMap.put(0, 'J');
		alphaMap.put(1, 'Z');
		alphaMap.put(2, 'I');
		alphaMap.put(3, 'H');
		alphaMap.put(4, 'G');
		alphaMap.put(5, 'F');
		alphaMap.put(6, 'E');
		alphaMap.put(7, 'D');
		alphaMap.put(8, 'C');
		alphaMap.put(9, 'B');
		alphaMap.put(10, 'A');
	}
	
	public String generateNric() {
		Random r = new Random();
		int checkSum = 0;
		int temp;
		int check;
		
		StringBuilder nric = new StringBuilder(9);
		nric.append("S");
		
		for(int i = 1; i < 8; i++) {
			temp = r.nextInt(10);
			nric.append(temp);
			
			switch (i) {
			case 1:
				checkSum += temp * 2;
				break;
				
			case 2:
				checkSum += temp * 7;
				break;
				
			case 3:
				checkSum += temp * 6;
				break;
				
			case 4:
				checkSum += temp * 5;
				break;
				
			case 5:
				checkSum += temp * 4;
				break;
				
			case 6:
				checkSum += temp * 3;
				break;
				
			case 7:
				checkSum += temp * 2;
				break;

			default:
				break;
			}
		}
		
		check = checkSum % 11;
		nric.append(alphaMap.get(check));
		
		return nric.toString();
	}
}
