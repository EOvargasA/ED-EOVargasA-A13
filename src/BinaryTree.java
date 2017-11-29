/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author osiri
 */
public class BinaryTree {
    private int leaves;
    public Leaf root;
    
    public BinaryTree (){
        root=null;
        leaves = 0;  
    }
    
    public BinaryTree (int d){
        Leaf l = new Leaf(d);
        root = l;
        leaves = 1;
    }
    
    public void insert(int d, Leaf root){
        if(root != null){
            if (d < root.getData()){
                if (root.left == null){
                    root.left = new Leaf(d);
                }else{
                    insert(d, root.left);
                    leaves++;
                }
            }else{
                if (root.rigth == null){
                    root.rigth = new Leaf(d);
                    leaves++;
                }else{
                    insert(d,root.rigth);
                }
            }
        }else{
            root = new Leaf(d);
            leaves = 1;
        }
    }
    
    public void showLeaf(Leaf root){
        root.print();
    }
    
    public Leaf fetch (int d, Leaf root){
        if (root != null){
            if (d == root.getData()){
                return root;
            }else if (d < root.getData()){
                return fetch (d, root.left);
            }else{
                return fetch (d, root.rigth);
            }
        }
        return null;
    }
    
    public Leaf getFather (Leaf leaf, Leaf root){
        if (root != null && leaf != root){
            if (root.left == leaf || root.rigth == leaf){
                return root;
            }else if (leaf.getData() < root.getData()){
                return getFather(leaf, root.left);
            }else{
                return getFather(leaf, root.rigth);
            }
        }
        return null;
    }
    
    public boolean isEmpty(){
        return leaves == 0;
    }
    
    public int getLeaves(){
        return leaves;
    }
    
    public int heigth (Leaf root){
        if (isEmpty()){
            return 0;
        }else{
            int a,b;
            if (root.left == null && root.rigth == null){
                return 1;
            }else{
                a = heigth(root.left);
                b = heigth(root.rigth);
                if (a > b){
                    return a+1;
                }else{
                    return b+1;
                }
            }
        }
    }
}
