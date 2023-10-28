package com.tbspoly;
 class A{
public void addition(int x,int y){
system.out.println("addition = "+x+y);
}
 }
class B extends A{
  public void substraction (int a, int b){
system.out.println("substraction =" + a-b);
  }
}
class C extends B{
public voud multiplication(int d, int e){
system.out.println("multiplication ="+ d*e);
}
}
class main{
  public static void main(string args[]){
    A obj = new A();
    obj.addition();
    A obj1 = new B();
    obj1.addition();
    C ojb2 = new B();
    ojb2.substration();
  }
}
