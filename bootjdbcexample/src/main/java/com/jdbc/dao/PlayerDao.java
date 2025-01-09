package com.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public PlayerDao() {
    }

    public int createTable() {

        String query = "CREATE TABLE IF NOT EXISTS Player(id int primary key, name varchar(255), " +
                "age int, city varchar(255))";

        int update = jdbcTemplate.update(query);

        return update;
    }

    public int insertPlayer(Integer id, String name, Integer age, String city) {

        String insertQuery = "INSERT INTO PLAYER (ID, NAME, AGE, CITY) " +
                "VALUES (?, ?, ?, ?)";

        int update = jdbcTemplate.update(insertQuery, new Object[]{id, name, age, city});

        return update;

    }

    public int updatePlayer(Integer id, String name, Integer age, String city) {

        String updateQuery = "UPDATE PLAYER SET NAME = ?, AGE = ?, CITY = ? WHERE ID = ?";

        int update = jdbcTemplate.update(updateQuery, new Object[]{name, age, city, id});

        return update;

    }

    public int deletePlayer(Integer id) {

        String updateQuery = "DELETE FROM PLAYER WHERE ID = ?";

        int delete = jdbcTemplate.update(updateQuery, new Object[]{id});

        return delete;

    }
}
