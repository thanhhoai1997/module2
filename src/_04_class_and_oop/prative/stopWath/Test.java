package _04_class_and_oop.prative.stopWath;

public class Test {
    public static void main(String[] args) {
        Watch watch = new Watch();


        for (int i = 1; i < 1000; i++ ){
            System.out.println(watch.start());
        }


        for (int i = 1; i < 1000; i++){
            System.out.println(watch.stop());
        }




        System.out.println(watch.getElapsedTime());
    }
}
