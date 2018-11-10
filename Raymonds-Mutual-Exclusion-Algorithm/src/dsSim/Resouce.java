package dsSim;
/**
 * <span dir="rtl">���� ����� ��</span>
 * @author DP
 * @version 1.0
 * @created 24-������-2018 04:39:26 �.�
 */
public class Resouce {

    private int resourceCount;
    private String resourceName;
    private boolean resourceInUse = false;

    public Resouce(int resourceCount, String resourceName) {
        this.resourceCount = resourceCount;
        this.resourceName = resourceName;
    }

    public void finalize() throws Throwable {

    }

}