package com.assignment5.designPatterns.factories.impl;

import com.assignment5.designPatterns.domain.User;
import com.assignment5.designPatterns.factories.UserFactory;
import com.assignment5.domain.UserName;

import java.util.UUID;

/**
 * Created by Toshiba on 2016/04/07.
 */
public class UserFactoryImpl implements UserFactory{

    private static UserFactoryImpl factory = null;

    private  UserFactoryImpl() {
    }
    public static UserFactoryImpl getInstance(){
        if(factory ==null)
            factory = new UserFactoryImpl();
        return factory;
    }

    public User createUser(String id, int age, UserName uName) {
        User  user = new User
                .Builder()
                .id(UUID.randomUUID().toString())
                .age(age)
                .uName(uName)
                .build();
        return user;
    }


}
