package com.help.tri;

import java.util.ArrayList;
import java.util.List;

public class StackMachine {

	public int solution(String S) {

		String[] operations = S.split(" ");
		Double MAX = Math.pow(2,20)-1;
		List<Integer> stack = new ArrayList<>();

		for(String str:operations){
			switch (str){
			case "DUP" :
				if (stack.isEmpty())
					return -1;
				stack.add(stack.get(stack.size()-1)); 
				if (stack.size()>2001)
					return -1;
				break;
			case "POP" :
				if (stack.isEmpty()) 
					return -1;
				stack.remove(stack.size()-1);
				break;
			case "+" :
				if (stack.size()<2) 
					return -1;
				Integer somme = stack.get(stack.size()-1) + stack.get(stack.size()-2);
				if (somme > MAX.intValue()) 
					return -1;
				stack.remove(stack.size()-1);
				stack.remove(stack.size()-1);
				stack.add(somme);
				break;
			case "-" :
				if (stack.size()<2) 
					return -1;
				Integer soustract = stack.get(stack.size()-1) - stack.get(stack.size()-2);
				if (soustract < 0) 
					return -1;
				stack.remove(stack.size()-1);
				stack.remove(stack.size()-1);
				stack.add(soustract);
				break;
			default :
				Integer nbr = Integer.parseInt(str);
				if (nbr <0 || nbr > MAX.intValue()) 
					return -1;
				stack.add(nbr);
			}
			if (stack.size()>2001) 
				return -1;
		}
		if (stack.isEmpty()) 
			return -1;

		return stack.get(stack.size()-1);
	}

}
