package com.immoc.product.repository;

import com.immoc.product.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Bryan Zhu
 * @date 2018-10-16 0:40
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    /** 查询类目Type列表 */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
