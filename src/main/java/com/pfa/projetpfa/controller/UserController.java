package com.pfa.projetpfa.controller;

import com.pfa.projetpfa.domaine.CategoryVO;
import com.pfa.projetpfa.domaine.UserVO;
import com.pfa.projetpfa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins= {"*"})
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping(value="/users")
    public List<UserVO> getUsers(){
        return service.getUsers();
    }
    @PostMapping(value = "/users")
    public ResponseEntity<Object> createUser(@Validated @RequestBody UserVO userVo) {
        service.save(userVo);
        return new ResponseEntity<>("user is created successfully", HttpStatus.CREATED);
    }


}
