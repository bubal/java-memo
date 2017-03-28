package com.help.string.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.help.tri.ArbreTri;

public class TestTri {

	@Test
	public void test1(){
		
		int [] tabIn = {15,3,52,81,41,0,-2,3,9};
		int [] tabTri = {-2,0,3,3,9,15,41,52,81};
		int [] tabout;
		
		ArbreTri arbrenbr = new ArbreTri(tabIn);
		tabout = arbrenbr.getTableauOut();
		
		for (int i=0; i<tabout.length;i++){
			assertEquals(tabout[i],tabTri[i]);
		}
		
		
		
		
	}
}
