import java.lang.reflect.Array;
import java.util.Arrays;

public class Park {
  String name;
  Attraction[] attractionArray;


  public Park(String name, Attraction[] attractionArray) {
    this.name = name;
    this.attractionArray = attractionArray;
  }

  public static class Attraction {
    String info;
    String workTime;
    int cost;

    public Attraction (String info, String workTime, int cost) {
      this.info = info;
      this.workTime = workTime;
      this.cost = cost;
    }

    public String toString() {
      return String.format("{\n  Info: %s\n  workTime: %s\n  Cost: %d\n}\n",this.info,this.workTime, this.cost);
    }
  }
  public String toString() {
    return String.format("{\n  Name: %s\n  Attraction: %s\n}\n",this.name, Arrays.toString(this.attractionArray));
  }
}
