package _10_java_colection_frameword.test_sap_xep;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] moesPints =  new int[]{9,8,7,6,1};
        Arrays.sort(moesPints);
        Arrays.stream(moesPints).forEach(System.out::println);
    }
}
