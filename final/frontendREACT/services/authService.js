import axios from 'axios';

const API_URL = 'http://localhost:8080/api';

const login = (username, password) => {
  return axios.post(`${API_URL}/login`, {
    username,
    password,
  });
};

export default {
  login,
};
