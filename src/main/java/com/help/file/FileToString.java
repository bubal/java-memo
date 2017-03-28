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

	public List<String> lineToList() throws IOException {
		
		List<String> newligneList= new ArrayList<>();
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
	
	public String [] lineToTab() throws IOException{
		int taille = lineToList().size();
		String [] tabString = new String[taille];
		for (int i=0; i < taille; i++){
			tabString[i] = this.ligneList.get(i);
		}
		return tabString;
	}

	public Map<Integer,String> lineToHash() throws IOException{
		
		int taille = lineToList().size();
		Map<Integer,String> hashString = new HashMap<>();
		
		for (int i=0; i < taille; i++){
			hashString.put(new Integer(i), this.ligneList.get(i));
		}
		return hashString;
	}
	
}
