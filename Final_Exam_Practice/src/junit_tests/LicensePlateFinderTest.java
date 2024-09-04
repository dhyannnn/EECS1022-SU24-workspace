package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Test2Practice;

public class LicensePlateFinderTest {

	@Test
	public void testThreeLetterLicensePlate() {
		String input = "Here is a license plate: ABC123 in the text.";
		String expected = "Found match ABC123";
		String result = Test2Practice.findLicensePlate(input);
		assertEquals(expected, result);
	}
	
	@Test
	public void testFourLetterLicensePlate() {
		String input = "Look at this plate: ABCD123 right here.";
		String expected = "Found match ABCD123";
		String result = Test2Practice.findLicensePlate(input);
		assertEquals(expected, result);
	}
	
	@Test
	public void testNoLicensePlate() {
		String input = "There are no license plates here.";
		String expected = "-1";
		String result = Test2Practice.findLicensePlate(input);
		assertEquals(expected, result);
	}
	
	@Test
	public void testBothFormatsThreeLetterFirst() {
		String input = "First ABC123, then ABCD123 comes later.";
		String expected = "Found match ABC123";
		String result = Test2Practice.findLicensePlate(input);
		assertEquals(expected, result);
	}
	
	@Test
	public void testBothFormatsFourLetterFirst() {
		String input = "First ABCD123, then ABC123 comes later.";
		String expected = "Found match ABCD123";
		String result = Test2Practice.findLicensePlate(input);
		assertEquals(expected, result);
	}

	@Test
	public void testMultipleLicensePlates() {
		String input = "Here are plates: ABC123, then ABCD123, and finally XYZ789.";
		String expected = "Found match ABC123";
		String  result = Test2Practice.findLicensePlate(input);
		assertEquals(expected, result);
	}
	
	@Test
	public void testEmptyString() {
		String input = "";
		String expected = "-1";
		String result = Test2Practice.findLicensePlate(input);
		assertEquals(expected, result);
	}
	
	@Test
	public void testSpecialCharacters() {
		String input = "Special characters! @#$ ABC123 *** included.";
		String expected = "Found match ABC123";
		String result = Test2Practice.findLicensePlate(input);
		assertEquals(expected, result);
	}
}
