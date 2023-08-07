package com.example.weappdemo01.service.impl;

import com.example.weappdemo01.bean.Product;
import com.example.weappdemo01.bean.ProductExample;
import com.example.weappdemo01.mapper.ProductMapper;
import com.example.weappdemo01.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> selectProductByParentId(Integer id) {
        ProductExample productExample = new ProductExample();
        productExample.createCriteria().andParentIdEqualTo(id);
        return productMapper.selectByExample(productExample);
    }
}
