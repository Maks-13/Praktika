package com.example.praktikaneoflex.Repository;

import com.example.praktikaneoflex.Entity.GoodsEntity;
import org.springframework.data.repository.CrudRepository;

public interface GoodsRepository extends CrudRepository<GoodsEntity, Integer> {


    //addGood (добавление товара)
    //deleteGood (Удаление товара)

}
