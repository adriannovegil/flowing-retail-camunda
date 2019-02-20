package io.flowing.retail.order.persistence;

import org.springframework.data.repository.CrudRepository;

import io.flowing.retail.order.domain.Order;

public interface OrderRepository extends CrudRepository<Order, String> {

}
