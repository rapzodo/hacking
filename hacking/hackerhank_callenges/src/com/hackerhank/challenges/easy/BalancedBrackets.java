package com.hackerhank.challenges.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Stream;

public class BalancedBrackets {

	private Map<Character, Character> brackets = new HashMap<>();
	
	public BalancedBrackets(){
		initBrackets();
	}
	
	private void initBrackets() {
		brackets.put('{', '}');
		brackets.put('(', ')');
		brackets.put('[', ']');
	}

	public Boolean solution(String input) {
		if(input.length() % 2 != 0){
			return false;
		}
		Stack<Character> stack = new Stack<>();
		Character[] chars = input.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
		for (Character character : chars) {
			Character closingBracket = brackets.get(character);
			if(closingBracket != null){
				stack.push(closingBracket);
			}else{
				if(stack.isEmpty() || character != stack.pop()){
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	private void check(Stack<Character> stack, Character c) {
		Character closingBracket = brackets.get(c);
		if(closingBracket != null){
			stack.push(closingBracket);
		}else{
			if(stack.isEmpty() || c != stack.pop()){
				return;
			}
		}
	}
	

}