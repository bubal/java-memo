package com.help.string.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.help.string.Palindrome;

public class TestPalindorme {

	private Palindrome palindrome = new Palindrome();

	@Test
	public void test1() {
		palindrome.setChaine("");
		assertEquals("La chaine vide est un palindrome", palindrome.checkCaseOff(), true);
	}
	
	@Test
	public void test2() {
		palindrome.setChaine("a");
		assertEquals("Une chaine avec un seul caractère est un palindrome", palindrome.checkCaseOff(), true);
	}
	
	@Test
	public void test3() {
		palindrome.setChaine("aa");
		assertEquals("La chaine <aa> est un palindrome", palindrome.checkCaseOff(), true);
	}

	@Test
	public void test4() {
		palindrome.setChaine("bob");
		assertEquals("La chaine <bob> est un palindrome", palindrome.checkCaseOff(), true);
	}

	@Test
	public void test5() {
		palindrome.setChaine("boob");
		assertEquals("La chaine <boob> est un palindrome", palindrome.checkCaseOff(), true);
	}

	@Test
	public void test6() {
		palindrome.setChaine("bobo");
		assertEquals("La chaine <bobo> n'est pas un palindrome", palindrome.checkCaseOff(), false);
	}

	@Test
	public void test7() {
		palindrome.setChaine("esoperesteicietserepose");
		assertEquals("La chaine <esoperesteicietserepose> est un palindrome", palindrome.checkCaseOff(), true);
	}

	@Test
	public void test8() {
		palindrome.setChaine("esoperesteicjetserepose");
		assertEquals("La chaine <esoperesteicjetserepose> n'est pas un palindrome", palindrome.checkCaseOff(), false);
	}

}
