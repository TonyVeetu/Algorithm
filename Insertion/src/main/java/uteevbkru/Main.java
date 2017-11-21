package uteevbkru;

import uteevbkru.insertion.InsertionSort;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] cats = {12, 5, 7, 8, -1, 3, 0, -13};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(cats);

        System.out.println(insertionSort.getType());
        for(int i = 0; i < cats.length; i++) {
            System.out.print(cats[i]  + "\t");
        }
    }
}