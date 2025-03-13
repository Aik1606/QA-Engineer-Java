package lesson9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class Main {
  public static void main(String[] args) {
    Set<Student> students = new HashSet<>();

    String[] names = {"Иван", "Мария", "Алексей", "Ольга", "Дмитрий", "Анна", "Сергей", "Елена", "Андрей", "Татьяна",
        "Павел", "Юлия", "Николай", "Екатерина", "Артем", "Наталья", "Игорь", "Светлана", "Владимир", "Виктория", "Михаил"};
    String[] groups = {"Ф1", "Ф2", "Ф3", "Ф4", "Ф5"};
    String[] subjects = {"Математика", "Физика", "Химия", "Биология", "История", "Литература", "Информатика"};
    int[] courses = {1, 2, 3, 4, 5};

    for (int i = 0; i < 21; i++) {
      String name = names[i % names.length];
      String group = groups[(int) (Math.random() * groups.length)];
      int course = courses[(int) (Math.random() * courses.length)];

      HashMap<String, Integer> grades = new HashMap<>();
      for (int j = 0; j < 3; j++) { // Добавляем 3 случайных предмета с оценками
        String subject = subjects[(int) (Math.random() * subjects.length)];
        int grade = (int) (Math.random() * 4) + 2; // Оценка от 2 до 5
        grades.put(subject, grade);
      }

      students.add(new Student(name, group, course, grades));
    }

    // Вывод всех студентов
    for (Student student : students) {
      System.out.println(student);
    }
    transfer(students);
    expel(students);
    printStudents(students, 2);
  }

  public static void expel(Set<Student> students) {
    students.removeIf(student -> {
      if (student.gen() < 3) {
        System.out.println(student + "отчислен");
        return true;
      }
      return false;
    });
    for (Student student : students) {
      System.out.println(student + " оcтались");
    }
  }

  public static void transfer(Set<Student> students) {
    for (Student student : students) {
      if (student.gen() >= 3) {
        student.transfer();
      }
    }
  }

  public static void printStudents(Set<Student> students, int course) {
    System.out.println("на курсе "  + course + " обучаются:");
    for (Student student : students) {
      if (student.course == course) {
        System.out.println(student.name);
      }
    }
  }
}