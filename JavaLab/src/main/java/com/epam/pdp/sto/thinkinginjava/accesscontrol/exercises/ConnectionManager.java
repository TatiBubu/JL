package com.epam.pdp.sto.thinkinginjava.accesscontrol.exercises;

/**
 * Created by Tetyana_Stolyarova on 8/23/2016.
 * This is class called ConnectionManager that manages a fixed array of Connection objects;
 * it helps to resolve EX8; follow ConnectionManagerApp for full solution.
 */
public class ConnectionManager {

static Connection [] connArr = new Connection[3];

    {

        for (Connection con : connArr) {

            con = Connection.makeConnection();
        }
    }

    static int arrLength = connArr.length;

    public static Connection getConnection() {
        if (arrLength > 0) {
            return connArr[--arrLength];
        } else            {
            System.out.println("ConnectionManager runs out of objects");
            return null;
        }

    }


}
