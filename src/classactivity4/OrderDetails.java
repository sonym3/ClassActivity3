/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classactivity4;

/**
 *
 * @author 1895268
 */
public class OrderDetails {
    int quantiy;
    String taxStatus;
    
    public void calcSubTotal(){
        System.out.println("This is a calcSubtotal function");
    }
     public void calcWeight(){
        System.out.println("This is a calcWeight function");
     }
     
    public void calcTax(){
        System.out.println("This is a calcTax function");
    }
}