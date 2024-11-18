package com.myproject.ecommerce.backend.service;

import com.myproject.ecommerce.backend.api.model.RegistrationBody;
import com.myproject.ecommerce.backend.exception.UserAlreadyExistsException;
import com.myproject.ecommerce.backend.model.LocalUser;
import com.myproject.ecommerce.backend.model.dao.LocalUserDAO;
import org.springframework.stereotype.Service;



@Service
public class UserService {

    private LocalUserDAO localUserDAO;


    public UserService(LocalUserDAO localUserDAO) {
        this.localUserDAO = localUserDAO;
    }



    public LocalUser registerUser(RegistrationBody registrationBody) throws UserAlreadyExistsException {
        if (localUserDAO.findByEmailIgnoreCase(registrationBody.getEmail()).isPresent()
                || localUserDAO.findByUsernameIgnoreCase(registrationBody.getUsername()).isPresent()) {
            throw new UserAlreadyExistsException();
        }
        LocalUser user = new LocalUser();
        user.setEmail(registrationBody.getEmail());
        user.setFirstName(registrationBody.getFirstName());
        user.setLastName(registrationBody.getLastName());
        user.setUsername(registrationBody.getUsername());
        //TODO: Encrypt password!!
        user.setPassword(registrationBody.getPassword());
        return  localUserDAO.save(user);
    }
}