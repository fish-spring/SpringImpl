package jdbc;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class TransactionTest extends BaseTest {
    @Autowired
    private JdbcTemplate c3p0Template;

    @Test
    public void transaction(){

    }
}
