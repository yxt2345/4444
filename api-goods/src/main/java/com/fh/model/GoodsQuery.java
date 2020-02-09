package com.fh.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class GoodsQuery extends DataTablePageBean{

    private String name;

    private BigDecimal minPrice;
    private BigDecimal maxPrice;

    private Integer minSales;
    private Integer maxSales;

    private String barCode;

    private Integer minStock;
    private Integer maxStock;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date minProducedDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date maxProducedDate;

    private Integer status;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getMinSales() {
        return minSales;
    }

    public void setMinSales(Integer minSales) {
        this.minSales = minSales;
    }

    public Integer getMaxSales() {
        return maxSales;
    }

    public void setMaxSales(Integer maxSales) {
        this.maxSales = maxSales;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Integer getMinStock() {
        return minStock;
    }

    public void setMinStock(Integer minStock) {
        this.minStock = minStock;
    }

    public Integer getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(Integer maxStock) {
        this.maxStock = maxStock;
    }

    public Date getMinProducedDate() {
        return minProducedDate;
    }

    public void setMinProducedDate(Date minProducedDate) {
        this.minProducedDate = minProducedDate;
    }

    public Date getMaxProducedDate() {
        return maxProducedDate;
    }

    public void setMaxProducedDate(Date maxProducedDate) {
        this.maxProducedDate = maxProducedDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
