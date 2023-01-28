package com.mjc.stage2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private static String driver = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:file:C:\\Users\\USER\\Desktop\\db_SQL_task\\University;DB_CLOSE_DELAY=-1;MODE=MySQL;NON_KEYWORDS=GROUP,USER";

    private static String CREATE = "lesson6/src/main/resources/CREATE.sql";
    private static String PAYMENT = "lesson6/src/main/resources/PAYMENT.sql";
    private static String PAYMENTTYPE = "lesson6/src/main/resources/PAYMENTTYPE.sql";
    private static String STUDENT = "lesson6/src/main/resources/STUDENT.sql";
    private static String SUBJECT = "lesson6/src/main/resources/SUBJECT.sql";
    private static String MARK = "lesson6/src/main/resources/MARK.sql";


    public static void main(String[] args) throws RuntimeException {

        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(DB_URL);
            Statement statement = connection.createStatement();

            BufferedReader paymenttype = new BufferedReader(new FileReader(new File(PAYMENTTYPE)));
            insert(paymenttype, statement);

            BufferedReader student = new BufferedReader(new FileReader(new File(STUDENT)));
            insert(student, statement);

            BufferedReader payment = new BufferedReader(new FileReader(new File(PAYMENT)));
            insert(payment, statement);

            BufferedReader subject = new BufferedReader(new FileReader(new File(SUBJECT)));
            insert(subject, statement);

            BufferedReader mark = new BufferedReader(new FileReader(new File(MARK)));
            insert(mark, statement);

            statement.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException | IOException ex) {
            throw new RuntimeException(ex);
        }
    }


    private static void insert(BufferedReader br, Statement statement) throws IOException, SQLException {
        String currentLine = br.readLine();
        while (!(currentLine == null)) {
            statement.executeUpdate(currentLine);
            currentLine = br.readLine();
        }
    }
}
