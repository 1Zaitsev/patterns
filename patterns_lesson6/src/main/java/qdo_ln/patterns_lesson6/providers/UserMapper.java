package qdo_ln.patterns_lesson6.providers;

import org.springframework.stereotype.Component;
import qdo_ln.patterns_lesson6.entities.User;

import java.sql.*;

@Component
public class UserMapper {

    public User getUserById(int id) {
        try(Connection connection = DriverManager.getConnection("com.mysql.cj.jdbc.Driver");){
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT `id`, `phone_number`, `password`, `email`, `first_name`, `last_name` FROM `q_shop.users` WHERE `id` = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setFirstName(resultSet.getString("first_name"));
                user.setLastName(resultSet.getString("last_name"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
