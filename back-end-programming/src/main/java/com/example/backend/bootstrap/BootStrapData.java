package com.example.backend.bootstrap;

import com.example.backend.dao.CustomerRepository;
import com.example.backend.dao.DivisionRepository;
import com.example.backend.entities.Customer;
import com.example.backend.entities.Division;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {


    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;


    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository){
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }


    @Override
    public void run(String... args) throws Exception {


        // Check if a customer with the same details already exists
        if (customerRepository.findByFirstNameAndLastName("Albert", "Suarez") == null) {
            // if the Customer details do not exist, so create and save the customer
            Division division1 = divisionRepository.findById(20L).orElse(null);
            divisionRepository.save(division1);
            Customer Albert = new Customer("Albert","Suarez","Elizabeth av 1432","34985","8764567654",division1);
            customerRepository.save(Albert);
        }

        if (customerRepository.findByFirstNameAndLastName("Antonia", "Jackson") == null) {
            Division division2 = divisionRepository.findById(25L).orElse(null);
            divisionRepository.save(division2);
            Customer Antonia = new Customer("Antonia", "Jackson", "Cutsong av 3332", "00485", "876444444", division2);
            customerRepository.save(Antonia);
        }

        if (customerRepository.findByFirstNameAndLastName("Sasha", "Gray") == null) {
            Division division3 = divisionRepository.findById(26L).orElse(null);
            divisionRepository.save(division3);
            Customer Sasha = new Customer("Sasha", "Gray", "Jaime street av 1772", "3335", "871111154", division3);
            customerRepository.save(Sasha);
        }

        if (customerRepository.findByFirstNameAndLastName("Patrick", "Tellez") == null) {
            Division division4 = divisionRepository.findById(28L).orElse(null);
            divisionRepository.save(division4);
            Customer Patrick = new Customer("Patrick", "Tellez", "Mongomerit av 1222", "30005", "876466666", division4);
            customerRepository.save(Patrick);
        }

        if (customerRepository.findByFirstNameAndLastName("Thomas", "Whites") == null) {
            Division division5 = divisionRepository.findById(35L).orElse(null);
            divisionRepository.save(division5);
            Customer Thomas = new Customer("Thomas", "Whites", "Palmer street av 11112", "1115", "876411111", division5);
            customerRepository.save(Thomas);
        }


    }
}
