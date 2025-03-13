package lesson9;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
  String name;
  String group;
  int course;
  HashMap<String, Integer> scores;


  public Student(String name, String group, int course, HashMap<String, Integer> scores) {
    this.name = name;
    this.group = group;
    this.course = course;
    this.scores = scores;
  }
  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", group='" + group + '\'' +
        ", course=" + course +
        ", gen=" + String.format("%.2f", gen()) +
        ", grades=" + scores +
        '}';
  }

  public double gen(){
    int sum = 0;
    for (Integer score: scores.values()) {
      sum += score;
    }
    return (double) sum /scores.size();
  }

  public void transfer() {
    ++course;
    System.out.println(this + " переведен на " + course);
  }
}
