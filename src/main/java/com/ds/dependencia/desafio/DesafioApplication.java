package com.ds.dependencia.desafio;

import com.ds.dependencia.desafio.entities.Order;
import com.ds.dependencia.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        Order order = new Order(1034,150,20);

        System.out.println("Pedido código: " + order.getCode());
        System.out.printf("Valor total: R$ %.2f", orderService.total(order));
    }
}
