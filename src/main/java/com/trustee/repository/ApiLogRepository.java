package com.trustee.repository;

import com.trustee.model.ApiLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ApiLogRepository extends JpaRepository<ApiLog, Integer> {
}

