package com.company;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.company.InterfaceFake.status;
import static com.company.TestFunction.inPort;

public  class Main {
     private static int number2;
     private  static boolean check;
    public  static void main(String[] args) {
//       String s1 = "cat";
//       String s2 = "cat";
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//       String s3 = new String("dog");
//       String s5 = new String ("dog");
//        System.out.println(s5.hashCode());
//       String s4 = s3;
//        System.out.println(s3.hashCode());
//        System.out.println(s4.hashCode());


//        StringBuilder sbd = new StringBuilder("kakaka");
//        StringBuffer sbd2 = new StringBuffer("lot");
//        System.out.println(sbd.hashCode());
//        System.out.println(sbd);
//        System.out.println(sbd.append(sbd2).hashCode());
//        System.out.println(sbd.append(sbd2));
//
//        StringBuffer sbf = new StringBuffer("kakaka");
//        StringBuffer sbf2 = new StringBuffer("lot");
//        System.out.println(sbf.hashCode());
//        System.out.println(sbf);
//        System.out.println(sbf.append(sbf2).hashCode());
//        System.out.println(sbf.append(sbf2));


        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(3);
        numberList.add(5);
        numberList.add(2);
        numberList.add(6);
        Iterator<Integer> numerIterator = numberList.iterator();

        System.out.println(numerIterator.toString());




    }

    public static int check(){
        int number;
        System.out.println(number2);
//        System.out.println(number);
        return number2;
    }
}
