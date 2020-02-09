package com.fh.controller;

import com.fh.model.DataTableResult;
import com.fh.model.Goods;
import com.fh.model.GoodsQuery;
import com.fh.model.ServerResponse;
import com.fh.service.GoodsService;
import com.fh.util.AliyunOSSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("GoodsController")
@CrossOrigin
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    //分页查询
    @RequestMapping("queryGoods")
    public ServerResponse queryGoods(GoodsQuery goodsQuery){
        try {
            DataTableResult dataTableResult = goodsService.queryGoods(goodsQuery);
            return ServerResponse.success(dataTableResult);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }


    @RequestMapping("uploadFile")
    public Map<String,Object> uploadPhoto(@RequestParam("poster") MultipartFile file, HttpServletRequest request){
        Map<String,Object> result = new HashMap<>();
        try {
            String originalFileName = file.getOriginalFilename();
            String url = AliyunOSSUtil.uploadFile(file.getInputStream(), originalFileName, "File");
            result.put("mainImages",url);
            result.put("code",200);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("code",500);
        }
        return result;
    }

    //添加
    @RequestMapping("addGoods")
    public ServerResponse addGoods(Goods goods){
        try {
            goodsService.addGoods(goods);
            return ServerResponse.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }


    //删除
    @RequestMapping("deleteGoods")
    public ServerResponse deleteGoods(Integer id){
        try {
            goodsService.deleteGoods(id);
            return ServerResponse.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }


    //回显
    @RequestMapping("getGoodsById")
    public ServerResponse getGoodsById(Integer id){
        try {
            Goods goods = goodsService.getGoodsById(id);
            return ServerResponse.success(goods);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }


    //修改
    @RequestMapping("updateGoods")
    public ServerResponse updateGoods(Goods goods){
        try {
            goodsService.updateGoods(goods);
            return ServerResponse.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }


    //页面名字失去焦点
    @RequestMapping("queryChangeName")
    public ServerResponse queryChangeName(String goodsName){
        try {
            Goods goods = goodsService.queryChangeName(goodsName);
            String flag = "";
            if(goods.getName() != null){
                flag = "1";
            }else{
                flag = "2";
            }
            return ServerResponse.success(flag);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }


    //页面条形码失去焦点
    @RequestMapping("queryChangeBarCode")
    public ServerResponse queryChangeBarCode(String barCode){
        try {
            Goods goods = goodsService.queryChangeBarCode(barCode);
            String flag = "";
            if(goods.getBarCode() != null){
                flag = "1";
            }else{
                flag = "2";
            }
            return ServerResponse.success(flag);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }
}
