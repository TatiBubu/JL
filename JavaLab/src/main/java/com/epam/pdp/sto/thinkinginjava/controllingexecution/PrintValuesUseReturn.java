package com.epam.pdp.sto.thinkinginjava.controllingexecution;

/**
 * Created by Tetyana_Stolyarova on 7/25/2016.
 * Exercise 7: (1) Modify Exercise 1 so that the program exits by using the break keyword at value 99.
 * Try using return instead.
 */
public class PrintValuesUseReturn {
    public static void main(String[] args) {
        int index;
        for (index = 1; index <= 100; index++) {
            if (index == 99) {
                return;
            }
            System.out.println("index = " + index);
        }
    }
}
/*
 Output:
 index = 1
 index = 2
 index = 3
 index = 4
 index = 5
 index = 6
 index = 7
 index = 8
 index = 9
 index = 10
 index = 11
 index = 12
 index = 13
 index = 14
 index = 15
 index = 16
 index = 17
 index = 18
 index = 19
 index = 20
 index = 21
 index = 22
 index = 23
 index = 24
 index = 25
 index = 26
 index = 27
 index = 28
 index = 29
 index = 30
 index = 31
 index = 32
 index = 33
 index = 34
 index = 35
 index = 36
 index = 37
 index = 38
 index = 39
 index = 40
 index = 41
 index = 42
 index = 43
 index = 44
 index = 45
 index = 46
 index = 47
 index = 48
 index = 49
 index = 50
 index = 51
 index = 52
 index = 53
 index = 54
 index = 55
 index = 56
 index = 57
 index = 58
 index = 59
 index = 60
 index = 61
 index = 62
 index = 63
 index = 64
 index = 65
 index = 66
 index = 67
 index = 68
 index = 69
 index = 70
 index = 71
 index = 72
 index = 73
 index = 74
 index = 75
 index = 76
 index = 77
 index = 78
 index = 79
 index = 80
 index = 81
 index = 82
 index = 83
 index = 84
 index = 85
 index = 86
 index = 87
 index = 88
 index = 89
 index = 90
 index = 91
 index = 92
 index = 93
 index = 94
 index = 95
 index = 96
 index = 97
 index = 98

 Process finished with exit code 0
*/
