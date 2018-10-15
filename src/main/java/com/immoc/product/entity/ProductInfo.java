package com.immoc.product.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * @author Bryan Zhu
 * @date 2018-10-15 23:55
 */
@Data
@Entity
public class ProductInfo {

    /** 商品ID */
    @Id
    private String productId;

    /** 商品名 */
    private String productName;

    /** 商品价格 */
    private BigDecimal productPrice;

    /** 商品库存 */
    private int productStock;

    /** 商品描述 */
    private String productDescription;

    /** 商品图标 */
    private String productIcon;

    /** 商品状态 0 正常， 1 下架*/
    private int productStatus;

    /** 类目编号 */
    private int categoryType;

    /** 创建日期 */
    private Date createTime;

    /** 修改日期 */
    private Date updateTime;


}
