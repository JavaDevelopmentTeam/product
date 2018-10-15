package com.immoc.product.repository;

import com.immoc.product.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Bryan Zhu
 * @date 2018-10-16 0:11
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {


}
