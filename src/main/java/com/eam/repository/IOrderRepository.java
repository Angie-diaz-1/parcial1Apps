package com.eam.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.eam.model.Order;



public interface IOrderRepository extends JpaRepository<Order, Long> {

}
