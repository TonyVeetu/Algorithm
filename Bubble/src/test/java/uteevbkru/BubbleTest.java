package uteevbkru;

import org.junit.Assert;
import uteevbkru.bubble.BubbleSort;

public class BubbleTest {
    private int[] mas = {1,2,3,4,5};

    public void descreaseTest(){
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(mas);
        for(int i = 0; i < mas.length - 1; i++){
            Assert.assertTrue(mas[i] < mas[i+1]);
        }
    }
}
