package aufgabe17;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class JUnitTests {

	@Test
	public void testBinary() {
		int[] testArray = { 1, 2, 3 };
		assertTrue(BinarySearch.binarySearch(testArray, 1) == 0);
		assertTrue(BinarySearch.binarySearch(testArray, 4) == -1);
		assertTrue(BinarySearch.binarySearch(null, 1) == -1);
	}

	@Test
	public void testMerge() {
		int[] testArray1 = { 2, 4, 1, 6, -5 };
		int[] testArray1sorted = { -5, 1, 2, 4, 6 };
		MergeSort.sort(null);
		MergeSort.sort(testArray1);
		assertEquals(Arrays.toString(testArray1), Arrays.toString(testArray1sorted));
	}
}
