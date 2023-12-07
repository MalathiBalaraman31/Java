/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 3B
 */
public class operatorsthis {
    int a,b,c,d,e,f;
    operatorsthis(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
void calculate()
{
    c =a+b;
    System.out.print(c);
    d =a-b;
    System.out.print(d);
    e=a%b;
    System.out.print(e);
    f=a*b;
    System.out.print(f); 
}

public static void main(String[] args)
{
    operatorsthis obj = new operatorsthis(10,20);
    obj.calculate();   
}
}
