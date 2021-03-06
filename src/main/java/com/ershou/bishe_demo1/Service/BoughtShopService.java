package com.ershou.bishe_demo1.Service;

import com.ershou.bishe_demo1.Pojo.BoughtShop;

import java.util.List;

/**
 * Created by wsk1103 on 2017/5/13.
 */
public interface BoughtShopService {
    int deleteByPrimaryKey(Integer id);

    int insert(BoughtShop record);

    int insertSelective(BoughtShop record);

    BoughtShop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BoughtShop record);

    int updateByPrimaryKey(BoughtShop record);

    int getCounts(int uid);

    List<BoughtShop> selectByUid(int uid, int start);
}
