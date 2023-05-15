package Service;

import Entity.ShoppingListsEntity;
import Repository.ShoppingListsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingListsService {

    @Autowired
    private ShoppingListsRepository shoppingListsRepository;

    public List<ShoppingListsEntity> getAllLists() {
        List <ShoppingListsEntity> lists = new ArrayList<>();
        shoppingListsRepository.findAll().forEach(lists::add);
        return lists;
    }

    public void updateList(String id, ShoppingListsEntity shoppingListsEntity) {
        shoppingListsRepository.save(shoppingListsEntity);
    }

    public void addList(ShoppingListsEntity shoppingListsEntity) {
        shoppingListsRepository.save(shoppingListsEntity);
    }

    public void deleteList(ShoppingListsEntity shoppingListsEntity) {
        shoppingListsRepository.delete(shoppingListsEntity);

    }
}
