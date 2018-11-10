/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raymondAlgorithm;

import dsSim.*;
import java.util.ArrayList;
/**
 *
 * @author DP
 */
public class MyNode extends Node {
    
    private Long StartRequestCSTime;
    private Long StartCatchCSTime;
    private boolean hasToken = false;
    private static boolean InCS = false;
    private ArrayList incomingLinks = new ArrayList();
    private ArrayList ComingOutLinks = new ArrayList();

    public MyNode() {
    }

    public MyNode(String name, Memory memory, Proccessor proccessor) {
        super(name, memory, proccessor);
    }

    public MyNode(String name, Memory memory, ArrayList process, Proccessor proccessor) {
        super(name, memory, process, proccessor);
    }
    
    public Long getStartRequestCSTime() {
        return StartRequestCSTime;
    }

    public void setStartRequestCSTime(Long StartRequestCSTime) {
        System.out.println(StartRequestCSTime+"زمان تقاضای اولیه ===============>   "+getName());
        this.StartRequestCSTime = StartRequestCSTime;
    }

    public Long getStartCatchCSTime() {
        return StartCatchCSTime;
    }

    public void setStartCatchCSTime(Long StartCatchCSTime) {
        System.out.println(StartCatchCSTime+"زمان دریافت اولیه ===============>   "+getName());
        this.StartCatchCSTime = StartCatchCSTime;
    }

    public boolean isHasToken() {
        return hasToken;
    }

    public void setHasToken(boolean hasToken) {
        this.hasToken = hasToken;
    }

    public ArrayList getIncomingLinks() {
        return incomingLinks;
    }

    public void setIncomingLinks(Link incomingLinks) {
        this.incomingLinks.add(incomingLinks);
    }

    public ArrayList getComingOutLinks() {
        return ComingOutLinks;
    }

    public void setComingOutLinks(Link ComingOutLinks) {
        this.ComingOutLinks.add(ComingOutLinks);
    }
    
    public boolean isInCS() {
        return InCS;
    }

    public void setInCS(boolean InCS) {
        this.InCS = InCS;
    } 
    
    public void wantCs()
    {
        super.getProccessor().process(this);
        //((RaymondAlgorithm)super.getProccessor().getAlgorithm()).setNodeRequest(this, true);
    }
    

}
