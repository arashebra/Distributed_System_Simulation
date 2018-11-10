package dsSim;

/**
 * <span dir="rtl">����� ���� ����� ������ ������ ���� ��������</span>
 * @author DP
 * @version 1.0
 * @created 24-������-2018 04:39:25 �.�
 */
public class DsDelay extends Delay {

    private long lenghtOfLinkDelay;
    private long lengthOfCsTimeProcessDelay;
    public Time time;
    public DSsimProcess process;

    public DsDelay(long delayTime) {
        super(delayTime);
    }

    public void waitForLinkDelay(){
        makeDelay();
    }


    public void finalize() throws Throwable {

    }

}