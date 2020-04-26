package streafa.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Arrays;

@Configuration
public class DBConfiguration {

    private DataSource dataSource;

    @Autowired
    public DBConfiguration(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate()
    {
        return new JdbcTemplate(dataSource);
    }

    public void createSchema()
    {
        String[] sql_queries = {
                "CREATE TABLE polcar_stock_list(product_id varchar(100) PRIMARY KEY, stock int)",
                "CREATE TABLE polcar_price_list(product_id varchar(100) PRIMARY KEY , price decimal(16,4))",
                "CREATE UNIQUE INDEX polcar_stock_list_u_i ON polcar_stock_list (product_id)",
                "CREATE UNIQUE INDEX polcar_price_list_u_i ON polcar_price_list (product_id)"
        };

        //Arrays.asList(sql_queries).stream().forEach(sql -> getJdbcTemplate().update(sql));

     }

}
