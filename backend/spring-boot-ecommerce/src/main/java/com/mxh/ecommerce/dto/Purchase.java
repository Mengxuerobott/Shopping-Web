package com.mxh.ecommerce.dto;

import com.mxh.ecommerce.entity.Address;
import com.mxh.ecommerce.entity.Customer;
import com.mxh.ecommerce.entity.Order;
import com.mxh.ecommerce.entity.OrderItem;
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
