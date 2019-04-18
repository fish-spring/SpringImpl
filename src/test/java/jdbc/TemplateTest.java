package jdbc;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TemplateTest {
    private static JdbcTemplate template;
    @BeforeClass
    public static void init(){
        DriverManagerDataSource source
                = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/spring_manual");
        source.setUsername("root");
        template = new JdbcTemplate(source);
    }

    @Test
    public void insert(){
        String sql = "insert into user(name, password) values(?, ?)";
        int res = template.update(sql, "Jon Snow", "123456");
        Assert.assertEquals(1, res);
    }
    @Test(expected = BadSqlGrammarException.class)
    public void insertError(){
        // not exist fields
        String sql = "insert into user(name__, password__) values(?, ?)";
        int res = template.update(sql, "Jon Snow", "123456");
    }

    @Test
    public void query(){
    }
}
