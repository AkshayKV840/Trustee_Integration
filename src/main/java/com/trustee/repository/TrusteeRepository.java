package com.trustee.repository;

import com.trustee.model.Trustee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TrusteeRepository extends JpaRepository<Trustee, String> {
    List<Trustee> findAllByOrderByTrusteeNameAsc();

}

