public class Sorts{
    /**Bubble sort of an int array. 
    *@postcondition The array will be modified such that the elements will be in increasing order.
    *@param data  the elements to be sorted.
    */
    public static void bubbleSort(int[] data){
        int stop = data.length-2;
        int high=0;
        int temp;
        while(stop>0){
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

}
  