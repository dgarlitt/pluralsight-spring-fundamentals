import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by daniel.arlitt on 1/28/15.
 */

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

  @Bean(name = "customerService")
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
