package com.bankapp.bankapplication.service.impl;

import com.bankapp.bankapplication.dto.BankResponse;
import com.bankapp.bankapplication.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
