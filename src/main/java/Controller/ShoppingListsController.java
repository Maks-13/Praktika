package Controller;

import Entity.ShoppingListsEntity;
import Service.ShoppingListsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ShoppingListsController {

    @Autowired
    private ShoppingListsService shoppingListsService;
    @RequestMapping("/lists")
    public List<ShoppingListsEntity> getAllLists(){
        return shoppingListsService.getAllLists();
    }
    @RequestMapping(method = RequestMethod.POST, value ="/lists")
    public void addList(@RequestBody ShoppingListsEntity shoppingListsEntity){
        shoppingListsService.addList(shoppingListsEntity);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/lists")
    public void deleteList(@RequestBody ShoppingListsEntity shoppingListsEntity){
        shoppingListsService.deleteList(shoppingListsEntity);
}
}
