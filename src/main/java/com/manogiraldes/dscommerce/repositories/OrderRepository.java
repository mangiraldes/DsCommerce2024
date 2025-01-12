package com.manogiraldes.dscommerce.repositories;

import com.manogiraldes.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
