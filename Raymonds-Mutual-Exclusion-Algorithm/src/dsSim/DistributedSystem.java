package dsSim;
import java.util.ArrayList;
import java.util.List;



/**
 * @author DP
 * @version 1.0
 * @created 24-������-2018 04:39:26 �.�
 */
public abstract class DistributedSystem {

    private ArrayList<Resouce> resouce = new ArrayList();
    private ArrayList<DSsimProcess> process = new ArrayList();
    private ArrayList<Node> node = new ArrayList();
    private ArrayList<Link> link = new ArrayList();

    public DistributedSystem(){

    }

    public ArrayList<Resouce> getResouce() {
        return resouce;
    }

    public void setResouce(Resouce resouce) {
        this.resouce.add(resouce);
    }

    public ArrayList<DSsimProcess> getProcess() {
        return process;
    }

    public void setProcess(DSsimProcess process) {
        this.process.add(process);
    }

    public ArrayList getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node.add(node);
    }

    public ArrayList<Link> getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link.add(link);
    }
    
    
    
    public abstract void setStructure();
    
    public abstract void setStructureNodes();
        
    public abstract void setStructureResouces();
    
    public abstract void setStructureProcesses();
    
    public abstract void setStructureLinks();
    
    public void finalize() throws Throwable {

    }

}