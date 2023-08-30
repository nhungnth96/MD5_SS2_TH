package th.customer_procedure.model.repository;

import th.customer_procedure.model.entity.Customer;

public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}
