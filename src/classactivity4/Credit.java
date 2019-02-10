/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classactivity4;

import java.util.Date;

/**
 *
 * @author 1894420
 */
public class Credit extends payment{
    
    String name, type;
    Date expDate;
    payment p=new payment();
    
    public void authorized()
    {
     System.out.println("Method for authorization");
    }
}
