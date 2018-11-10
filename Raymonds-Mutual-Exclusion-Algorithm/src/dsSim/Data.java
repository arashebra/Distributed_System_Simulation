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
public class Data<T> {
    
    private T data;

    public Data(T data) {
        this.data = data;
    }
    
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    
}
