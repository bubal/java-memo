package com.help.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileToString {
	
	private String filename;
	private List<String> ligneList;
	
	public FileToString (String filename){
		this.filename = filename;
	}

	public List<String> LineToList() throws IOException {
		
		List<String> newligneList= new ArrayList<String>();
		FileReader fr;
		BufferedReader br;
		
			fr = new FileReader(this.filename);
			br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				ligneList.add(line);
			}
			br.close();
			fr.close();
		
		this.ligneList = newligneList;
		return newligneList;
	}
	
	public String [] LineToTab() throws IOException{
		int taille = LineToList().size();
		String tabString [] = new String[taille];
		for (int i=0; i < taille; i++){
			tabString[i] = this.ligneList.get(i);
		}
		return tabString;
	}

	public Map<Integer,String> LineToHash() throws IOException{
		
		int taille = LineToList().size();
		Map<Integer,String> HashString = new HashMap<Integer,String>();
		
		for (int i=0; i < taille; i++){
			HashString.put(new Integer(i), this.ligneList.get(i));
		}
		return HashString;
	}
	
}
