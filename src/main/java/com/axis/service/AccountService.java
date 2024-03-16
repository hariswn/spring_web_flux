package com.axis.service;

import com.axis.entity.AccountEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountService {

    void create(AccountEntity account);

    Mono<AccountEntity> findByAccountNumber(Integer accountNumber);

    Flux<AccountEntity> findAccountsByLocation(String location);

    Flux<AccountEntity> getAllAccounts();

    Mono<AccountEntity> update(AccountEntity account);

    Mono<Void> removeAccountByAccountNumber(Integer accountNumber);
}
