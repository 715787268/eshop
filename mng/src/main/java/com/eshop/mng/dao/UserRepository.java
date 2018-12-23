package com.eshop.mng.dao;

import com.eshop.mng.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 佳琪如梦
 * @create 2018-12-23 2:07
 **/

public interface UserRepository extends JpaRepository<User,Long> {
}
