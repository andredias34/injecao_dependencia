package com.ds.dependencia.desafio.services;

import com.ds.dependencia.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        double shipping;

        if (order.getBasic() < 100) {
            shipping = 20.0;
        } else if (order.getBasic() < 200) {
            shipping = 12.0;
        } else {
            shipping = 0.0;
        }
        return shipping;
    }
}
