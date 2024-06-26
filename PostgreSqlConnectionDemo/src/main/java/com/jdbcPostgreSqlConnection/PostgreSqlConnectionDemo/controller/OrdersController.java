package com.jdbcPostgreSqlConnection.PostgreSqlConnectionDemo.controller;
import com.jdbcPostgreSqlConnection.PostgreSqlConnectionDemo.business.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrdersController<T> {

    @Autowired
    private GeneralService<T> generalService;

    @GetMapping("/getorders")
    public List<T> getOrders()
    {
        String getOrderUrl="select * from orders";
         return this.generalService.getObjectList(getOrderUrl);
    }
}
