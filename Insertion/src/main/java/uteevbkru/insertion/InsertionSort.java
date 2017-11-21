package uteevbkru.insertion;

public class InsertionSort implements Sort {
    private String type = "InsertionSort";
    public void sort(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j >= 1; j--) {
                if(array[j] < array[j-1])
                    swap(array, j);
                else
                    break;
            }
        }
    }

    private void swap(int[] array, int j){
        int h = array[j];
        array[j] = array[j-1];
        array[j-1] = h;
    }

    public String getType(){
        return type;
    }
}
