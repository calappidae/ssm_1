package com.pan.service;

import com.pan.domain.Account;

import java.util.List;

public interface AccountService {

    public List<Account> findAll();
    public void saveAccount(Account account);
}
