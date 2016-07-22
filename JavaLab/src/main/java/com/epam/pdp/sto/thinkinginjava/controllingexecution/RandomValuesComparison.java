package com.epam.pdp.sto.thinkinginjava.controllingexecution;

import java.util.Random;

/**
 * Created by Tetyana_Stolyarova on 6/21/2016.
 * Exercise 2: (2) Write a program that generates 25 random int values.
 * For each value, use an if-else statement to classify it as greater than, less than,
 * or equal to a second randomly generated value.
 */

public class RandomValuesComparison {
    public static void main(String[] args) {
        Random rand = new Random(100);
        for (int i = 1; i <= 25; i++) {
            int randNumber1 = rand.nextInt();
            int randNumber2 = rand.nextInt();
            if (randNumber1 > randNumber2) {
                System.out.println(randNumber1 + " > " + randNumber2);
            } else if (randNumber1 < randNumber2) {
                System.out.println(randNumber1 + " < " + randNumber2);
            } else {
                System.out.println(randNumber1 + " = " + randNumber2);
            }

        }

    }
}
/*Output:
//-1193959466 < -1139614796
//837415749 > -1220615319
//-1429538713 < 118249332
//-951589224 < 1301674577
//-1638067850 < -1279751870
//-1618786051 < 1068497434
//1016840512 < 1147896915
//2092624704 > 464282119
//-1372576535 < -816276339
//-2042061750 < 1232802238
//2134557307 > 1785100857
//-38714166 > -2128779752
//-463255762 < 377763062
//1493735697 > 1327222584
//2016372201 > 54569456
//-1849457347 < -1703529506
//-1526031864 < 834961746
//-922568807 < -588859907
//650170975 > -345860360
//521203012 < 1001630858
//1774864511 > -486950295
//1231480079 > -1782126954
//-1612249033 < 480115204
//-1153360725 < -393376866
//2087512925 > 1001319800
 */
