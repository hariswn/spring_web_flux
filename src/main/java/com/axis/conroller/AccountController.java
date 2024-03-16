package com.axis.conroller;

import com.axis.entity.AccountEntity;
import com.axis.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class AccountController {

    @Autowired
    private AccountService service;

    @PostMapping(value = { "/create"})
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody AccountEntity account) {
        service.create(account);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Mono<AccountEntity>> findByAccountNumber(@PathVariable("accountNumber") Integer accountNumber) {
        Mono<AccountEntity> account = service.findByAccountNumber(accountNumber);
        return new ResponseEntity<Mono<AccountEntity>>(account, HttpStatus.OK);
    }

    @GetMapping(value = "/location/{location}")
    public Flux<AccountEntity> findAccountsByLocation(@PathVariable("location") String location) {
        return service.findAccountsByLocation(location);
    }

    @GetMapping(value = "/all", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<AccountEntity> getAllAccounts() {
        return service.getAllAccounts();
    }

    @PutMapping(value = "/update")
    @ResponseStatus(HttpStatus.OK)
    public Mono<AccountEntity> update(@RequestBody AccountEntity account) {
        return service.update(account);
    }

    @DeleteMapping(value = "/delete/{accountNumber}")
    @ResponseStatus(HttpStatus.OK)
    public void removeAccountByAccountNumber(@PathVariable("accountNumber") Integer accountNumber) {
        service.removeAccountByAccountNumber(accountNumber).subscribe();
    }


}
