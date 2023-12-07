/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 3B
 */
public class parameterisedconst {
    int id;
    String name;
    parameterisedconst(int i ,String n)
    {
        id = i;
        name = n;
    }
    void display()
    {
        System.out.print(id+ ""+name);
    }
public static void main(String[] args)
{
    parameterisedconst s1 = new parameterisedconst(111,"Karnan");
    parameterisedconst s2 = new parameterisedconst(112,"Anu");
    s1.display();
    s2.display();

}
            
    
    
}
