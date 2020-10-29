package com.woodongs.inflearn.intellij;

public class LiveTemplate {

    public static void main(String[] args, int num) {

        String message = String.format("%d + %d", num, 2);
        System.out.println(num);
        System.out.println(num);
        System.out.println(String.format("%d + %d", num, 2));

        String a = "a";
        if (a == null) {
            System.out.println("a is null");
        }

    }

}
