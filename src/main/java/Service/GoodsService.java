package Service;

import Entity.GoodsEntity;
import Entity.ShoppingListsEntity;
import Repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GoodsService {

    @Autowired
    private GoodsRepository goodsRepository;

    public void addGood(GoodsEntity goodsEntity) {
        goodsRepository.save(goodsEntity);
    }

    public void deleteGood(GoodsEntity goodsEntity){
        goodsRepository.delete(goodsEntity);
    }


}
