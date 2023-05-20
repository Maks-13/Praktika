package com.example.praktikaneoflex.Controller;

import com.example.praktikaneoflex.Entity.GoodsEntity;
import com.example.praktikaneoflex.Service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GoodsController {

    @Autowired
    private GoodsService goodsService;
    @RequestMapping(method = RequestMethod.POST, value ="/goods")
    public void addGood(@RequestBody GoodsEntity goodsEntity){
        goodsService.addGood(goodsEntity);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/goods/{id}")
    public void deleteGood(@PathVariable Integer id){
        goodsService.deleteGood(id);
    }


}
