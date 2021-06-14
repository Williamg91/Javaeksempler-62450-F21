package org.example.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface SQLITEInterface {
     String SQLITEDriver = "jdbc:sqlite:";
     String address="";
     String url = SQLITEDriver+address;



}
