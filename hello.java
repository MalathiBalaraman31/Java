/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keywods;

/**
 *
 * @author 3B
 */
public class hello {
    int rollno;
    String name;
    float fees;
    hello(int rollno,String name,float fees)
    {
        this.rollno = rollno;
        this.name = name;
        this.fees = fees;
    }
    void display()
    {
        System.out.print(rollno+" "+name+" "+fees);
    }
}
class test{
    public static void main(String[] args) {
        // TODO code application logic here
        hello s1 = new  hello (111,"Malathi",600f);
        hello s2 = new  hello(123,"Anu",600f);
        s1.display();
        s2.display();
    }
    
}

