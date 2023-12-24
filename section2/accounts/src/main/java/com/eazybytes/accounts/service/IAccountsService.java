package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

import java.util.List;

public interface IAccountsService {

    /**
     *
     * @param customerDto - CustomerDto object
     */
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    List<CustomerDto> fetchAllAccounts();

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
