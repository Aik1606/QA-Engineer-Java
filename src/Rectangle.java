public class Rectangle implements Figure {
  private final String boundaryColor;
  private final double height;
  private final double width;
  private final String fillColor;

  public Rectangle(double width, double height, String fillColor, String boundaryColor) {
    this.height = height;
    this.width = width;
    this.boundaryColor = boundaryColor;
    this.fillColor = fillColor;
  }

  @Override
  public double getPerimeter() {
    return 2. * height * width;
  }

  @Override
  public double getArea() {
    return height * width;
  }

  @Override
  public String getFillColor() {
    return fillColor;
  }

  @Override
  public String getBoundaryColor() {
    return boundaryColor;
  }
}
