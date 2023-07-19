package com.madreTierra.controller;

import com.madreTierra.dto.MachineDTO;
import com.madreTierra.dto.UserDTO;
import com.madreTierra.service.IUserService;
import com.madreTierra.service.Impl.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins= "*")
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;
    @Autowired
    MachineService machineService;
    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserId(@PathVariable Long id){
        UserDTO response = userService.getUserId(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserDTO>> getAll()
    {
        List<UserDTO> users= userService.listAllUsers();
        return ResponseEntity.ok().body(users);
    }
    @GetMapping("/allMachines")
    public ResponseEntity<List<MachineDTO>> getAllMachines(){
        return ResponseEntity.ok().body(machineService.getAllMachines());
    }


}
