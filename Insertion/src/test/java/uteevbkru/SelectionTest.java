package uteevbkru;

import org.junit.Assert;
import uteevbkru.insertion.InsertionSort;

public class SelectionTest {
    private int[] mas = {1,2,3,4,5};

    public void descreaseTest(){
        InsertionSort selectionSort = new InsertionSort();
        selectionSort.sort(mas);
        for(int i = 0; i < mas.length - 1; i++){
            Assert.assertTrue(mas[i] < mas[i+1]);
        }
    }
}
