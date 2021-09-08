package net.technopc.springboot;

import net.technopc.springboot.model.Employee;
import net.technopc.springboot.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackend1Application implements Runnable {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackend1Application.class, args);
	}
    private EmployeeRepository employeeRepository ;

    @Override
    public void run() {
        employeeRepository.save(new Employee(1,"rrr","jnjndj","jhj"));

    }
}
