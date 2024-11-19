package com.simulator.interview.repository;

import com.simulator.interview.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepository extends JpaRepository<UserData, Long> {
}
