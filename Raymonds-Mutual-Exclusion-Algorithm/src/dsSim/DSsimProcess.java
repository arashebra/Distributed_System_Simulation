package dsSim;

import java.util.Random;


public class DSsimProcess {

    
    private Time time = new Time();

    //When Process go to CS
    private long catchCStime;
    
    //When Process request CS Time
    private long requestCStime;
        
    //Each Node can be Request Critical Section
    private boolean requestCS = false;
    
    //In Every Time One Node can be in Critical Section
    public static boolean inCS = false;
    
    //How Much Every node can be in Critical Section
    private int howMuchTimeInCS;

    public DSsimProcess(int firstPeriod, int lastPeriod){
        Random rand = new Random();
        howMuchTimeInCS = rand.nextInt(firstPeriod)+lastPeriod;
    }

    public DSsimProcess(int howMuchTimeInCS) {
        this.howMuchTimeInCS = howMuchTimeInCS;
    }


    public void RequestCStime() {
        this.requestCStime = time.getNowTimeInMillis();
    }

    public void CatchCStime(Time catchCStime) {
        this.catchCStime = time.getNowTimeInMillis();
    }
    
    
    public Time calWaitForCatchCS(){
            return null;
    }
        
    public boolean isRequestCS() {
        return requestCS;
    }

    //Start Getter and Setter section
    public void setRequestCS(boolean requestCS) {
        this.requestCS = requestCS;
    }

    public static boolean isInCS() {
        return inCS;
    }

    public int getHowMuchTimeInCS() {
        return howMuchTimeInCS;
    }

    public void setHowMuchTimeInCS(int howMuchTimeInCS) {
        this.howMuchTimeInCS = howMuchTimeInCS;
    }

    public long getCatchCStime() {
        return catchCStime;
    }
    //End Getter and Setter section

    public void finalize() throws Throwable {
        
    }

}