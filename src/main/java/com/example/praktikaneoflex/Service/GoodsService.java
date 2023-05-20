package com.example.praktikaneoflex.Service;

import com.example.praktikaneoflex.Entity.GoodsEntity;
import com.example.praktikaneoflex.Repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GoodsService {

    @Autowired
    private GoodsRepository goodsRepository;

    public void addGood(GoodsEntity goodsEntity) {
        goodsRepository.save(goodsEntity);
    }

    public void deleteGood(Integer id){
        goodsRepository.deleteById(id);
    }


}
