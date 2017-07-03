package com.hackerhank.challenges.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Contacts {

	public static Map<Character, List<String>> contacts = new TreeMap<>();
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            switch (op){
                case "add":
                    add(contact);
                break;
                case "find":
                   System.out.println(find(contact));
            }
        }
        in.close();
    }
	
	public static void add(String contact){
		char key = contact.charAt(0);
		List<String> contactsList = contacts.get(key);
		if(contactsList == null){
			contactsList = new ArrayList<>();
			contactsList.add(contact);
			contacts.put(key, contactsList);
		}else{
			contactsList.add(contact);
		}
	}

	public static int find(String contact) {
		Character key = contact.charAt(0);
		List<String> results = contacts.get(key);
		int counter = 0;
		if(results != null && results.size() > 0){
			for(String s : results){
				if(s.startsWith(contact)){
					counter++;
				}
			}
		}
		return counter;
	}
}
