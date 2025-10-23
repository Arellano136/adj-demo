package adj.demo.server.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
public class dBConnection {

  @Value("${db.host}")
  private String host;

  @Value("${db.port}")
  private String port;

  @Value("${db.name}")
  private String name;

  @Value("${db.user}")
  private String user;

  @Value("${db.pass}")
  private String pass;

  @Bean
  public DataSource getDBConnection() {
    DriverManagerDataSource source = new DriverManagerDataSource();
    source.setDriverClassName("com.mysql.cj.jdbc.Driver");
    source.setUrl("jdbc:mysql://" + host + ":" + port + "/" + name);
    source.setUsername(user);
    source.setPassword(pass);

    // Verificar conexión y mostrar mensaje en consola
    try (Connection connection = source.getConnection()) {
      System.out.println("onexión exitosa a la base de datos: " + name + " en " + host + ":" + port);
    } catch (SQLException e) {
      System.err.println("Error al conectar con la base de datos: " + e.getMessage());
    }

    return source;
  }
}
