/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author osiri
 */
public class Leaf {
    private int data;
    public Leaf left;
    public Leaf rigth;
    
    public Leaf (){
        left = rigth = null;
        data = 0;
    }
    
    public Leaf (int d){
        left = rigth = null;
        data = d;
    }
    
    public void print (){
        System.out.println("-"+data+"-");
    }
    
    public int getData (){
        return data;
    }
    
    public void setData (int d){
        data = d;
    }
}
