package com.axis.service;

import com.axis.entity.AccountEntity;
import com.axis.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository repository;

    @Override
    public void create(AccountEntity account) {
        repository.save(account).subscribe();
    }

    @Override
    public Mono<AccountEntity> findByAccountNumber(Integer accountNumber) {
        return repository.findById(accountNumber);
    }

    @Override
    public Flux<AccountEntity> findAccountsByLocation(String location) {
        return repository.findByAddress(location);
    }

    @Override
    public Flux<AccountEntity> getAllAccounts() {
        return repository.findAll();
    }

    @Override
    public Mono<AccountEntity> update(AccountEntity account) {
        return repository.save(account);
    }

    @Override
    public Mono<Void> removeAccountByAccountNumber(Integer accountNumber) {
        return repository.deleteById(accountNumber);
    }
}
