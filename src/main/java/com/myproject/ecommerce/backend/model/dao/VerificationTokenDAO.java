package com.myproject.ecommerce.backend.model.dao;

import com.myproject.ecommerce.backend.model.LocalUser;
import com.myproject.ecommerce.backend.model.VerificationToken;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface VerificationTokenDAO extends ListCrudRepository<VerificationToken, Long> {
    Optional<VerificationToken> findByToken(String token);

    void deleteByUser(LocalUser user);

}
