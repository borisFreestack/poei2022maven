package com.freestack.service.service;

import com.freestack.domain.Account;

import java.nio.file.AccessDeniedException;

/**
 * Service layer handling account.
 */
public class AccountingService {
    public void printAccountValue(Account account) {
        //dosomething unclear
        if (account.getValue() != null && account.getValue().length() > 0) {
            System.out.println("voici la valeur :" + account.getValue());
        }
    }
}
