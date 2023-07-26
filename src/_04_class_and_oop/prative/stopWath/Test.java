package _04_class_and_oop.prative.stopWath;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Watch watch = new Watch();
        watch.start();

    int [] array = new int[100000];
    for (int i = 0; i < array.length; i++ ){
        array[i] = (int) (Math.random()*100000);
    }
//        System.out.println(Arrays.toString(array));
    int min = array[0];
    int [] array2 = new int[100000];
    for (int j = 0; j < array.length;j++){
       for (int i  = j+1; i < array.length;i++){
         if (array[i] < min){
             min = array[i];
          }
         array2[j] = min;
      }
//  System.out.println(Arrays.toString(array2));
}

    watch.stop();





        System.out.println(watch.getElapsedTime());
    }
}
