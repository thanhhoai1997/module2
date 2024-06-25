package _04_class_and_oop.prative.stopWath;

import java.util.Date;

public class Watch {
//    Test test;
    private long starTime;
    private long endTime;
   public Watch(){
       this.starTime = (new Date()).getTime();
       this.endTime = (new Date()).getTime();

  }

  public   long start(){
      this.starTime = (new Date()).getTime();
       return this.starTime;
  }

    public   long stop(){
        this.endTime = (new Date()).getTime();
        return this.endTime;
    }

    public  long getElapsedTime(){
       return this.endTime - this.starTime;
    }
}
