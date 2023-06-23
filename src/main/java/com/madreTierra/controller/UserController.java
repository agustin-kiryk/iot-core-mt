package com.madreTierra.controller;

import com.madreTierra.dto.UserDTO;
import com.madreTierra.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;
    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserId(@PathVariable Long id){
        UserDTO response = userService.getUserId(id);
        return ResponseEntity.ok(response);
    }
}
