package com.qwx.dao;

import com.qwx.pojo.Order;

import java.util.List;

public interface OrderDao {

    List<Order> findAll();

}
