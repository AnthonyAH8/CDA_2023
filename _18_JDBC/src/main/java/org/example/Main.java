package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo_jdbc";
        String user = "root";
        String password = "root";

        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            if (connection != null){
                System.out.println("Connexion réussie");

//                String request = "INSERT INTO person(firstname, lastname) VALUE ('Titi', 'Toto')";
//                Statement Statement = connection.createStatement();
//                boolean result = Statement.execute(request);


                String request2 = "INSERT INTO person(firstname, lastname) VALUE (?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(request2, Statement.RETURN_GENERATED_KEYS);
                preparedStatement.setString(1, "firstname");
                preparedStatement.setString(2, "lastname");

                int row = preparedStatement.executeUpdate();
                ResultSet resultSetKey = preparedStatement.getGeneratedKeys();
                if (row>0){
                    System.out.println("Personne ajoutée");
                }if (resultSetKey.next()){
                    System.out.println("ID :" + resultSetKey.getInt(1));
                }


            } else {
                System.out.println("Erreur dans la connexion");
            }
        } catch (SQLException exception){
            throw new RuntimeException(exception);
        }
    }
}
