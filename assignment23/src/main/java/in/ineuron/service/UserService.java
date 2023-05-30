package in.ineuron.service;

import in.ineuron.Entity.User;

public interface UserService {
    User registerUser(User user);
    User findByUsername(String username);
}

