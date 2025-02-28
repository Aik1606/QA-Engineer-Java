public class Triangle implements Figure {
  double a;
  double b;
  double c;
  String fillColor;
  String boundaryColor;

  public Triangle(double a, double b, double c, String fillColor, String boundaryColor) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.fillColor = fillColor;
    this.boundaryColor = boundaryColor;
  }

  @Override
  public double getPerimeter() {
    return a + b + c;
  }

  @Override
  public double getArea() {
    double halfPerimeter = getPerimeter() / 2.;

    return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
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
