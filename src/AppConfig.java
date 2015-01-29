import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by daniel.arlitt on 1/28/15.
 */

@Configuration
@ComponentScan({"com.pluralsight"})
@PropertySource("app.properties")
public class AppConfig {

  @Bean
  public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
    return new PropertySourcesPlaceholderConfigurer();
  }

  @Bean(name = "customerService")
//  @Scope("singleton")
//  @Scope("prototype")
  public CustomerService getCustomerService() {

    // Autowired
    CustomerServiceImpl customerService = new CustomerServiceImpl();

    // Constructor Injection
    // CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());

    // Setter Injection
    // CustomerServiceImpl customerService = new CustomerServiceImpl();
    // customerService.setCustomerRepository(getCustomerRepository());

    return customerService;
  }

//  @Bean(name = "customerRepository")
//  public CustomerRepository getCustomerRepository() {
//    return new HibernateCustomerRepositoryImpl();
//  }

}
