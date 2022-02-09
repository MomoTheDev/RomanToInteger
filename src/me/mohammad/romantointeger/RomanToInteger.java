package me.mohammad.romantointeger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	
	private Map<Character, Integer> romanNumbers;
	
	public RomanToInteger() {
		romanNumbers = new HashMap<>();
		initializeRomanNumbers();
	}
	
	public Integer getValue(final String romanNumbers) {
		final char[] characters = romanNumbers.toCharArray();
		int result = 0;
		int largest = 0;
		for (int i = characters.length - 1; i >= 0; i--) {
			if (getValue(characters[i]) < largest) {
				result -= getValue(characters[i]);
				continue;
			}
			result += getValue(characters[i]);
			largest = getValue(characters[i]);
		}
		return result;
	}
	
	public Integer getValue(final Character romanNumber) {
		if (!(romanNumbers.containsKey(romanNumber)))
			return -1;
		return romanNumbers.get(romanNumber);
	}
	
	private void initializeRomanNumbers() {
		romanNumbers.put('I', 1);
		romanNumbers.put('V', 5);
		romanNumbers.put('X', 10);
		romanNumbers.put('L', 50);
		romanNumbers.put('C', 100);
		romanNumbers.put('D', 500);
		romanNumbers.put('M', 1000);
	}
	
}
