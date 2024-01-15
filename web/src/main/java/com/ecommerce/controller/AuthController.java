package com.ecommerce.controller;
import com.ecommerce.user.entity.User;
import com.ecommerce.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// Inside a class in com.example.web package


@RestController
@RequestMapping("api/v1/auth")
public class AuthController {
    private UserService userService;

    @GetMapping("/welcome")
    public String welcome(){
        return "This is welcome page!";
    }

    @GetMapping("{username}")
    public User getUserById(@PathVariable String username){
    return userService.findByUsername(username);
    }

}
