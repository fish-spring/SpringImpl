package jdbc;

import com.alibaba.fastjson.JSONObject;
import jdbc.entity.User;
import jdbc.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TemplateBeanTest extends BaseTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private JdbcTemplate c3p0Template;

    @Test
    public void insert(){
        String sql = "insert into user(name, password) values(?, ?)";
        int res = jdbcTemplate.update(sql, "Jon Snow", "123456");
        Assert.assertEquals(1, res);
    }
    @Test
    public void insertWithC3p0(){
        String sql = "insert into user(name, password) values(?, ?)";
        int res = c3p0Template.update(sql, "Jon Snow", "123456");
        Assert.assertEquals(1, res);
    }
    @Test
    public void updateWithC3p0(){
        String sql = "update user set name = ? where id = ?";
        int res = c3p0Template.update(sql, "Jan", 3);
        Assert.assertEquals(1, res);
    }

    @Test
    public void selectOneWithC3p0(){
        String sql = "select name from user where id = ?";
        String name = c3p0Template.queryForObject(sql, String.class, 2);
        System.out.println(name);
        // Jon Snow

        String countSql = "select count(*) from user";
        Integer count = c3p0Template.queryForObject(countSql, Integer.class);
        System.out.println(count);
        // 6

    }
    @Test
    public void selectOneObjectWithC3p0(){
        String rowSql = "select * from user where id = ?";
        User user = c3p0Template.queryForObject(rowSql, new UserMapper(), 1);
        System.out.println(JSONObject.toJSONString(user));
        // {"id":1,"name":"Jon Snow","password":"123456"}
    }
    @Test
    public void selectListWithC3p0(){
        String rowSql = "select * from user where id < ?";
        List<User> users = c3p0Template.query(rowSql, new UserMapper(), 3);
        System.out.println(JSONObject.toJSONString(users));
        // [{"id":1,"name":"Jon Snow","password":"123456"},
        // {"id":2,"name":"Jon Snow","password":"123456"}]
    }
}