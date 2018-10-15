package com.immoc.product.repository;

import com.immoc.product.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Bryan Zhu
 * @date 2018-10-16 0:11
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {


    /** 查询所有在架商品 */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
