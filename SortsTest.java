public class SortsTest {
    public static void main(String[] args){
        int k = Integer.parseInt(args[1]);
        int[] data = new int[k];

        for(int i = 0; i<k; i++){
            data[i]= k-i;
        }

        if (args[0].equals("0")){
            Sorts.bubbleSort(data);
        }
        if (args[0].equals("1")){
            Sorts.selectionSort(data);
        }
        if (args[0].equals("2")){
            Sorts.insertionSort(data);
        }
    }
}
