package com.manogiraldes.dscommerce.repositories;

import com.manogiraldes.dscommerce.entities.OrderItem;
import com.manogiraldes.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
