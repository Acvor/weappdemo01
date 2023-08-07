package com.example.weappdemo01.controller;

import com.example.weappdemo01.common.ResponseData;
import com.example.weappdemo01.mapper.ProductMapper;
import com.example.weappdemo01.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Acccvor
 */
@RestController
public class ProductController {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductService productService;

    @GetMapping("/productList")
    public ResponseData productList(){
        return ResponseData.ok(productMapper.selectByExample(null));
    }


    @GetMapping("/selectProductByParentId")
    public ResponseData selectProductByParentId(Integer id){
        return ResponseData.ok( productService.selectProductByParentId(id) );
    }

}
