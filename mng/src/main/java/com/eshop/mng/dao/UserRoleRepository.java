package com.eshop.mng.dao;

import com.eshop.mng.dto.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole,Long> {
}
