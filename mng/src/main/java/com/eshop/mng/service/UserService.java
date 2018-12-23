package com.eshop.mng.service;

import com.eshop.mng.vo.UserVO;

public interface UserService {

    public void addUser(UserVO userVO);
    public void updateUser(UserVO userVO);
    public void deleteUser(UserVO userVO);

    public void getUser();
    public boolean login(UserVO userVO);
}
