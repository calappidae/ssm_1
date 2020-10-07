package com.pan.controller;

import com.pan.domain.Account;
import com.pan.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    @Qualifier("accountSerivce")
    private AccountService accountService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<Account> accountList = accountService.findAll();
        mv.addObject("accoutList",accountList);
        mv.setViewName("accountFindAll");
        return mv;
    }

    @RequestMapping("/saveAccount")
    public ModelAndView findAll(Account account){
        accountService.saveAccount(account);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        return mv;
    }
}
