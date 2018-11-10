package dsSim;

/**
 * <span dir="rtl">���  ���� ���� ����� ������ ��� ���� ��� ����� �������� ��
 * ����</span>
 * @author DP
 * @version 1.0
 * @created 24-������-2018 04:39:25 �.�
 */
public class TimeCal {

    private long timeEnd;

    private long timeStart;
    
    private long timeLength;

    public TimeCal(long timeEnd, long timeStart) {
        this.timeEnd = timeEnd;
        this.timeStart = timeStart;
    }

    public long calTimeLength()
    {
        this.timeLength = this.timeEnd-this.timeStart;
        return (this.timeLength);
    }
    
    public long getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(long timeEnd) {
        this.timeEnd = timeEnd;
    }

    public long getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(long timeStart) {
        this.timeStart = timeStart;
    }

    
    
    public void finalize() throws Throwable {

    }

}