import axios from 'axios';

const API_URL = 'http://localhost:8080/api';

const getAllAccounts = (token) => {
  return axios.get(`${API_URL}/accounts`, {
    headers: {
      Authorization: `Bearer ${token}`,
    },
  });
};

export default {
  getAllAccounts,
};
