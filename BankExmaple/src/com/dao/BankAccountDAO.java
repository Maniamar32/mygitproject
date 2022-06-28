package com.dao;

import com.dto.BankAccount;

public interface BankAccountDAO {
public abstract void addNewBankAccount(BankAccount bankaccount);
public abstract void removeBankAccount(BankAccount bankaccount);
public abstract void updateBankAccount(BankAccount bankaccount);
}
