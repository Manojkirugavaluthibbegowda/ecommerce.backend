package com.myproject.ecommerce.backend.model.dao;

import com.myproject.ecommerce.backend.model.VerificationToken;
import org.springframework.data.repository.ListCrudRepository;

public interface VerificationTokenDAO extends ListCrudRepository<VerificationToken, Long> {
}
