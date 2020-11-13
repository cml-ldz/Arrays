package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student("rose",14));
        list.add(new Student("jack",20));
        list.add(new Student("abc",19));
        list.add(new Student("ace",17));
        list.add(new Student("mark",16));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().length()-o2.getName().length();
            }
        });

        for (Student student : list) {
            System.out.println(student);
        }
    }
}
