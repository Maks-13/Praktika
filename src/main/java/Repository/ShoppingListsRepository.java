package Repository;

import Entity.ShoppingListsEntity;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingListsRepository extends CrudRepository<ShoppingListsEntity, String> {


    //createList(ShoppingList l) (создание списка)
    //getAllLists(String name_of_list) (получение всех списков)
    //deleteList(String name_of_list) (Удаление списка)

}
