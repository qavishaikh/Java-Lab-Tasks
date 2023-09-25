// This is single_Inheritance
class Student {
    int roll, marks; String name;
    void input(){
        System.out.println("Enter Roll, Name & Marks");
    }
}
class Qavi extends Student{
    void std(){
        roll=80;
         name="Qavi";
         marks=99;
         System.out.println(roll+" "+name+" "+marks);
    }
    public static void main(String[] args) {
        Qavi q=new Qavi();
        q.input();
        q.std();
    }
}
