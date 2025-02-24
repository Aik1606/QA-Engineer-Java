import java.util.Date;
// task1

public class Product {
  String name;
  String date;
  String fabricator;
  String country;
  int cost;
  Boolean isReserved;

  public Product(String name, String date, String fabricator, String country, int cost, Boolean isReserved){
    this.name = name;
    this.date = date;
    this.fabricator = fabricator;
    this. country =country;
    this.cost = cost;
    this.isReserved = isReserved;

  }
  public void about() {
    System.out.println(this);
  }

  public String toString() {
    return String.format("{\n  Name: %s\n  Date: %s\n  Fabricator: %s\n  Country: %s\n  Cost: %d\n  Is Reserved: %b\n}\n",this.name,this.date, this.fabricator,this.country, this.cost, this.isReserved);
  }
}
