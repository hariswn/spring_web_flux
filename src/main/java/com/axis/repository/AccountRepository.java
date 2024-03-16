package com.axis.repository;


import com.axis.entity.AccountEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface AccountRepository extends R2dbcRepository<AccountEntity, Integer> {

    Flux<AccountEntity> findByAddress(String address);
}
