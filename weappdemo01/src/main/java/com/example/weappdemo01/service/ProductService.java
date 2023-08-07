package com.example.weappdemo01.service;


import com.example.weappdemo01.bean.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    List<Product> selectProductByParentId(Integer id);
}
