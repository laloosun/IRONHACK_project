import React, { useState, useEffect } from 'react';
import accountService from '../services/accountService';

const AccountManagement = ({ token }) => {
  const [accounts, setAccounts] = useState([]);

  useEffect(() => {
    const fetchAccounts = async () => {
      try {
        const response = await accountService.getAllAccounts(token);
        setAccounts(response.data);
      } catch (error) {
        console.error('Error fetching accounts:', error);
      }
    };

    fetchAccounts();
  }, [token]);

  return (
    <div className="container">
      <h2>Account Management</h2>
      <ul>
        {accounts.map(account => (
          <li key={account.id}>{account.owner} - {account.balance}</li>
        ))}
      </ul>
    </div>
  );
};

export default AccountManagement;
