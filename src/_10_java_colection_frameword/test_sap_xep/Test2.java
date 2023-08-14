package _10_java_colection_frameword.test_sap_xep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Test> tests = new ArrayList<>();
        tests.add(new Test("hoai"));
        tests.add(new Test("toai"));
        tests.add(new Test("coai"));
        tests.add(new Test("joai"));
        tests.add(new Test("ioai"));

        Collections.sort(tests);
        Collections.reverse(tests);
        tests.stream().forEach(System.out::println);



    }
}
