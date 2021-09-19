package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Parva
 */
public class connectionProvider {
    private static Connection con;

    public static Connection getConnection() {
        try {

           Class.forName("com.mysql.jdbc.Driver");

                //create a connection..
                con = DriverManager.
                  getConnection("jdbc:mysql://localhost:3306/techblog", "root", "");
            System.out.println("connected");


        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
