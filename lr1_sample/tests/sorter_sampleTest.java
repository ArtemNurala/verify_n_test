import org.junit.Assert;

import static org.junit.Assert.*;

public class sorter_sampleTest {

    @org.junit.Test
    public void bubbleSort() {
        int[] TestArray = { -11, 17, 20, 19, 13, -7, 5, -17 };
        int[] ExpectedArray = { -17, -11, -7, 5, 13, 17, 19, 20 };
        int[] ResultArray = sorter_sample.BubbleSort(TestArray, false, 8);
        Assert.assertArrayEquals(ExpectedArray, ResultArray);
    }

    @org.junit.Test
    public void insertionSort() {
        int[] TestArray = { -11, 17, 20, 19, 13, -7, 5, -17 };
        int[] ExpectedArray = { -17, -11, -7, 5, 13, 17, 19, 20 };
        int[] ResultArray = sorter_sample.InsertionSort(TestArray, false, 8);
        Assert.assertArrayEquals(ExpectedArray, ResultArray);
    }

    @org.junit.Test
    public void shakerSort() {
        int[] TestArray = { -11, 17, 20, 19, 13, -7, 5, -17 };
        int[] ExpectedArray = { -17, -11, -7, 5, 13, 17, 19, 20 };
        int[] ResultArray = sorter_sample.ShakerSort(TestArray, false, 8);
        Assert.assertArrayEquals(ExpectedArray, ResultArray);
    }
}