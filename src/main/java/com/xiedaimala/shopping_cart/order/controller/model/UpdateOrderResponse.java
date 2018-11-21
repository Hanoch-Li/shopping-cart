package com.xiedaimala.shopping_cart.order.controller.model;

import com.xiedaimala.shopping_cart.order.model.Order;

public class UpdateOrderResponse {

    private Order order;

    public UpdateOrderResponse() {
    }

    public UpdateOrderResponse(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
