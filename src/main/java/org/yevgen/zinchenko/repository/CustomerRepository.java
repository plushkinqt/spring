package org.yevgen.zinchenko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yevgen.zinchenko.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    
}
