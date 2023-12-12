import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    FileInputStream studentFile = null;
    ArrayList<Student> students = new ArrayList<Student>();
    try {
      studentFile = new FileInputStream("resources/StudentFile.txt");
    } catch (IOException e) {
      System.out.println("That's not a file silly lee!");
    }

    // read in all the students
    Scanner s = new Scanner(studentFile);
    Student temp = new Student(s.nextLine());
    students.add(temp);
    while (s.hasNextLine()) {
      temp = new Student(s.nextLine());
      students.add(temp);
      /*
       * //a failed attempt to insertion sort
       * int here = 0;
       * for (int x = 0; x < students.size(); x++) { // assume sorted already
       * if (students.get(x).getLastName().compareTo(temp.getLastName()) > 0) {
       * here = x;
       * students.add(here + 1, temp);
       * break; //this should just be doing insertion soooort
       * //why's it not workiiiing
       * }
       * }
       */
    }

    s.close();

    // made school
    FileInputStream schoolFile = null;
    ArrayList<University> schools = new ArrayList<University>();
    try {
      schoolFile = new FileInputStream("resources/Universities9.txt");
    } catch (IOException e) {
      System.out.println("That's not a file silly");
    }

    // read in all the universities
    Scanner sc = new Scanner(schoolFile);
    University hi;
    schools.add(new University(sc.nextLine()));
    while (sc.hasNextLine()) {
      hi = new University(sc.nextLine());
      schools.add(hi);
      /*
       * //a failed attempt to insertion sort
       * int here = 0;
       * for (int x = 0; x < students.size(); x++) { // assume sorted already
       * if (students.get(x).getLastName().compareTo(temp.getLastName()) > 0) {
       * here = x;
       * students.add(here + 1, temp);
       * break; //this should just be doing insertion soooort
       * //why's it not workiiiing
       * }
       * }
       */
    }

    sc.close();

    FileOutputStream fileStream = null;
    PrintWriter outer = null;

    // Try to open file
    try {
      fileStream = new FileOutputStream("resources/Output.txt");
    } catch (IOException e) {
      System.out.println("jfa;l fk not a FILE silly");
    }
    outer = new PrintWriter(fileStream);

    // ArrayList of students for each school
    ArrayList<Student>[] schoolLists = new ArrayList[10]; // ehhhhh
    for (int x = 0; x < 10; x++) {
      schoolLists[x] = new ArrayList<Student>();
    }

    // lowkey I can just do the sorting here
    // they won't know the difference :)
    // TODO
    int index = 0;
    for (int x = 0; x < schools.size(); x++) {
      for (int y = 0; y < students.size(); y++) {
        if (students.get(y).getUniversityName().equals(schools.get(x).getName()))
          // failed insertion sort follows
          for (int z = 0; z < schoolLists[x].size(); z++) {
            // if students.get(y) comes before schoolLists[x].get(z)
            if (students.get(y).compareTo(schoolLists[x].get(z)) < 0)
              index = z;
          }
        schoolLists[x].add(/* index, */students.get(y));
      }
    }

    // print the students at each school (do not print duplicates)
    boolean print = true;
    for (int x = 0; x < schools.size(); x++) {
      ArrayList<Student> printed = new ArrayList<Student>();
      outer.println(x + 1 + ". " + schools.get(x) + ":");
      for (Student student : schoolLists[x]) {
        print = true;
        for (Student printedStudent : printed) {
          if (printedStudent.equals(student))
            print = false;
        }
        if (print) {
          outer.println(student);
          printed.add(student);
        }
      }
      outer.println("");
    }

    outer.close(); // THIS MAKES A DIFFERENCE WOW
  }
}
