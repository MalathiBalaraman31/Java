/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keywods;

/**
 *
 * @author 3B
 */
public class Keywods {
    int rollno;
    String name;
    float fees;
    Keywods(int rollno,String name,float fees)
    {
        this.rollno = rollno;
        this.name = name;
        this.fees = fees;
    }
    void display()
    {
        System.out.print(rollno+" "+name" "+fees);
    }
}
class test{
    public static void main(String[] args) {
        // TODO code application logic here
        Keywod s1 = new  Keywod (111,"Malathi",600f);
        Keywod s2 = new  Keywod(123,"Anu",600f);
        s1.display();
        s2.display();
    }
    
}
