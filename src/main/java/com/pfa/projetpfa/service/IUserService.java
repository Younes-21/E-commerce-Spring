package com.pfa.projetpfa.service;

import com.pfa.projetpfa.domaine.UserVO;
import com.pfa.projetpfa.service.model.User;

import java.util.List;

public interface IUserService {

    List<UserVO> getUsers();

    void save(UserVO user);

    void delete(Long id);

}
