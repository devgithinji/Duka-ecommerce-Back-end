package com.densoft.duka.dto;

import com.densoft.duka.entity.Address;
import com.densoft.duka.entity.Customer;
import com.densoft.duka.entity.Order;
import com.densoft.duka.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
