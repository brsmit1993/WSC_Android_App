package com.wsc.services;

import com.wsc.dao.UserDAO;
import com.wsc.dto.UserDTO;
import com.wsc.exceptions.InvalidCredentialsException;

public class LoginServices
{
    public UserDTO isCredentialsValid(String userName, String password) throws InvalidCredentialsException
    {
        UserDTO userDTO = new UserDAO().findUserByUsername(userName);

        if (userDTO.getPassword().equals(password))
            return userDTO;

        throw new InvalidCredentialsException();
    }
}
