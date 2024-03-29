package vsg.veera.bankingapp.service.Imple;

import org.springframework.stereotype.Component;
import vsg.veera.bankingapp.data.AccountData;
import vsg.veera.bankingapp.entity.Account;
import vsg.veera.bankingapp.mapper.AccountMapper;
import vsg.veera.bankingapp.repository.AccountRepository;
import vsg.veera.bankingapp.service.AccountService;

@Component
public class AccountServiceImpl implements AccountService {

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    AccountRepository accountRepository;

    @Override
    public AccountData createAccount(AccountData account) {
       Account account1  = accountRepository.save(AccountMapper.mapToAccount(account));
       return AccountMapper.mapToAccountData(account1);
    }

    @Override
    public AccountData getAccountById(Long Id) {
        Account account = accountRepository.findById(Id).orElseThrow(() -> new RuntimeException("Account Does Not Exist"));
        return AccountMapper.mapToAccountData(account);
    }
}
