package com.help.utilities;

import java.util.ArrayList;
import java.util.List;

public class StackMachine {
	
	private String cmd;
	private List<Integer> stack;
	private Double max = Math.pow(2, 20)-1;
	
	public StackMachine(String cmd) {
		super();
		this.cmd = cmd;
		stack = new ArrayList<>();
	}


	public int stackDo() {

		String[] operations = cmd.split(" ");

		for(String str:operations){

			switch (str){

			case "DUP" :
				stackDup();
				break;

			case "POP" :
				stackPop();
				break;

			case "+" :
				stackAddition();
				break;
				
			case "-" :
				stackSoustract();
				break;

			default :
				Integer nbr = Integer.parseInt(str);
				if (nbr <0 || nbr > max.intValue()) 
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

	private boolean stackDup(){
		if (stack.isEmpty())
			return false;
		stack.add(stack.get(stack.size()-1));
		return true;
	}

	

	private boolean stackPop(){
		if (stack.isEmpty()) 
			return false;
		stack.remove(stack.size()-1);
		return true;
	}

	

	private boolean stackAddition(){
		if (stack.size()<2) 
			return false;
		Integer somme = stack.get(stack.size()-1) + stack.get(stack.size()-2);
		if (somme > max.intValue()) 
			return false;
		stack.remove(stack.size()-1);
		stack.remove(stack.size()-1);
		stack.add(somme);
		return true;
	}

	

	private boolean stackSoustract(){
		if (stack.size()<2) 
			return false;
		Integer soustract = stack.get(stack.size()-1) - stack.get(stack.size()-2);
		if (soustract < 0) 
			return false;
		stack.remove(stack.size()-1);
		stack.remove(stack.size()-1);
		stack.add(soustract);
		return true;
	}


	
}
