package com.softwarehouse.order.domain.enums;

import java.util.Objects;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private Integer code;

    private OrderStatus(Integer code){
        this.code = code;
    }

    public Integer getCode(){
        return this.code;
    }

    public static OrderStatus valueOf(Integer code) {
        for (OrderStatus value : OrderStatus.values()) {
            if (Objects.equals(value.getCode(), code)) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
