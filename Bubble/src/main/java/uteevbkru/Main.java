package uteevbkru;

import uteevbkru.bubble.BubbleSort;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] cats = {12, 5, 7, 8, 3, 0, 15};

        BubbleSort bubble = new BubbleSort();
        bubble.sort(cats);
        for(int i = 0; i < cats.length; i++) {
            System.out.print(cats[i]  + "\t");
        }
    }
}