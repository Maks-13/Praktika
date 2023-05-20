package com.example.praktikaneoflex.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shopping_lists")
public class ShoppingListsEntity {

    @Id
    private Integer shoppingListId;
    private String amountOfGoods;
    private Boolean shoppingMark;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "listId", referencedColumnName = "listId")
    private ListsEntity listId;
    @ManyToOne
    @JoinColumn(name = "goodId", referencedColumnName = "goodId")
    private GoodsEntity goodId;

    public ShoppingListsEntity(){

    }

    public ShoppingListsEntity(Integer shoppingListId, String amountOfGoods, Boolean shoppingMark, GoodsEntity goodId){
        super();
        this.shoppingListId = shoppingListId;
        this.amountOfGoods = amountOfGoods;
        this.shoppingMark = shoppingMark;
        this.goodId = goodId;
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

    public void setListId(ListsEntity listId) {
        this.listId = listId;
    }

    public ListsEntity getListId() {
        return listId;
    }

    public void setGoodId(GoodsEntity goodId) {
        this.goodId = goodId;
    }

    public GoodsEntity getGoodId() {
        return goodId;
    }

}



