// This is method Overriding program example
class Shape {
    void draw()
    {
        System.out.println("Can't say shape type");
    }
}
class Square extends Shape{
    @Override
    void draw()
    {
        System.out.println("Square Shape");
    }
}
class Override1{
    public static void main(String[]args) {
        Shape q=new Square();
        q.draw();
    }
}
