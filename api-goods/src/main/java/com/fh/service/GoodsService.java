package com.fh.service;

import com.fh.model.DataTableResult;
import com.fh.model.Goods;
import com.fh.model.GoodsQuery;

public interface GoodsService {
    DataTableResult queryGoods(GoodsQuery goodsQuery);

    void addGoods(Goods goods);

    void deleteGoods(Integer id);

    Goods getGoodsById(Integer id);

    void updateGoods(Goods goods);

    Goods queryChangeName(String goodsName);

    Goods queryChangeBarCode(String barCode);
}
