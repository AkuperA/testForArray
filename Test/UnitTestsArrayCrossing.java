import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UnitTestsArrayCrossing {

    TwoArrays test = new TwoArrays();

    @Test
    public void  testPositiveWithCross(){
        int[] firstArray = {1,2,3,4,5,6};
        int[] secondArray = {0,4,6};
        int[] expected = {4,6};
        int[] result = test.arrayCrossing(firstArray, secondArray);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testPositiveWIthNegativeCross(){
        int[] firstArray = {1,2,3,-4,5,6};
        int[] secondArray = {0,-4,6};
        int[] expected = {-4,6};
        int[] result = test.arrayCrossing(firstArray, secondArray);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testPositiveWithEmptyArray(){
        int[] firstArray = {1,2,3,4,5,6};
        int[] secondArray = {};
        int[] expected = {};
        int[] result = test.arrayCrossing(firstArray, secondArray);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testPositiveWithoutCross(){
        int[] firstArray = {1,2,3,4,5,6};
        int[] secondArray = {7,8,9};
        int[] expected = {};
        int[] result = test.arrayCrossing(firstArray, secondArray);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testNegativeWithNull(){
        int[] firstArray = null;
        int[] secondArray = {0,4,6};
        int[] result = test.arrayCrossing(firstArray, secondArray);
        Assert.assertNull(result);
    }
}
