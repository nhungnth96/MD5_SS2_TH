package th.customerjpa.model.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.customerjpa.model.entity.Customer;
import th.customerjpa.model.repository.ICustomerRepository;

import java.util.List;

@Service
    public class CustomerServiceIMPL implements ICustomerService{
        @Autowired
        private ICustomerRepository customerRepository;

        @Override
        public List<Customer> findAll() {
            return customerRepository.findAll();
        }

        @Override
        public Customer findById(Long id) {
            return customerRepository.findById(id);
        }

        @Override
        public void save(Customer customer) {
            customerRepository.save(customer);
        }

        @Override
        public void remove(Long id) {
            customerRepository.remove(id);
        }
    }


