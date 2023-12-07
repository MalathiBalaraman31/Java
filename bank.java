/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 3B
 */
public class bank {
    int accno;
    int doj;
    String name;
    int phno;
    bank(int n, int p,int d, String s)
    {
        accno = n;
        doj = d;
        phno = p;
        name = s;    
    }
    void display()
    {
        System.out.print(accno+""+doj+""+phno+""+name);
    }
    
public static void main(String [] args){
    bank s1 = new bank(123,31122004,123456,"Anu");
    bank s2 = new bank(124,315122004,1253456,"Mals");
    s1.display();
    s2.display();
    
}
}
