package com.wsc.exceptions;

public class InvalidCredentialsException extends Exception
{
        public InvalidCredentialsException()
        {
            super("invalid username or password: please try again ");
        }
}
