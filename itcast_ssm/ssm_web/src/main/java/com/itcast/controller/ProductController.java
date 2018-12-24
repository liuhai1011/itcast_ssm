package com.itcast.controller;


import com.itcast.domain.Product;
import com.itcast.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/product")
@Controller
public class ProductController {

    @Autowired
    private  ProductService productService;


    @RequestMapping("/findAll")
    public String findAll() throws Exception {
        List<Product> products = productService.findAll();
        for (Product product : products) {
            System.out.println(product);
        }
        return "success";
    }
}
