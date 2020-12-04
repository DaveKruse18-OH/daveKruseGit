import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000"
});

export default {

  get(id) {
    return http.get(`/messages/${id}`);
  },

  add(message) {
    return http.post(`/messages/${message}`);
  },

  delete(id) {
    return http.delete(`/messages/${id}`);
  },

  update(id, message) {
    return http.put(`/messages/${id}`, message);
  }
 
}
