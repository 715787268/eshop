package com.eshop.mng.dao;

import com.eshop.mng.dto.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PemissionRepository extends JpaRepository<Permission,Long> {
}
