
public class CircleClass {
    private double radius;
    private final double PI = 3.14159;
    
    public void setRadius( double radiusGiven) {
        radius = radiusGiven;
        
    }
    
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return PI * radius * radius;
        
    }
    
    public double getDiameter(){
        return radius * 2;
        
    }
    public double getCircumference(){
        return 2 * PI * radius;
    }
    
    public CircleClass( double radiusGiven) {
        radius = radiusGiven;
    }
    public CircleClass() {
        radius = 0.0;
    }
}
