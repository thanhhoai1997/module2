package _10_java_colection_frameword.th_comparable_comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("kien",30,"ht");
        Student student1 = new Student("Nam",26,"hn");
        Student student2 = new Student("Anh",38,"ht");
        Student student3 = new Student("Tung",389,"ht");
        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.forEach(v->System.out.println(v.toString()));
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("so sanh theo tuoi");
        for (Student s: list
             ) {
            System.out.println(s.toString());

        }
    }



}
