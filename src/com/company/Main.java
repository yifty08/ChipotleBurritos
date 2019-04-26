package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> rice = new ArrayList<String>();
        rice.add("white rice");
        rice.add("brown rice");
        rice.add("no rice");

        Collections.sort(rice);
        System.out.println(rice);
        Collections.shuffle(rice);
        System.out.println(rice);
        System.out.println(rice.get(0));

        for (String r:rice) {
            System.out.println(r);
        }
        System.out.println(rice);

//        int searchIndex = Collections.binarySearch(rice, 0);
//        if (searchIndex >=0) {
//
//        }
    }
}
