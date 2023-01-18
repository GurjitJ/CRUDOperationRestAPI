package employee.example.springboot;

import employee.example.springboot.repository.EmployeeRepository;
import employee.example.springboot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootbackendApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootbackendApplication.class, args);

		}
	}

