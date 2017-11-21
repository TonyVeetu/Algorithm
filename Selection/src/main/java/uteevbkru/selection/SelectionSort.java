package uteevbkru.selection;

public class SelectionSort implements Sort {
    private String type = "SelectionSort";
    public void sort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int index = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[index]){
                    index = j;
                }
            }
            int smaller = array[index];
            array[index] = array[i];
            array[i] = smaller;
        }
    }

    public String getType(){
        return type;
    }
}
