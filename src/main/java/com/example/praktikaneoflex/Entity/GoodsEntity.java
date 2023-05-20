package com.example.praktikaneoflex.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "goods")
public class GoodsEntity {

    @Id
    private Integer goodId;
    private String goodName;

    public GoodsEntity(){

    }

    public GoodsEntity(Integer goodId, String goodName){
        super();
        this.goodId = goodId;
        this.goodName = goodName;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodName() {
        return goodName;
    }
}
