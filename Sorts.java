public class Sorts{
    /**Bubble sort of an int array. 
    *@postcondition The array will be modified such that the elements will be in increasing order.
    *@param data  the elements to be sorted.
    */
    public static void bubbleSort(int[] data){
        int stop = data.length-1;
        int high;
        int temp;
        while(stop>0){
            high = 0;
            for(int j = 0; j<stop; j++){
                if(data[j]>data[j+1]){
                    temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                    high = j;
                }
            }
            stop = high;
        }
    }

    /**Selection sort of an int array. 
    *@postcondition The array will be modified such that the elements will be in increasing order.
    *@param data  the elements to be sorted.
    */
    public static void selectionSort(int[] data){
        int min;
        int temp;
        for(int i = 0; i<data.length-1; i++){
            min = i;
            for(int j = i+1;j<data.length;j++){
                if (data[min] > data[j])
                min = j;
            }
            temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }

    }

    /**Insertion sort of an int array. 
    *@postcondition The array will be modified such that the elements will be in increasing order.
    *@param data  the elements to be sorted.
    */
    public static void insertionSort(int[] data){
        int position;
        int temp;
        for(int i = 1; i<data.length; i++){
            position = i-1;
            while (position >= 0 && data[i]<data[position]){
                position--;
            }
            position++;
            temp = data[i];
            for(int j = i;  j>position; j--){
                data[j]=data[j-1];
            }
            data[position]=temp;
        }
    }
    // 5, 4, 3, 2, 1
    // 4, 5, 3, 2, 1
    // 

}
  