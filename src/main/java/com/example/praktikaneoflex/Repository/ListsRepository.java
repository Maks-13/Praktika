package com.example.praktikaneoflex.Repository;

import com.example.praktikaneoflex.Entity.ListsEntity;
import org.springframework.data.repository.CrudRepository;

public interface ListsRepository extends CrudRepository<ListsEntity, Integer> {

    //addList(ShoppingList l) (создание списка)
    //getAllLists(String name_of_list) (получение всех списков)
    //deleteList(String name_of_list) (Удаление списка)
}
