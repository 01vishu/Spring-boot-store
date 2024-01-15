package com.ecommerce.user.service;

import com.ecommerce.user.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User findByUsername(String username);
}
