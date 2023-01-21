package com.pfa.projetpfa.service;


import com.pfa.projetpfa.dao.ProductRepository;
import com.pfa.projetpfa.dao.UserRepository;
import com.pfa.projetpfa.domaine.ProductConverter;
import com.pfa.projetpfa.domaine.UserConverter;
import com.pfa.projetpfa.domaine.UserVO;
import com.pfa.projetpfa.service.model.Product;
import com.pfa.projetpfa.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService , CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<UserVO> getUsers() {
        List<User> list = userRepository.findAll();
        return UserConverter.toListVo(list);
    }

    @Override
    public void save(UserVO user) {
        userRepository.save(UserConverter.toBo(user));
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void run(String... args) throws Exception {

    }
}