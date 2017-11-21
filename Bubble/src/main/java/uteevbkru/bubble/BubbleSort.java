package uteevbkru.bubble;

public class BubbleSort implements Sort {
    private String type = "BubbleSort";

    public void sort(int[] mas){
        for(int i = mas.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(mas[j] > mas[j+1])
                    swap(mas, j);
            }
        }
    }

    private void swap(int[] mas, int index){
        int prom = mas[index];
        mas[index] = mas[index + 1];
        mas[index + 1] = prom;
    }

    public String getType() {
        return type;
    }

}
