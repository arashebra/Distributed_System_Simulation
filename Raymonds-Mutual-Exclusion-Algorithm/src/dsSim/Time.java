package dsSim;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author DP
 * @version 1.0
 * @created 24-������-2018 04:39:25 �.�
 */
public class Time {

	private int h;
	private int min;
	private int ms;
	private int sec;
	public Algorithm m_Algorithm;

	public Time(){

	}

	public void finalize() throws Throwable {

	}

        public long getNowTimeInMillis()
        {
            Calendar cal = Calendar.getInstance();
            return cal.getTimeInMillis();
        }
        
	public int getH(){
		return 0;
	}

	public int getMin(){
		return 0;
	}

	public int getMSec(){
		return 0;
	}

	public int getSec(){
		return 0;
	}

}