package com.example.praktikaneoflex.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "lists")
public class ListsEntity { //ссылка на сам лист

    @Id //каскадноне удаление
private Integer listId;

private String nameOfList;

private String date;

public ListsEntity(){

}
    public ListsEntity(Integer listId, String nameOfList, String date){
        this.listId = listId;
        this.nameOfList = nameOfList;
        this.date = date;
    }

    public void setListId(Integer listId){
    this.listId = listId;
    }

    public Integer getListId() {
        return listId;
    }

    public void setNameOfList(String nameOfList) {
        this.nameOfList = nameOfList;
    }

    public String getNameOfList() {
        return nameOfList;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

}
