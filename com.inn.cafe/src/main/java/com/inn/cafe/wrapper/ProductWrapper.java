package com.inn.cafe.wrapper;


import com.inn.cafe.dao.ProductDao;
import lombok.Data;
import org.hibernate.procedure.ProcedureOutputs;

import javax.persistence.criteria.CriteriaBuilder;

@Data
public class ProductWrapper {

    Integer id;

    String name;

    String description;

    Integer price;

    String status;

    Integer categoryId;

    String categoryName;

    public ProductWrapper(){

    }

    public ProductWrapper(Integer id, String name, String description, Integer price, String status, Integer categoryId, String categoryName){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.status = status;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public ProductWrapper(Integer id, String name){
        this.id = id;
        this.name = name;

    }

    public ProductWrapper(Integer id, String name, String description, Integer price){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

}
