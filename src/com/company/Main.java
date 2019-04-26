package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<String> rice = new ArrayList<String>();
        rice.add("white rice");
        rice.add("brown rice");
        rice.add("no rice");

        for (int row = 1; row <= 10; row++){
            int randomRiceIndex = random.nextInt(rice.size());
            System.out.println("Burito " + row +
                    ": " + rice.get(randomRiceIndex));
        }

//        int randomRiceIndex = random.nextInt(rice.size());
//        System.out.println(rice.get(randomRiceIndex));
//        System.out.println(rice.get(randomRiceIndex));
//        System.out.println(rice.get(randomRiceIndex));
//        System.out.println(rice.get(randomRiceIndex));

//        Collections.sort(rice);
//        System.out.println(rice);
//        Collections.shuffle(rice);
//        System.out.println(rice);
//        System.out.println(rice.get(0));

//        for (int i = 0; i < 10; i++) {
//            System.out.println("dd");
//        }
//        for (String r:rice) {
//            System.out.println(r);
//        }
//        System.out.println(rice);
//


//        int searchIndex = Collections.binarySearch(rice, 0);
//        if (searchIndex >=0) {
//
//        }
    }
}
