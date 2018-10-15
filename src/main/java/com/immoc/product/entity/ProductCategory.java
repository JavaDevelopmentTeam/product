package com.immoc.product.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * @author Bryan Zhu
 * @date 2018-10-16 0:34
 */
@Data
@Entity
public class ProductCategory {

    @Id
    private int categoryId;

    /** 类目名 */
    private String categoryName;

    /** 类目编号 */
    private int categoryType;

    /** 创建时间 */
    private Date createTime;

    /** 修改时间 */
    private Date updateTime;
}
