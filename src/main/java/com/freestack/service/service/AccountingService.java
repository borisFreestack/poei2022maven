package com.freestack.service.service;

import com.freestack.domain.Account;
import org.apache.commons.lang3.StringUtils;

import java.nio.file.AccessDeniedException;

/**
 * Service layer handling account.
 */
public class AccountingService {
    /**
     *
     * @param account name
     */
    public void printAccountValue(Account account) {
        //dosomething unclear
        if (StringUtils.isNotBlank(account.getValue())) {
            System.out.println("voici la valeur :" + account.getValue());
        }
    }
}
