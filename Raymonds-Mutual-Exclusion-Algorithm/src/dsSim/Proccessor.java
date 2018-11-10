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
public abstract class Proccessor extends Delay {

    private long CsProcessTime = 0;
    private long otherProcessTime = 0;
    private Message message;
    private Algorithm algorithm;
    
    private Node node;

    private Memory memory;
    
    public Proccessor(long CsProcessTime,long otherProcessTime, Algorithm algorithm, String name) {
        super(CsProcessTime, name);
        this.otherProcessTime = otherProcessTime;
        this.algorithm = algorithm;
    }
    
    public void waitforCsprocess(){
        makeDelay();
    }
    
    public void waitforOtherProcess()
    {
        makeOtherDelay(otherProcessTime);
    }
    
    public long getProcesssTime() {
        return CsProcessTime;
    }

    public void setProcesssTime(long processsTime) {
        this.CsProcessTime = processsTime;
    }
    
    public void messageProccess(Message message)
    {
        this.message = message;
    }
    
    public void sendMessage(Node node, Message message, Link link)
    {
        try {
            node.sendMassage(message, link);
        } catch (Exception e) {
        }
        
    }
    
    public void addToMemory(Memory memory,Node node,int index)
    {
        memory.addToMemory(node, index);
    }

    public void removeFirstInMemory()
    {
        try {
            memory.removeFirstInMemory();
        } catch (Exception e) {
        }
        
    }
    
    public void removeFromMemory(int index)
    {
        memory.removeFromMemory(index);
    }
    
    public Algorithm getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    
    public abstract void process(Node node);

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    @Override
    public abstract void run();

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
    
    @Override
    protected void finalize() throws Throwable {
        
    }
    
}
