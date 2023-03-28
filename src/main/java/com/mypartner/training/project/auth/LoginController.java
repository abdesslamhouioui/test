package com.mypartner.training.project.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    @PostMapping("/")
   public void login(@RequestBody String username , @RequestBody String password){

   }
}
