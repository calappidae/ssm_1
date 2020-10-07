package com.pan.service.impl;

import com.pan.dao.AccountDao;
import com.pan.domain.Account;
import com.pan.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountSerivce")
public class AccountServiceImpl implements AccountService {

    @Autowired
    @Qualifier("accountDao")
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        List<Account> list = accountDao.findAll();
        return list;
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }
}
