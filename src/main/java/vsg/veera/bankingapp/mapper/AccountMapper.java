package vsg.veera.bankingapp.mapper;

import org.springframework.stereotype.Component;
import vsg.veera.bankingapp.data.AccountData;
import vsg.veera.bankingapp.entity.Account;

@Component
public class AccountMapper {


    public static Account mapToAccount(AccountData accountData){
        return new Account(accountData.getId(), accountData.getName(),accountData.getBalance());
    }


    public static AccountData mapToAccountData(Account account){
        return new AccountData(account.getId(),account.getName(),account.getBalance());
    }
}
