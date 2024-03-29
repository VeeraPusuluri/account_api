package vsg.veera.bankingapp.service;

import org.springframework.stereotype.Component;
import vsg.veera.bankingapp.data.AccountData;
import vsg.veera.bankingapp.entity.Account;

public interface AccountService {

    AccountData createAccount(AccountData account);

    AccountData getAccountById(Long Id);
}
