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

        ArrayList<String> meat = new ArrayList<String>();
        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("veggies");

        ArrayList<String> beans = new ArrayList<String>();
        beans.add("pinto");
        beans.add("black");
        beans.add("no beans");

        ArrayList<String> salsa = new ArrayList<String>();
        salsa.add("mild");
        salsa.add("medium");
        salsa.add("hot");
        salsa.add("no salsa");

        ArrayList<String> veggies = new ArrayList<String>();
        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("no veggies");

        for (int i = 1; i <= 10; i++){
            int riceIndex = random.nextInt(rice.size());
            int meatIndex = random.nextInt(meat.size());
            int beansIndex = random.nextInt(beans.size());
            int salsaIndex = random.nextInt(salsa.size());
            int veggiesIndex = random.nextInt(veggies.size());
            System.out.println("Burrito " + i + ": " +
                    rice.get(riceIndex) + ", " +
                    meat.get(meatIndex) + ", " +
                    beans.get(beansIndex) + ", " +
                    salsa.get(salsaIndex) + ", " +
                    veggies.get(veggiesIndex));
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
