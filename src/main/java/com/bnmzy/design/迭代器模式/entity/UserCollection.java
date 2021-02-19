package com.bnmzy.design.迭代器模式.entity;

import com.bnmzy.design.迭代器模式.UserIterator;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Iterator;

/**
 * @Author: XF-DD
 * @Date: 21/02/19 23:08
 */
@Data
@AllArgsConstructor
public class UserCollection {

   private User[] users;

    public Iterator<User> createIterator(){
        return new UserIterator(users);
    }

}
