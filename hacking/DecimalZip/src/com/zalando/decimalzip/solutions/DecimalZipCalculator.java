package com.zalando.decimalzip.solutions;

public class DecimalZipCalculator {
	private static final int MAX = 100000000;

	public int getDecimalZip(int A, int B) {
		if(A > MAX || B > MAX){
			return -1;
		}
		String a = String.valueOf(A);
		String b = String.valueOf(B);
		Character[] charsA = a.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
		Character[] charsB = b.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
		int biggestInput = charsA.length > charsB.length ? charsA.length : charsB.length;
		StringBuilder decimalZip = new StringBuilder();
		for (int i = 0; i < biggestInput; i++) {
			if((charsA.length -1) < i && i <= charsB.length-1){
				decimalZip.append(charsB[i]);
				continue;
			}
			if((charsB.length -1) < i && i <= charsA.length-1){
				decimalZip.append(charsA[i]);
				continue;
			}
			decimalZip.append(charsA[i]).append(charsB[i]);
		}
		Long result =Long.valueOf(decimalZip.toString());
		return result > MAX ? -1 : result.intValue();
	}

}
