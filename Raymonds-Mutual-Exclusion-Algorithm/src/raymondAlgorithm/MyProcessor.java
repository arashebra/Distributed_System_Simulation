/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raymondAlgorithm;

import dsSim.Algorithm;
import dsSim.Node;
import dsSim.Proccessor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DP
 */
public class MyProcessor extends Proccessor{
    
    public MyProcessor(long CsProcessTime, long otherProcessTime, Algorithm algorithm, String name) {
        super(CsProcessTime, otherProcessTime, algorithm, name);
    }

    
    
    
    
    @Override
    public void process(Node node) {
        super.setNode(node);
        try {
            start();
        } catch (Exception e) {
        }
        
    }

    @Override
    public void run() {
        /*try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MyProcessor.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        ((RaymondAlgorithm)getAlgorithm()).setNodeRequest((MyNode)getNode(), true);
        
    }
    
    public void changeLinkDirection(MyNode myNode , RaymondAlgorithm raymondAlgorithm)
    {
        try {
            raymondAlgorithm.changeLinkDirection(myNode);
        } catch (Exception e) {
        }
        
    }
    
    public void setNodeRequest(MyNode myNode, boolean b, RaymondAlgorithm raymondAlgorithm)
    {
        try {
            raymondAlgorithm.setNodeRequest(myNode, b);
        } catch (Exception e) {
        }
        
    }
    
    public void sendMessageToParent(MyNode myNode, RaymondAlgorithm raymondAlgorithm)
    {
        try {
            raymondAlgorithm.sendMassegeToParent(myNode);
        } catch (Exception e) {
        }
    }
    
    
}
