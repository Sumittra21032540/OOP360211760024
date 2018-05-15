package lab7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StudentAppArrayList {
    public static void main (String[] args);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println ("How many data you do have: ");
    int val = Integer.parseInt(reader.readLine());
    ArrayList<String> myList = new ArrayList<Student>();
     myList = inputData (myList,val);
}//main
  private static ArrayList inputData (ArrayList<Student> myList, int vall) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 1; i , <= val; i++)
        Student s = new
  }
