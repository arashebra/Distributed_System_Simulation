package dsSim;

public class Link {

    private Node startNode;
    private Node endNode;
    private boolean hasMessage = false;
    private long linkDelay = 0;
    private boolean linkValid = true;
    private boolean hasCapacity = true;
    private long capacity;
    private boolean infinite = true;

    /*public Link(){

    }*/

    public Link() {
    }

    public Link(long linkDelay) {
         this.linkDelay = linkDelay;
    }

    public Link(long linkDelay, long capacity) {
         this.linkDelay = linkDelay;
         this.capacity = capacity;
         this.infinite = false;
    }
    
    public Link( Node startNode, Node endNode) {
        this.endNode = endNode;
        this.startNode = startNode;
    }

    public Link( Node startNode, Node endNode, long capacity) {
        this.endNode = endNode;
        this.startNode = startNode;
        this.capacity = capacity;
        this.infinite = false;
    }
    
    public Link(Node endNode, long linkDelay, Node startNode) {
        this.endNode = endNode;
        this.linkDelay = linkDelay;
        this.startNode = startNode;
    }
    
    public Link(Node endNode, long linkDelay, Node startNode, long capacity) {
        this.endNode = endNode;
        this.linkDelay = linkDelay;
        this.startNode = startNode;
        this.capacity = capacity;
        this.infinite = false;
    }

    public Node getStartNode() {
        return startNode;
    }

    public void setStartNode(Node startNode) {
        this.startNode = startNode;
    }

    public Node getEndNode() {
        return endNode;
    }

    public void setEndNode(Node endNode) {
        this.endNode = endNode;
    }

    public boolean isHasMessage() {
        return hasMessage;
    }

    public void setHasMessage(boolean hasMessage,Link link,Message message) {
        this.hasMessage = true;
        System.out.println("=============================آیا لینک مربوطه دارای پیام هست==================================>>>>>>>>>>>   "+this.hasMessage);
        deliver(link,message);
    }

    public long getLinkDelay() {
        return linkDelay;
    }

    public void setLinkDelay(long linkDelay) {
        this.linkDelay = linkDelay;
    }

    public boolean isLinkValid() {
        return linkValid;
    }

    public void setLinkValid(boolean linkValid) {
        this.linkValid = linkValid;
    }

    public boolean isHasCapacity() {
        if(capacity > 0 || infinite)
            return true;
        return false;
    }

    public void setHasCapacity(boolean hasCapacity) {
        this.hasCapacity = hasCapacity;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }
    
    public long calLinkCapacity(long massageSize)
    {
        if(isHasMessage())
            return (capacity-massageSize);
        else
            return (capacity+massageSize);
    }

    public boolean isInfinite() {
        return infinite;
    }

    public void setInfinite(boolean infinite) {
        this.infinite = infinite;
    }
    
    public void deliver(Link link,Message message)
    {
        System.out.println("‍بیام باید به این نود تحویل داده شود => "+message.getMessageTo().getName());
        System.out.println("===================بسته توسط لینک درحال تحویل به نود مربوطه است==================>>   " + link.getLinkDelay());
        DsDelay dsDelay = new DsDelay(link.getLinkDelay());
        
        dsDelay.waitForLinkDelay();
        this.hasMessage = false;
        System.out.println("===================بسته تحویل داده شد و لینک مربوطه خالی است==================>>   " + this.hasMessage);
        message.getMessageTo().recieveMassage(message, link);
    }
    
    public void finalize() throws Throwable {

    }

}