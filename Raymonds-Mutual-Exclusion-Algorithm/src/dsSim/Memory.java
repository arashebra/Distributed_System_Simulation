/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsSim;

import java.util.ArrayList;

/**
 *
 * @author DP
 */
public class Memory {
    
    private ArrayList arrayList = new ArrayList();
    private ArrayList temp = new ArrayList();

    public ArrayList getMemory() {
        return arrayList;
    }

    public void setMemory(ArrayList memory) {
        this.arrayList = memory;
    }
    
    public synchronized void addToMemory(Node node,int index)
    {
        if(arrayList.indexOf(node) == -1)
            this.arrayList.add(index, node);
    }
    
    public synchronized void addToFirsInMemory(Node node)
    {
        if(arrayList.indexOf(node) == -1)
            this.arrayList.add(node);
    }
    
    private void recursive(ArrayList a)
    {
        for (int i = 0; i < a.size(); i++) {
            if (!(a.get(i) instanceof ArrayList)) {
                //System.out.println(a.get(i));
                temp.add( a.get(i));
            } else  {
                recursive((ArrayList)a.get(i));
            }
        }
    }
    
    public Object getFromMemory(int index)
    {
        return this.arrayList.get(index);
    }

    public synchronized Object removeFromMemory(int index)
    {
        return this.arrayList.remove(index);
    }
    
    public synchronized void removeFirstInMemory()
    {
        
        this.arrayList.remove(0);
    }

    public boolean isIsEmpty() {
        return arrayList.isEmpty();
    }
    
}
