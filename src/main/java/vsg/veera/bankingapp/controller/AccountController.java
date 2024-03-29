package vsg.veera.bankingapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vsg.veera.bankingapp.data.AccountData;
import vsg.veera.bankingapp.service.Imple.AccountServiceImpl;


@RequestMapping("/api/accounts")
@RestController
public class AccountController {

    AccountServiceImpl service;


    public AccountController(AccountServiceImpl service) {
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<AccountData> getAllAccounts(@RequestBody AccountData accountData){
       return new ResponseEntity<>(service.createAccount(accountData),HttpStatus.CREATED);
    }

    @GetMapping("/{Id}")
    public ResponseEntity<AccountData> getAccountById(@PathVariable Long Id){
        return ResponseEntity.ok(service.getAccountById(Id));
    }

}
