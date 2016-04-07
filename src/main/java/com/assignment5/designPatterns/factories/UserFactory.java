package com.assignment5.designPatterns.factories;

import com.assignment5.designPatterns.domain.User;
import com.assignment5.domain.UserName;

/**
 * Created by Toshiba on 2016/04/07.
 */
public interface UserFactory {

    User createUser(String id, int age, UserName uName);

}
