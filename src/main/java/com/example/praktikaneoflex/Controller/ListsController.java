package com.example.praktikaneoflex.Controller;

import com.example.praktikaneoflex.Entity.ListsEntity;
import com.example.praktikaneoflex.Service.ListsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class ListsController {

    @Autowired
    private ListsService listsService;

    @GetMapping("/lists")
    public List<ListsEntity> getAllLists(){
        return listsService.getAllLists();
    }
    @RequestMapping(method = RequestMethod.POST, value ="/lists")
    public void addList(@RequestBody ListsEntity listsEntity){
        listsService.addList(listsEntity);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/lists/{id}")
    public void deleteList(@PathVariable Integer id){
        listsService.deleteListById(id);
    }


}
