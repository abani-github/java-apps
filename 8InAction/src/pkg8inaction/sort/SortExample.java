/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8inaction.sort;

import java.util.Arrays;

/**
 *
 * @author abani_000
 */
public class SortExample {
    public static void main(String[] args) {
        String[] words = {"a", "b", "d", "c"};
        Arrays.sort(words, (s1, s2) -> s1.compareTo(s2));
        System.out.println(Arrays.toString(words));
    }   
}
