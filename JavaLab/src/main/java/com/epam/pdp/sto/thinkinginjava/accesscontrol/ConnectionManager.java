package com.epam.pdp.sto.thinkinginjava.accesscontrol;

/**
 * Created by Tetyana_Stolyarova on 8/23/2016.
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
