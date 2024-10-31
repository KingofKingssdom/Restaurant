package com.laptrinhweb.RestaurantPizza.Controller.User;

import com.laptrinhweb.RestaurantPizza.Entity.Order;
import com.laptrinhweb.RestaurantPizza.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private OrderService orderService;
    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    // Tạo và lưu các trường đặt hàng xuống database
    @PostMapping("/save")
    public Order saveOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

}
