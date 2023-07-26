package net.javaguides.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.javaguides.springboot.entity.Order;
import net.javaguides.springboot.entity.Payment;

@Getter
@Setter
public class OrderRequest {

    private Order order;
    private Payment payment;

}
