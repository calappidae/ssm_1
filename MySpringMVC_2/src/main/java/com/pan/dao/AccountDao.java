package com.pan.dao;

import com.pan.domain.Account;

import java.util.List;

public interface AccountDao {

    public List<Account> findAll();
    public void saveAccount(Account account);
}
