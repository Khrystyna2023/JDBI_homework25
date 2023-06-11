package utils;

import models.MyPersons;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBReader {
    private final static String URL = "jdbc:postgresql://localhost:5432/postgres"; // константа урл для підключення до бд
    private final static String USER_NAME = "postgres"; // юзер нейм для підключенні до бд
    private final static String USER_PASSWORD = "postgres"; // пароль
    private final static String QUERY_SELECT = "select * from myPerson where id = ?";
    private final static String QUERY_INSERT = "insert into myPerson values(?,?,?)";
    private final static String QUERY_UPDATE = "update myPerson set age=? where id=?";
    private final static String QUERY_DELETE = "delete from myPerson where id=?";

    public static List<MyPersons> getDateFromDB(){
        List <MyPersons> persons1 = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL,USER_NAME, USER_PASSWORD)){ // Конект  до бд. ТАкож треба прокинути ексепшин, наприклад, помилка в підключені до бд, помилка в юзернейм і так далі
//          Statement sqlStatement = connection.createStatement();  //
//          ResultSet resultSet = sqlStatement.executeQuery(QUERY); // обєкт який тримає конкшин, доступ до обєктів бд. Але це не результам,
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_SELECT);
            preparedStatement.setInt(1, 1); //select

            ResultSet resultSet = preparedStatement.executeQuery(); // використовуємо для select

            while (resultSet.next()){
                MyPersons person = new MyPersons(resultSet.getString("firstName"), resultSet.getInt("age"));
                persons1.add(person);
            }

        }catch (SQLException exception){
            throw new RuntimeException(String.format("Please check connection string" +
                    ". URL[%s], name [%s], pass [%s]", URL, USER_NAME, USER_NAME));
        }
        return persons1;

    }
    public static void getInsert(int id, String firstName, int age){
        try (Connection connection = DriverManager.getConnection(URL,USER_NAME, USER_PASSWORD)){ // Конект  до бд. ТАкож треба прокинути ексепшин, наприклад, помилка в підключені до бд, помилка в юзернейм і так далі
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_INSERT);
            preparedStatement.setInt(1,25); // insert id = 2
            preparedStatement.setString(2, "Qwewe"); // insert firstName = Qwewe
            preparedStatement.setInt(3, 61); // insert age = 61
            preparedStatement.setInt(1,105);
            preparedStatement.setString(2, "Bob");
            preparedStatement.setInt(3, 26);

            preparedStatement.executeUpdate(); // update for insert comand

        }catch (SQLException exception){
            throw new RuntimeException(String.format("Please check connection string" +
                    ". URL[%s], name [%s], pass [%s]", URL, USER_NAME, USER_NAME));
        }
    }
    public static void getUpdate(int id, int age){
        try (Connection connection = DriverManager.getConnection(URL,USER_NAME, USER_PASSWORD)){ // Конект  до бд. ТАкож треба прокинути ексепшин, наприклад, помилка в підключені до бд, помилка в юзернейм і так далі
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_UPDATE);
            preparedStatement.setInt(1, 76); //update age for id=105
            preparedStatement.setInt(2,105); //update age for id=105

            preparedStatement.executeUpdate(); // update for update comand

        }catch (SQLException exception){
            throw new RuntimeException(String.format("Please check connection string" +
                    ". URL[%s], name [%s], pass [%s]", URL, USER_NAME, USER_NAME));
        }
    }
    public static void getDelete(int id){
        try (Connection connection = DriverManager.getConnection(URL,USER_NAME, USER_PASSWORD)){ // Конект  до бд. ТАкож треба прокинути ексепшин, наприклад, помилка в підключені до бд, помилка в юзернейм і так далі
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE);
            preparedStatement.setInt(1,1); // delete row with id=1
            preparedStatement.executeUpdate(); // update for delete comand

        }catch (SQLException exception){
            throw new RuntimeException(String.format("Please check connection string" +
                    ". URL[%s], name [%s], pass [%s]", URL, USER_NAME, USER_NAME));
        }
    }
    public static void main(String[] args){
            getDateFromDB();
    }
}
