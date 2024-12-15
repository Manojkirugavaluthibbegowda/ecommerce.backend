package com.myproject.ecommerce.backend.exception;

public class UserNotverifiedException extends Exception {
    private boolean newEmailSent;

    public UserNotverifiedException(boolean newEmailSent) {
        this.newEmailSent = newEmailSent;
    }

    public boolean isNewEmailSent() {
        return newEmailSent;
    }

}
