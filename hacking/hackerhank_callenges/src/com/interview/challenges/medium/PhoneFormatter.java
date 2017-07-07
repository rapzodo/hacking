package com.zooplus.munich.tasks;

import java.text.ParseException;
import java.util.StringJoiner;

import javax.swing.text.MaskFormatter;

public class PhoneFormatter {
	
	private static String cleansing(String phone){
		return phone.replaceAll("[-\\s]+", "");
	}
	
	public static String format(String rawPhone){
		String phone = cleansing(rawPhone);
		StringJoiner sj = new StringJoiner("-");
		for (int i = 0; i < phone.toCharArray().length;) {
			int nextThree = i+3;
			int difference = phone.length() - i;
			if(difference == 4 || difference == 2){
				sj.add(phone.substring(i,i+2));
				i+=2;
			}else{
				sj.add(phone.substring(i,nextThree));
				i+=3;
			}
			
		}
		return sj.toString();
	}
	
	public static String solution(String input) throws ParseException{
		MaskFormatter mask = new MaskFormatter("###-###-###-##");
		String source = cleansing(input);
		mask.setValueContainsLiteralCharacters(false);
		return mask.valueToString(source);
	}
}
