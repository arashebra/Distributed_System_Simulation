package dsSim;

import java.util.ArrayList;

/**
 * @author DP
 * @version 1.0
 * @created 24-������-2018 04:39:27 �.�
 */
public class Message {

    private Node messageFrom;
    private Node messageTo;
    private long massageSize = 0;
    public Link link;
    private Node data;

    public Message() {
        
    }
    
    public Message(Node messageFrom, Node messageTo) {
        this.messageFrom = messageFrom;
        this.messageTo = messageTo;
    }

    public Message(Node messageFrom, Node messageTo, long massageSize) {
        this.messageFrom = messageFrom;
        this.messageTo = messageTo;
        this.massageSize = massageSize;
    }

    public Message(Node messageFrom, Node messageTo, long massageSize, Node data) {
        this.messageFrom = messageFrom;
        this.messageTo = messageTo;
        this.massageSize = massageSize;
        this.data = data;
    }
    
    public Node getMessageFrom() {
        return messageFrom;
    }

    public void setMessageFrom(Node messageFrom) {
        this.messageFrom = messageFrom;
    }

    public Node getMessageTo() {
        return messageTo;
    }

    public void setMessageTo(Node messageTo) {
        this.messageTo = messageTo;
    }

    public long getSize() {
        return massageSize;
    }

    public void setSize(long massageSize) {
        this.massageSize = massageSize;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public Node getMessageData() {
        return data;
    }
    
    public void finalize() throws Throwable {

    }

}