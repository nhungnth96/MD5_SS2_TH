package th.customer_procedure.model.service;

import th.customer_procedure.model.entity.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
