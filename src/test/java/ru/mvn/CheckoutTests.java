package ru.mvn;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class CheckoutTests {

	@Test
	public void checkoutForRussianLetters() {
		String str = "ababa";
		List<String> patterns = new ArrayList<String>();
		patterns.add("русский");
		List<Integer> res = AhoCorasick.find(str, patterns);
		assertEquals(res.isEmpty(), true);
	}
	@Test
	public void checkoutForAdditionalSymbols() {
		String str = "ababa";
		List<String> patterns = new ArrayList<String>();
		patterns.add("#");
		List<Integer> res = AhoCorasick.find(str, patterns);
		assertEquals(res.isEmpty(), true);
	}
	@Test
	public void checkoutForNumbers() {
		String str = "ababa";
		List<String> patterns = new ArrayList<String>();
		patterns.add("1");
		List<Integer> res = AhoCorasick.find(str, patterns);
		assertEquals(res.isEmpty(), true);
	}
}
