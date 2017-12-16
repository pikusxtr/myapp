package com.mycompany.app.udemy.external;

import java.sql.SQLException;

public class ExceptionsDemo {
    public static void main(String[] args)  {
Account acc = new Account();
        try {
            acc .withdraw(100);
            System.out.println("in try---after method that needs exception");
        } catch (SQLException e) {
            System.out.println(e.getMessage());        }
            finally {
            System.out.println("finally part");
        }
    }
}
