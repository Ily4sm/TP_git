package com.ehei.gi4;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String text1 = "Bonjour tout le monde";
        String text2 = "Hello";
        String text3 = "Developpement";

        wrapper wrapper = new wrapper();

        String result1 =  wrapper.abrv(text1 , 10);
        String result2 =  wrapper.abrv(text2 , 10);
        String result3 =  wrapper.abrv(text3 , 3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

}
