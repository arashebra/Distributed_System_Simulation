/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raymondAlgorithm;

import dsSim.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DP
 */
public class RaymondAlgorithm extends Algorithm{

    private MyNode nodeOwnerToken;
    private MyDs myDs;

    public RaymondAlgorithm(MyDs myDs) {
        this.myDs = myDs;
    }
    
    public void setNodeHasToken(MyNode nodeOwnerToken)
    {
        this.nodeOwnerToken = nodeOwnerToken;
        this.nodeOwnerToken.setStartCatchCSTime(new Time().getNowTimeInMillis());
    }
    
    public MyNode whoHasToken()
    {
        return myDs.root2(myDs);
    }
    
    public void setNodeRequest(MyNode myNode,boolean b)
    {
        try {

                System.out.println("===================من درخواست ناحیه بحرانی کردم==================>> "+myNode.getName());
            if( (myNode.getNodeMemory().getMemory().indexOf(myNode) == -1) && b){
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                myNode.setStartRequestCSTime(new Time().getNowTimeInMillis());
                System.out.println("===================خودم در صف خودم نیستم==================>> "+myNode.getName());
                //boolean add = myNode.getNodeMemory().getMemory().add(myNode);
                myNode.getProccessor().addToMemory(myNode.getNodeMemory(),myNode, 0);
                System.out.println("==================در صف من چه چیزی قرار دارد==================>>   "+((MyNode)myNode.getNodeMemory().getMemory().get(0)).getName());
            }
            if(whoHasToken().equals(myNode) && (myNode.getNodeMemory().getMemory().get(0) == myNode)  && (!myNode.getNodeMemory().getMemory().isEmpty()) ){
                System.out.println("==============******من ریشه هستم و سر صف ام خودم را می بینم*****===============");
                if(!myNode.getNodeMemory().getMemory().isEmpty()){
                    System.out.println("==============******صف من خالی نیست بنابراین خودم را از سر صف کم می کنم*****===============");
                    myNode.getNodeMemory().getMemory().remove(0);
                    //myNode.getProccessor().removeFirstInMemory();
                }
                System.out.println("==============******به ناحیه بحرانی می روم*****===============");
                getCS(myNode);
            }
            else if(whoHasToken().equals(myNode) && (myNode.getNodeMemory().getMemory().get(0) != myNode) && (!myNode.getNodeMemory().getMemory().isEmpty()) ){
                System.out.println("==============******ریشه هستم و سر صف خودم نیستم پس لینک را تغییر می دهم*****===============");
                //myNode.getProccessor().removeFirstInMemory();

                ((MyProcessor)myNode.getProccessor()).changeLinkDirection( myNode , this );


            }
            else if(!whoHasToken().equals(myNode)){
                System.out.println("==============******ریشه نیستم*****===============");
                //sendMassegeToParent(myNode);
                ((MyProcessor)myNode.getProccessor()).sendMessageToParent(myNode, this);  
            }
            
        } catch (Exception e) {
        }
        
    }
    
    
    public void sendMassegeToParent(MyNode myNode)
    {
        //System.out.println("===================پیام را به والد خود می فرستم به نام==================>> "+( (Link)myNode.getComingOutLinks().get(0)).getEndNode().getName());
        Message message = new Message(myNode, 
                                         ( (Link)myNode.getComingOutLinks().get(0)).getEndNode() ,
                                         myNode.getNodeMemory().getMemory().size(), 
                                         myNode);
        System.out.println("===================تست ارسال صحیح پیام به والد==================>>"+((Link) myNode.getComingOutLinks().get(0)).getEndNode().getName());
        //sendMassage( message , (Link) myNode.getComingOutLinks().get(0));
        myNode.getProccessor().sendMessage(myNode, message, (Link) myNode.getComingOutLinks().get(0));
        //از طریق پراسسر
        /*while ( ((Link) myNode.getComingOutLinks().get(0)).isHasMessage() ) {   
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        }*/
        System.out.println("\n\n\n");
        //System.out.println("===============نود مقابل درخواست کننده ناحیه بحرانی می شود=============>>>>>>>>>>>>>"+((MyNode)((Link)myNode.getComingOutLinks().get(0)).getEndNode()).getName());
        // setNodeRequest((MyNode)((Link)myNode.getComingOutLinks().get(0)).getEndNode(),false);
        ((MyProcessor)myNode.getProccessor()).setNodeRequest((MyNode)((Link)myNode.getComingOutLinks().get(0)).getEndNode(),false, this); 
        
    }
    
    public synchronized void getCS(MyNode myNode)
    {
        myNode.setInCS(true);
        myNode.setStartCatchCSTime(new Time().getNowTimeInMillis());
        myNode.getProccessor().waitforCsprocess();
        myNode.setInCS(false);
        setNodeRequest(myNode, false);
    }
    
    /*public void goToCSThenSendTokenAndChangeLink(MyNode myNode)
    {
        myNode.getStartCatchCSTime();
        if(!myNode.getNodeMemory().getMemory().isEmpty()){
            myNode.getNodeMemory().getMemory().remove(0);}
        myNode.getProccessor().waitforCsprocess();
        if(!myNode.getNodeMemory().isIsEmpty()){
            changeLinkDirection(myNode);
        }
    }*/
    
    /*public void sendTokenAndChangeDirectionIfNotInCS(MyNode myNode)
    {
        
        if(!myNode.isInCS()){
            changeLinkDirection(myNode);
        }
    }*/
    
    public synchronized void changeLinkDirection(MyNode myNode)    
    {
            System.out.println("************درحال تغییر لینک توسط***************>>>>" + myNode.getName());
            System.out.println("************بعداز تغییر لینک توسط***************>>>>" + ((MyNode)myNode.getNodeMemory().getMemory().get(0)).getName());
            MyNode tempNode;
            for (int i = 0; i < myNode.getIncomingLinks().size(); i++) {
                if( ((Link)myNode.getIncomingLinks().get(i)).getStartNode() == (MyNode)myNode.getNodeMemory().getMemory().get(0) ) {

                    tempNode = (MyNode)( (Link)myNode.getIncomingLinks().get(i) ).getStartNode();

                    ( (Link)myNode.getIncomingLinks().get(i) ).setStartNode((MyNode)( (Link)myNode.getIncomingLinks().get(i) ).getEndNode());
                    ( (Link)myNode.getIncomingLinks().get(i) ).setEndNode(tempNode);

                    Link link = (Link)myNode.getIncomingLinks().get(i);
                    myNode.getIncomingLinks().remove(link);
                    myNode.setComingOutLinks(link);

                    ((MyNode)myNode.getNodeMemory().getMemory().get(0)).getComingOutLinks().remove(link);
                    ((MyNode)myNode.getNodeMemory().getMemory().get(0)).setIncomingLinks(link);

                }

            }
            System.out.println("***********************>>>>>>>"+myDs.root2(myDs).getName());
            myNode.getNodeMemory().getMemory().remove(0);
            if(!myNode.getNodeMemory().getMemory().isEmpty())
                myNode.getProccessor().sendMessage(myNode, new Message(myNode, ((MyNode)((Link)myNode.getComingOutLinks().get(0)).getEndNode()), 0, myNode), (Link)myNode.getComingOutLinks().get(0));
            setNodeRequest( ((MyNode)((Link)myNode.getComingOutLinks().get(0)).getEndNode()), false);

        
    }
    
    
    public void waitSystemForCS() {
        
    }


    public void makeChart(int[] x, long[] y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void getStructure() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
