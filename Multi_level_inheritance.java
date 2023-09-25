//This in Multi-level Inheritance
class A {    //Supper Class
    int a,b,c;
    void add(){
        a=10; b=20;
        c=a+b;
        System.out.println("Sum of Two Numbers "+c);
    }
    void sub(){
        a=300; b=80;
        c=a-b;
        System.out.println("Subtract of Two Numbers "+c);
    }
}
class B extends A{      //sub class 1
    void multi(){
        a=10; b=25;
        c=a*b;
        System.out.println("Multiple  of Two Numbers "+c);
    }
    void div(){
        a=300; b=30;
        c=a/b;
        System.out.println("Divission of Two Numbers "+c);
    }
}
class C extends B{   //Sub class 2
    void rem(){
        a=20; b=7;
        c=a%b;
        System.out.println("Remender of Two Numbers "+c);
    }
}
class Run{
public static void main(String[] args) {
    C q=new C();
    q.add(); q.sub(); q.multi(); q.div(); q.rem();

}
}