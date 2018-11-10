/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raymondAlgorithm;

import dsSim.*;
import java.util.Iterator;
/**
 *
 * @author DP
 */
public class MyDs extends DistributedSystem{

    int n;
    
    Link[][] links;
    MyNode[] myNodes;
    
    
    
    /*public MyNode node1;
    public MyNode node2;
    public MyNode node3;
    public MyNode node4;
    public MyNode node5;
    public MyNode node6;
    
    public Link link21;
    public Link link42;
    public Link link31;
    public Link link53;
    public Link link63;*/
    
    @Override
    public void setStructure() {

        links = new Link[n][n];
        myNodes = new MyNode[n];
        //makeLinks();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if( (j+1)==(2*(i+1)) || (j+1)==((2*(i+1))+1) )
                    links[j][i] = new Link();
                else
                    links[j][i] = null;
            }
        }
        
        
        //setStructureNodes();
        for (int i = 0; i < n; i++) {
            myNodes[i] = new MyNode("node"+(i+1), new Memory(), new MyProcessor(2000,0,new RaymondAlgorithm(this),"Node"+i+"CPU"));
            super.setNode(myNodes[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(links[j][i] != null)
                    myNodes[i].setIncomingLinks(links[j][i]);
                if(links[i][j] != null)
                    myNodes[i].setComingOutLinks(links[i][j]);
            }
        }
        
        
        //setStructureLinks();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if( links[i][j] != null )
                {
                    links[i][j].setStartNode(myNodes[i]);
                    links[i][j].setEndNode(myNodes[j]);
                }
            }
        }
        
        
        setStructureResouces();
        setStructureProcesses();
        
        //System.out.println( ((Link)node2.getComingOutLinks().get(0)).getEndNode() );
        //System.out.println( link21.getEndNode().getName() +"  !!!!!!!!!!" );
        
        
        /*node1.setLink(link21);
        node1.setLink(link31);
        
        node2.setLink(link21);
        node2.setLink(link42);

        node3.setLink(link31);
        node3.setLink(link63);
        node3.setLink(link53);
        
        node4.setLink(link42);
        
        node5.setLink(link53);
        
        node6.setLink(link63);*/
        
        
        

        
        
    }

    @Override
    public void setStructureNodes() {
        
        /*node1 = new MyNode("node1", new Memory(),new MyProcessor(2000,0,new RaymondAlgorithm(this),"Node1CPU"));
        node2 = new MyNode("node2", new Memory(),new MyProcessor(2000,0,new RaymondAlgorithm(this),"Node2CPU"));
        node3 = new MyNode("node3", new Memory(),new MyProcessor(2000,0,new RaymondAlgorithm(this),"Node3CPU"));
        node4 = new MyNode("node4", new Memory(),new MyProcessor(2000,0,new RaymondAlgorithm(this),"Node4CPU"));
        node5 = new MyNode("node5", new Memory(),new MyProcessor(2000,0,new RaymondAlgorithm(this),"Node5CPU"));
        node6 = new MyNode("node6", new Memory(),new MyProcessor(2000,0,new RaymondAlgorithm(this),"Node6CPU"));*/
        
        /*node1 = new MyNode("node1", new Memory(),new Proccessor(0,"Node1CPU"));
        node2 = new MyNode("node2", new Memory(),new Proccessor(0,"Node2CPU"));
        node3 = new MyNode("node3", new Memory(),new Proccessor(0,"Node3CPU"));
        node4 = new MyNode("node4", new Memory(),new Proccessor(0,"Node4CPU"));
        node5 = new MyNode("node5", new Memory(),new Proccessor(0,"Node5CPU"));
        node6 = new MyNode("node6", new Memory(),new Proccessor(0,"Node6CPU"));*/
        
        /*super.setNode(node1);
        super.setNode(node2);
        super.setNode(node3);
        super.setNode(node4);
        super.setNode(node5);
        super.setNode(node6);*/
        
        /*node1.setIncomingLinks(link31);
        node1.setIncomingLinks(link21);
        //node1.setComingOutLinks(link31);
        
        node2.setIncomingLinks(link42);
        node2.setComingOutLinks(link21);
        
        node3.setIncomingLinks(link63);
        node3.setIncomingLinks(link53);
        node3.setComingOutLinks(link31);
        //node3.setIncomingLinks(link31);
        
        node4.setComingOutLinks(link42);
        
        node5.setComingOutLinks(link53);
        
        node6.setComingOutLinks(link63);*/
        
    }
    
    @Override
    public void setStructureResouces() {
        Resouce resouce = new Resouce(1, "CS");
    }

    @Override
    public void setStructureProcesses() {
        
        DSsimProcess p1 = new DSsimProcess(2);
        DSsimProcess p2 = new DSsimProcess(2);
        DSsimProcess p3 = new DSsimProcess(2);
        DSsimProcess p4 = new DSsimProcess(2);
        DSsimProcess p5 = new DSsimProcess(2);
        DSsimProcess p6 = new DSsimProcess(2);
        
        super.setProcess(p1);
        super.setProcess(p2);
        super.setProcess(p3);
        super.setProcess(p4);
        super.setProcess(p5);
        super.setProcess(p6);
    }
    
    public void makeLinks()
    {
        /*link21 = new Link();
        link42 = new Link();
        link31 = new Link();
        link53 = new Link();
        link63 = new Link();*/
    }
    
    @Override
    public void setStructureLinks() {
        //link21 = new Link(node2, 2000, node1, 100);
        /*link21 = new Link(node2, node1);
        link42 = new Link(node4, node2);
        link31 = new Link(node3, node1);
        link53 = new Link(node5, node3);
        link63 = new Link(node6, node3);*/
        
        /*link21.setStartNode(node2);
        link21.setEndNode(node1);
        
        link42.setStartNode(node4);
        link42.setEndNode(node2);
        
        link31.setStartNode(node3);
        link31.setEndNode(node1);
        
        link53.setStartNode(node5);
        link53.setEndNode(node3);
        
        link63.setStartNode(node6);
        link63.setEndNode(node3);
        
        super.setLink(link21);
        super.setLink(link42);
        super.setLink(link31);
        super.setLink(link53);
        super.setLink(link63);*/
        
        //link42.setLinkDelay(2000);
        
    }
    
    /*public MyNode root(MyDs myDs)
    {
        int i;
        for (i = 0; i < myDs.getNode().size()-1; i++) {
            for (int j = 0; j < ((Node) myDs.getNode().get(i)).getLink().size(); j++) {
                  if(  myDs.getNode().get(i) == ((Link)(((Node) myDs.getNode().get(i)).getLink().get(j))).getEndNode() )
                      return (MyNode) myDs.getNode().get(i);
            }
        }
        return null;
    }*/
    
    public MyNode root2(MyDs myDs)
    {
        Iterator itr = myDs.getNode().iterator();
        
        for (int i=0;itr.hasNext();i++) {
            if ( ((MyNode)itr.next()).getComingOutLinks().isEmpty() ) {
                return ((MyNode)myDs.getNode().get(i));
            }
        }
        return null;
    }



    
}
