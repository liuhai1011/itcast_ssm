package com.itcast.dao;

import com.itcast.domain.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductDao {
    /*@Select("select * from product")*/
    List<Product> findAll() throws Exception;
}
