package com.yourdomain.repository;

import com.yourdomain.model.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Long> {

    @Transactional(readOnly = true)
    Optional<AppUser> findByEmail(String email);
}
