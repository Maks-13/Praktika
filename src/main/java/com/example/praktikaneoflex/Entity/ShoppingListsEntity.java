package com.example.praktikaneoflex.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "shopping_lists")
public class ShoppingListsEntity {

    @Id
    private Integer shoppingListId;
    private String amountOfGoods;
    private Boolean shoppingMark;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "listId", referencedColumnName = "listId")
    private ListsEntity list;
    @ManyToOne
    @JoinColumn(name = "goodId", referencedColumnName = "goodId")
    private GoodsEntity good;

    public ShoppingListsEntity(){

    }

    public ShoppingListsEntity(Integer shoppingListId, String amountOfGoods, Boolean shoppingMark, GoodsEntity good, ListsEntity list){
        super();
        this.shoppingListId = shoppingListId;
        this.amountOfGoods = amountOfGoods;
        this.shoppingMark = shoppingMark;
        this.good = good;
        this.list = list;
    }

    public void setShoppingListId(Integer listId) {
        this.shoppingListId = listId;
    }

    public Integer getShoppingListId() {
        return shoppingListId;
    }

    public void setAmountOfGoods(String amountOfGoods) {
        this.amountOfGoods = amountOfGoods;
    }

    public String getAmountOfGoods() {
        return amountOfGoods;
    }
    public void setShoppingMark(Boolean shoppingMark) {
        this.shoppingMark = shoppingMark;
    }

    public Boolean getShoppingMark() {
        return shoppingMark;
    }

    public void setListId(ListsEntity list) {
        this.list = list;
    }

    public ListsEntity getList() {
        return list;
    }

    public void setGoodId(GoodsEntity goodId) {
        this.good = goodId;
    }

    public GoodsEntity getGoodId() {
        return good;
    }

}



