package com.eshop.mng.service.impl;

import com.eshop.mng.dao.RoleRepository;
import com.eshop.mng.dao.UserRepository;
import com.eshop.mng.dao.UserRoleRepository;
import com.eshop.mng.dto.Role;
import com.eshop.mng.dto.User;
import com.eshop.mng.dto.UserRole;
import com.eshop.mng.service.UserService;
import com.eshop.mng.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

/**
 * @author 佳琪如梦
 * @create 2018-12-23 15:42
 **/

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public void addUser(UserVO userVO) {
        List<Role> roleList = userVO.getRoleList();
        User user = new User();
        user.setPassword(userVO.getPassword());
        user.setStatus(0);
        user.setUsername(userVO.getUsername());
        user = userRepository.save(user);
        if(null != roleList && roleList.size() > 0){
            UserRole userRole = new UserRole();
            userRole.setUserId(user.getId());
            for(Role role : roleList ){
                userRole.setRoleId(role.getId());
                userRoleRepository.save(userRole);
            }
        }
    }

    @Override
    public void updateUser(UserVO userVO) {

    }

    @Override
    public void deleteUser(UserVO userVO) {

    }

    @Override
    public void getUser() {

    }

    @Override
    public boolean login(UserVO userVO) {
        Example example = Example.of(userVO);
        boolean isUserExist = userRepository.exists(example);
        return isUserExist;
    }
}
