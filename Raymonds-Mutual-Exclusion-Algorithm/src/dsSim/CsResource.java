/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsSim;

/**
 *
 * @author DP
 */
public class CsResource extends Resouce{
    
    private boolean CsUsed = false;
    
    public CsResource(int resourceCount, String resourceName) {
        super(resourceCount, resourceName);
    }
    
    public void useCS()
    {
        CsUsed = true;
    }

    public boolean isCsUsed() {
        return CsUsed;
    }

    public void setCsUsed(boolean CsUsed) {
        this.CsUsed = CsUsed;
    }
    
    
}
