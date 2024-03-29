package vsg.veera.bankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import vsg.veera.bankingapp.data.AccountData;
import vsg.veera.bankingapp.entity.Account;

public interface AccountRepository extends CrudRepository<Account,Long> {

}
