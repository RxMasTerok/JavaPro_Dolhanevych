package lesson.four;

import java.util.Arrays;

public class LeetCode {

    public static void main(String[] args) {

        isAnagram("cat", "tac");
    }



    static boolean isAnagram(String s, String t){
        char[] chars1 = s.toCharArray();
        Arrays.sort(chars1);
        s = new String(chars1);

        System.out.println(s);

        char[] chars2 = t.toCharArray();
        Arrays.sort(chars2);
        t = new String(chars2);

        System.out.println(t);

        if((s.equals(t))){
            System.out.println("true");
        }else {
            System.out.println("False");
        }
        return false;
    }

}