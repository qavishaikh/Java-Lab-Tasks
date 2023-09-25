// This is Method Overloading Program in Polymorpism
class Overriding {
    void add(){
        int a=10, b=20, c;
        c=a+b;
        System.out.println(c);
    }
    void add(int x, int y){
        int c;
        c=x+y;
        System.out.println(c);
    }
    void add(double x, double y){
        double c;
        c=x+y;
        System.out.println(c);
    }
    public static void main(String[]args) {
        Overriding r=new Overriding();
        r.add();
        r.add(50,90);
        r.add(45.12,25.33);
    }

}
