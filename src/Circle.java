public class Circle implements Figure {
 double radius;
 String fillColor;
 String boundaryColor;
 
 public Circle(double radius, String fillColor, String boundaryColor) {
   this.radius = radius;
   this.fillColor = fillColor;
   this.boundaryColor = boundaryColor;
 }
 
  @Override
  public double getPerimeter() {
    return Math.PI * this.radius * 2.0;
  }

  @Override
  public double getArea() {
    return Math.PI * this.radius * this.radius;
  }

  @Override
  public String getFillColor() {
    return this.fillColor;
  }

  @Override
  public String getBoundaryColor() {
    return this.boundaryColor;
  }
}
