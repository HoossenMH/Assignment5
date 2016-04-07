package com.assignment5.domainTest;

import com.assignment5.designPatterns.domain.User;
import com.assignment5.designPatterns.factories.UserFactory;
import com.assignment5.designPatterns.factories.impl.UserFactoryImpl;
import com.assignment5.domain.UserName;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Toshiba on 2016/04/07.
 */
public class creationTest {

    private UserFactory factory;
    private UserName uName;

    @Before
    public void setUp() throws Exception {
        factory = UserFactoryImpl.getInstance();

        uName = new UserName("Hasan","Hoossen");
    }

    @Test
    public void testUserCreation() throws Exception {
        User user = factory.createUser("123456", 23, uName);
        Assert.assertEquals(user.getUserName(), uName);
        Assert.assertEquals(user.getAge(),23);
        Assert.assertNotNull(user.getId());
    }




}
