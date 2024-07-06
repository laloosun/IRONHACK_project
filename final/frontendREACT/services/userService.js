import axios from 'axios';

const API_URL = 'http://localhost:8080/api';

const getAllUsers = (token) => {
  return axios.get(`${API_URL}/users`, {
    headers: {
      Authorization: `Bearer ${token}`,
    },
  });
};

export default {
  getAllUsers,
};
