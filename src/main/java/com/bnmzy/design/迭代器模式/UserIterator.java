package com.bnmzy.design.迭代器模式;

import com.bnmzy.design.迭代器模式.entity.User;

import java.util.Iterator;

/**
 * @Author: XF-DD
 * @Date: 21/02/19 22:50
 */
public class UserIterator implements Iterator<User> {

    private User[] dataList;

    // 默认位置
    private int position = 0;

    public UserIterator(User[] dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean hasNext() {
        return position<dataList.length && dataList[position] != null;
    }

    @Override
    public User next() {
        if(position >= dataList.length){
            throw new RuntimeException("下标已超出");
        }
        User user = dataList[position];
        position++;
        return user;
    }
}
