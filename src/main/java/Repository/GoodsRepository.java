package Repository;

import Entity.GoodsEntity;
import Entity.ShoppingListsEntity;
import org.springframework.data.repository.CrudRepository;

public interface GoodsRepository extends CrudRepository<GoodsEntity, String> {


    //addGood (добавление товара)
    //deleteGood (Удаление товара)

}
