-- Passwords are in the format: Passwords<UserLetter>123. Unless specified otherwise.
-- Encrypted using https://www.javainuse.com/onlineBcrypt
INSERT INTO local_user (email, first_name, last_name, password, username, email_verified)
    VALUES ('UserA@junit.com', 'UserA-FirstName', 'UserA-LastName', '$2a$10$Mt8iiMTNxJDCxcG0VO2Iiunw52yJBrUGeCmYrWVyma0MReOjW9o4O', 'UserA', true)
    , ('UserB@junit.com', 'UserB-FirstName', 'UserB-LastName', '$2a$10$m5euKIKMhZj8Ax3WwfoPn.h9iydUftIeLP4HxmTX7kiwGgWC1ex0K', 'UserAB', false)