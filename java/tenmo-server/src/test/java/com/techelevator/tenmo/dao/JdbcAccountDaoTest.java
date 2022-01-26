package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Balance;
import org.junit.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.test.context.event.annotation.AfterTestClass;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import java.math.BigDecimal;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class JdbcAccountDaoTest {
    public static SingleConnectionDataSource ds;
    private JdbcTemplate jdbcTemplate;
    private AccountDao dao;

    @BeforeClass
    public static void beforeEverything(){
        ds = new SingleConnectionDataSource();
        ds.setUrl("jdbc:postgresql://localhost:5432/tenmo");
        ds.setUsername("postgres");
        ds.setPassword("postgres1");
        ds.setAutoCommit(false);

    }

    @AfterClass
    public static void afterEverything(){
        ds.destroy();
    }

    @Before
    public void beforeEach(){
        this.jdbcTemplate = new JdbcTemplate(this.ds);
        this.dao = new JdbcAccountDao(jdbcTemplate);

        loadData();
    }

    @After
    public void afterEach() throws SQLException {
        ds.getConnection().rollback();
    }

    public void loadData(){
        String sql = "INSERT INTO users(user_id, username, password_hash) VALUES (8001, 'Melissa', 'aaa')";
        jdbcTemplate.update(sql);

        String sql2 = "INSERT INTO accounts(account_id, user_id, balance) VALUES (9001, 8001, 1000)";
        jdbcTemplate.update(sql2);
    }

    @Test
    public void testRetrieveBalance(){
        BigDecimal expected = new BigDecimal("1000.00");
        BigDecimal actual = this.dao.retrieveBalance(8001);
        assertEquals(expected,actual);
    }

}