package org.example.Database;

import java.sql.Connection;

public class DBAccessTester {


    public static void main(String[] args) {
        ConnectionDRYnSOC cdns = new ConnectionDRYnSOC();
        Connection connection = cdns.getMYSQLConnection("root","Fisken91","SundhedsteknologiDB");
        DBAccess dba = new DBAccess(connection);

        dba.insertUser("Maya@dtu.dk222","hestenet");
      String[] combo=  dba.getUserAndPassword("Maya@dtu.dk","hestenet");
        System.out.println(combo[0]+combo[1]);
    }
}
