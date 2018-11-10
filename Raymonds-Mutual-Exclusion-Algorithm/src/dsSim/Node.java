package dsSim;

import java.util.ArrayList;
import java.util.Iterator;
import raymondAlgorithm.MyNode;

public class Node {

    //Process Name
    private String name;
    
    //List of Link to other Node;
    private ArrayList<Link> link = new ArrayList<>();
    
    //
    private ArrayList<DSsimProcess> process = new ArrayList<>();
    
    //Each Node has Memory
    private Memory memory;
    
    //Each Node has Proccessor
    private Proccessor proccessor;
    
    //Node is Valid Or Not
    private boolean nodeValid = true;

    public Node() {
    }

    public Node(String name, Memory memory, Proccessor proccessor) {
        this.name = name;
        this.memory = memory;
        this.proccessor = proccessor;
    }
    
    public Node(String name, Memory memory, ArrayList process, Proccessor proccessor) {
        this.name = name;
        this.memory = memory;
        this.process = process;
        this.proccessor = proccessor;
    }
    
    //Each Node can be send Massage
    public void sendMassage(Message message,Link link)
    {
        proccessor.waitforOtherProcess();
        if(link.isInfinite() || link.isHasCapacity()){
            System.out.println("=============================در حال ارسال پیام==================================");
            link.setHasMessage(true,link,message);
        }
        if (!link.isInfinite()) 
            link.calLinkCapacity(message.getSize());
    }
    
    //Each Node can ba reiceve Massage
    public void recieveMassage(Message message,Link link)
    {
        System.out.println("=============================پیام توسط نود مقابل دریافت شد و باید پردازش شود==================================>>>>>>>>>>   " + message.getMessageTo().getName()+"\n\n");
        proccessor.waitforOtherProcess();
        getProccessor().messageProccess(message);
        if (!link.isInfinite()) {
            link.calLinkCapacity(link.getCapacity()+message.getSize());
        }
        //for (int j = 0; j < message.getMessageData().size(); j++) {
            //System.out.println("===========بسته دریافت شده حاوی نود های زیر است=========>>>>> " + ((MyNode)message.getMessageData()).getName()+"\n\n");
        //}
        //for (Iterator iterator = message.getMessageData().iterator(); iterator.hasNext();) {
            //link.getEndNode().memory.getMemory().add((MyNode)message.getMessageData());
             link.getEndNode().memory.addToFirsInMemory((MyNode)message.getMessageData());
        //}
        for (int j = 0; j < link.getEndNode().memory.getMemory().size(); j++) {
            System.out.println("========حافظه نود==="+link.getEndNode().getName()+"=========>>>>> " + ((MyNode)link.getEndNode().memory.getMemory().get(j)).getName()+"\n\n");
        }
    }
    
    //Start Getter And Setter Section

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<DSsimProcess> getProcesse() {
        return process;
    }

    public void setProcess(ArrayList<DSsimProcess> process) {
        this.process = process;
    }

    public Memory getNodeMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }



    public boolean isNodeValid() {
        return nodeValid;
    }

    public void setNodeValid(boolean nodeValid) {
        this.nodeValid = nodeValid;
    }
    
    public void setLink(Link link) {
        this.link.add(link);
    }

    public ArrayList<Link> getLink() {
        return link;
    }

    public ArrayList<DSsimProcess> getProcess() {
        return process;
    }

    public Proccessor getProccessor() {
        return proccessor;
    }
    
    //End Getter And Setter Section
    
    
    public void process()
    {
        
    }
    
    
}