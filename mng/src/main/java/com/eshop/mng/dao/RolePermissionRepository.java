package com.eshop.mng.dao;

import com.eshop.mng.dto.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolePermissionRepository extends JpaRepository<RolePermission,Long> {
}
