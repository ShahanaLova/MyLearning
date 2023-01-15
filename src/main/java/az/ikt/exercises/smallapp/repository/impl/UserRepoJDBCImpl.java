package az.ikt.exercises.smallapp.repository.impl;

import az.ikt.exercises.smallapp.model.Sql;
import az.ikt.exercises.smallapp.model.User;
import az.ikt.exercises.smallapp.repository.UserRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepoJDBCImpl implements UserRepository {

    Connection con;
    private final Statement stmt;

    public UserRepoJDBCImpl() {
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","sql2023");
            this.stmt = con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void save(User user) {
        try {
            stmt.execute("insert into users(id,username,password,person_id)" +
                    String.format("values('%s','%s','%s','%s')",
                            user.getId(), user.getUsername(), user.getPassword(), user.getPersonId()));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> getAll() {
        try {
            ResultSet rs = stmt.executeQuery("select id, username,password,person_id from users");
            List<User> userList = new ArrayList<>();

            while (rs.next()) {
                User user = new User();
                user.setId(rs.getLong("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setPersonId(rs.getLong("person_id"));
                userList.add(user);
            }
            return userList;
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

    }

    @Override
    public User getById(Long aLong) {
        try {
            ResultSet rs = stmt.executeQuery("select id, username,password,person_id from users\n" +
                    "where id =" + aLong);
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getLong(0));
                user.setUsername(rs.getString(1));
                user.setPassword(rs.getString(2));
                user.setPersonId(rs.getLong(3));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return new User();
    }

    @Override
    public void delete(User user) {
        try {
            stmt.execute("delete from users");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteById(Long aLong) {
        try {
            stmt.execute("delete from users where id = " + aLong);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Long findMaxId() {

        try {
           ResultSet rs = stmt.executeQuery(Sql.FIND_MAX_USERID.getValue());
            while (rs.next()){
                return  rs.getLong("max");
            }
        } catch (SQLException e) {
           e.printStackTrace();
           return 0L;
        }
        return 0L;
    }
}
