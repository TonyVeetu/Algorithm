package uteevbkru;

import uteevbkru.selection.SelectionSort;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] cats = {12, 5, 7, 8, -1, 3, 0, -13};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(cats);

        System.out.println(selectionSort.getType());
        for(int i = 0; i < cats.length; i++) {
            System.out.print(cats[i]  + "\t");
        }
    }
}