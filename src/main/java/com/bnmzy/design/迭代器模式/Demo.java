package com.bnmzy.design.迭代器模式;

import com.bnmzy.design.迭代器模式.entity.User;
import com.bnmzy.design.迭代器模式.entity.UserCollection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: XF-DD
 * @Date: 21/02/19 22:48
 */
public class Demo {

    public void print(){

        User[] users = new User[2];
        users[0] = new User(1,"zs");
        users[1] = new User(2,"ls");

        /**
         * 有 user集合类 , 可能会有 animal集合类，car集合类 ...
         * 每个集合类的存储方式可能不同，如 UserCollection 使用数组，animal可能使用 ArrayList
         */

        UserCollection collection = new UserCollection(users);
        Iterator iterator = collection.createIterator();
        print(iterator);
    }


    /**
     * 可以将每个集合类的 E 实现某个接口如 H, 然后入参 Iterator<H>
     * @param iterator
     */
    private void print(Iterator iterator){
        while (iterator.hasNext()){
            Object next = iterator.next();
        }
    }
}
