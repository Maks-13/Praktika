package com.example.praktikaneoflex.Service;

import com.example.praktikaneoflex.Entity.ListsEntity;
import com.example.praktikaneoflex.Repository.ListsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListsService {

    @Autowired
    private ListsRepository listsRepository;
    public List<ListsEntity> getAllLists() {
        return (List<ListsEntity>) listsRepository.findAll();

    }

    public void deleteListById(Integer id) {
        listsRepository.deleteById(id);
    }

    public void addList(ListsEntity shoppingListsEntity) {

    }
}
