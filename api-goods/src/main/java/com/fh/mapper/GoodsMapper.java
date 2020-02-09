package com.fh.mapper;

import com.fh.model.Goods;
import com.fh.model.GoodsQuery;

import java.util.List;

public interface GoodsMapper {


    long queryGoodsCount(GoodsQuery goodsQuery);

    List<Goods> queryGoods(GoodsQuery goodsQuery);

    void addGoods(Goods goods);

    void deleteGoods(Integer id);

    Goods getGoodsById(Integer id);

    void updateGoods(Goods goods);

    Goods queryChangeName(String goodsName);

    Goods queryChangeBarCode(String barCode);
}
