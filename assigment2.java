public class Circle 
{
    // instance variables
    private double radius;
    
    // Constructor
    Circle (double radius)
    {
        this.radius = radius;
    }
    
    // Get method to return the radius of Circle
    public double getRadius()
    {
        return radius;
    }
    // Set method to set the radius of instance
    public setRadius(double radius)
    {
        this.radius = radius;
    }
    // Method to get circumference of a Circle Object
    public double circCirumference(Circle obj)
    {
        return 2*obj.radius*Math.PI;
    }
    // Method to get area of a Circle Object
    public double circArea(Circle obj)
    {
        return Math.PI*obj.radius*obj.radius;
    }
    // Method to draw a Circle
    public void drawCircle()
    {
        int n=(int) radius;
    	for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                if (i*i + j*j <= n*n) System.out.print("* ");
                else                  System.out.print(". ");
            }
            System.out.println();
    	}
    }
        
}
public class Rectangle
{
    private double length,width;
    //default Constructor
    Rectangle(){
        
    }
    //Constructor with parameter
    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double recPerimeter(Rectangle obj){
        return 2*(obj.length+obj.width);
    }
    public double recArea(Rectangle obj){
        return obj.length*obj.width;
    }
    void drawRectangle(){
        int r = (int)this.length;
        int c = (int) this.width;
        for (i = 1; i <= r; i++) {
            for (j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}
public class Triangle{
    private double base,height;
    Triangle(){
        
    }
    Triangle(double base,double height){
        this.base =base;
        this.height = height;
    }
    public void setBase(double base){
        this.base =base;
    }
    public double getBase(){
        return this.base;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public double triPerimeter(Triangle obj){
        return obj.base+obj.height+Math.sqrt(obj.base*obj.base+obj.height*obj.height);
    }
    public double triArea(Triangle obj){
        return 0.5*this.base*this.height;
    }
    public void drawTriangle(){
        int x =(int)this.height;
        for (int i=1; i<=x; i ++)
        {
            for (int j=0; j<i; j++)
            {
                 System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
public class Interface 
{
    public static void main(String[] args)
    {
        //User class :
        // Creating new User obj.
        System.out.println("User : ");
        User objUser  = new User("Hasib",1234567,"hasib@gmail.com");
        // User getName & setName Method
        objUser.setName("Hasibur Rahman");
        System.out.println(objUser.getName());
        
        // User setId & getId Method
        objUser.setId(9876543);
        System.out.println(objUser.getId());
        
        // User setEmail ,getEmail & verifyEmail Method
        objUser.setEmail("hasib@yahoo.com");
        System.out.println(objUser.getEmail());
        System.out.println("Email verify : "+objUser.verifyEmail("showkat.osman@northsouth.edu"));
        
        //Rectangle Class:
        
        System.out.println("Rectangle : ");
        //Creating new Rectangle object with given length & width
        Rectangle objRec=new Rectangle(8,10);
        //Rectangle getLength & setLength Method
        objRec.setLength(5);
        System.out.println("Length : "+objRec.getLength());
        
        //Rectangle setWidth & getWidth Method
        objRec.setWidth(5);
        System.out.println("Width : "+objRec.getWidth());
        
        
        //Rectangle Perimeter using recPerimeter Method
        System.out.println("Perimeter : "+objRec.recPerimeter(objRec));
        
        //Rectangle Area using recArea Method
        System.out.println("Area : "+objRec.recArea(objRec));
        
        //drawRectangle Method to draw a Rectangle
        objRec.drawRectangle();
        
        // Circle class
        System.out.println("Circle : ");
        //Creating new Circle object with given radius
        Circle objCirc=new Circle(10);
        
        //Circle setRadius & getRadius method
        objCirc.setRadius(5);
        System.out.println("Radious : "+objCirc.getRadius());
        //Circle Circumference using circCirumference
        System.out.println("Circumference : "+objCirc.circCumference(objCirc));
        
        //Circle Circumference using circArea
        System.out.println("Area : "+objCirc.circArea(objCirc));
        
        //Drawing Circle using drawCircle
        objCirc.drawCircle();
        
        //Triangle Class:
        System.out.println("Triangle : ");
        //Creating Triangle class object with given base and height
        Triangle objTri=new Triangle(3,5);
        //Triangle getBase & setBase method
        objTri.setBase(4);
        System.out.println("Base : "+objTri.getBase());
        //Triangle getHeight & setHeight method
        objTri.setHeight(6);
        System.out.println("Height : "+objTri.getHeight());
        //Triangle area and Perimeter using triArea and triPerimeter
        System.out.println("Area : "+objTri.triArea(objTri));
        System.out.println("Perimeter : "+objTri.triPerimeter(objTri));
        //draw method for drawing 
        
    }
    
    
