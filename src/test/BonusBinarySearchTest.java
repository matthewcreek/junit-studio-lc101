package test;
import static org.junit.Assert.*;
import org.junit.Test;
import main.BonusBinarySearch;
public class BonusBinarySearchTest {
    int[] positiveNumberArray = {2,5,36,47,58};
    int[] negativeNumberArray = {-57,-35,-4,0,27,77};
    int[] singleNumberArray = {27};
    int[] emptyArray = new int[0];
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void firstHalf() {
        String message = "a number in the first half of the array is found";
        int testNum = 5;
        int expected = 1;
        int actual = BonusBinarySearch.binarySearch(positiveNumberArray,testNum);
        assertEquals(message,expected,actual);
    }
    @Test
    public void secondHalf() {
        String message = "a number in the second half of the array is found";
        int testNum = 47;
        int expected = 3;
        int actual = BonusBinarySearch.binarySearch(positiveNumberArray, testNum);
        assertEquals(message,expected,actual);
    }
    @Test
    public void middleNumber() {
        String message = "a number in the middle of the odd number array is found";
        int testNum = 36;
        int expected = 2;
        int actual = BonusBinarySearch.binarySearch(positiveNumberArray, testNum);
        assertEquals(message,expected,actual);
    }
    @Test
    public void beginningArray() {
        String message = "a number at the start of the array is found";
        int testNum = 2;
        int expected = 0;
        int actual = BonusBinarySearch.binarySearch(positiveNumberArray, testNum);
        assertEquals(message,expected,actual);
    }
    @Test
    public void endOfArray() {
        String message = "a number at the end of the array is found";
        int testNum = 58;
        int expected = 4;
        int actual = BonusBinarySearch.binarySearch(positiveNumberArray, testNum);
        assertEquals(message,expected,actual);
    }
    @Test
    public void negativeIncludedArray() {
        String message = "negative numbers are found by the sorting program";
        int testNum = -4;
        int expected = 2;
        int actual = BonusBinarySearch.binarySearch(negativeNumberArray,testNum);
        assertEquals(message,expected,actual);
    }
    @Test
    public void notInArray() {
        String message = "number is not included in array";
        int testNum = 27;
        int expected = -1;
        int actual = BonusBinarySearch.binarySearch(positiveNumberArray, testNum);
        assertEquals(message, expected, actual);
    }
    @Test
    public void singleNumber() {
        String message = "number is found when it is the only one in array";
        int testNum = 27;
        int expected = 0;
        int actual = BonusBinarySearch.binarySearch(singleNumberArray, testNum);
        assertEquals(message, expected, actual);
    }
    @Test
    public void emptyArr() {
        String message = "an empty array returns -1";
        int testNum = 55;
        int expected = -1;
        int actual = BonusBinarySearch.binarySearch(emptyArray, testNum);
        assertEquals(message, expected, actual);
    }
}
