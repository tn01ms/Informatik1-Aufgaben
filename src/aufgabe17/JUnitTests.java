package aufgabe17;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class JUnitTests {

	/**
	 * Testet BinarySearch
	 */
	@Test
	public void testBinary() {
		// TestArray
		int[] testArray = { 1, 2, 3 };
		// Erfolgreiche Suche
		assertEquals(BinarySearch.binarySearch(testArray, 1), 0);
		// Zahl nicht enthalten
		assertEquals(BinarySearch.binarySearch(testArray, 4), -1);
		// Nullreferenz
		assertEquals(BinarySearch.binarySearch(null, 1), -1);
	}

	/**
	 * Testet MergeSort
	 */
	@Test
	public void testMerge() {
		// TestArray
		int[] testArray = { 2, 4, 1, 6, -5 };
		// TestArray sortiert
		int[] testArraySorted = { -5, 1, 2, 4, 6 };
		// Nullreferenz
		MergeSort.sort(null);
		// TestArray sortieren
		MergeSort.sort(testArray);
		// Erfolgreiche Sortierung prüfen
		assertEquals(Arrays.toString(testArray), Arrays.toString(testArraySorted));
	}
}
