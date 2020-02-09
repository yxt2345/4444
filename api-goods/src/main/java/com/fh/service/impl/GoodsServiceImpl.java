package com.fh.service.impl;

import com.fh.mapper.GoodsMapper;
import com.fh.model.DataTableResult;
import com.fh.model.Goods;
import com.fh.model.GoodsQuery;
import com.fh.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    public DataTableResult queryGoods(GoodsQuery goodsQuery) {
        long count = goodsMapper.queryGoodsCount(goodsQuery);
        List<Goods> goodsList = goodsMapper.queryGoods(goodsQuery);
        return new DataTableResult(goodsQuery.getDraw(),count,count,goodsList);
    }



    @Override
    public void addGoods(Goods goods) {
        goodsMapper.addGoods(goods);
    }

    @Override
    public void deleteGoods(Integer id) {
        goodsMapper.deleteGoods(id);
    }

    @Override
    public Goods getGoodsById(Integer id) {
        return goodsMapper.getGoodsById(id);
    }

    @Override
    public void updateGoods(Goods goods) {
        goodsMapper.updateGoods(goods);
    }


    @Override
    public Goods queryChangeName(String goodsName) {
        return goodsMapper.queryChangeName(goodsName);
    }

    @Override
    public Goods queryChangeBarCode(String barCode) {
        return goodsMapper.queryChangeBarCode(barCode);
    }
}
