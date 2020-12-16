import java.util.Random;
public class DemoRandom{
  public static void main(String[]args){

    //here no seed is provided, so it uses the clock as a seed
    //this can be used to produce a random seed for a different Random object!
    int length = Integer.parseInt(args[0]);
    int seed = Integer.parseInt(args[1]);
    
    Random rng;
    int[] stuff = new int[length];
    
    /*
    for(int i =  0; i < 5; i++){
      System.out.println(rng.nextInt() % 1000);
    }
    System.out.println();
    */

    //specified seed can be used to reproduce sequences
    rng = new Random(seed);//seed of 100 is stored.
    for(int i =  0; i < stuff.length; i++){
      stuff[i]=rng.nextInt() & 65535;
    }
    for(int i =  0; i < stuff.length; i++){
        System.out.print(stuff[i]+",");
    }
    System.out.println();
    Sorts.bubbleSort(stuff);

    for(int i =  0; i < stuff.length; i++){
        System.out.print(stuff[i]+",");
    }

  }
}

