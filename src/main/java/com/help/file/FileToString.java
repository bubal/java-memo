package com.help.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

	public List<String> lineToList() {

		List<String> newligneList= new ArrayList<>();

		Path path = Paths.get(this.filename);
		BufferedReader reader = null;

		try {
			
			reader = Files.newBufferedReader(path);
			String line;
			while ((line = reader.readLine()) != null) {
				ligneList.add(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null){
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		this.ligneList = newligneList;
		return newligneList;
	}

	public String [] lineToTab(){
		int taille = lineToList().size();
		String [] tabString = new String[taille];
		for (int i=0; i < taille; i++){
			tabString[i] = this.ligneList.get(i);
		}
		return tabString;
	}

	public Map<Integer,String> lineToHash(){

		int taille = lineToList().size();
		Map<Integer,String> hashString = new HashMap<>();

		for (int i=0; i < taille; i++){
			hashString.put(Integer.valueOf(i), this.ligneList.get(i));
		}
		return hashString;
	}

}
