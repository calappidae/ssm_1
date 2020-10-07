package com.pan.test;

import com.pan.dao.AccountDao;
import com.pan.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

public class test {

    @Test
    public void fun(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Account account = applicationContext.getBean("account", Account.class);
        account.setMoney(500d);
        System.out.println(account);
    }

    @Test
    public void fun1(){
        try {
            InputStream resource = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
            List<Account> list = accountDao.findAll();
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
