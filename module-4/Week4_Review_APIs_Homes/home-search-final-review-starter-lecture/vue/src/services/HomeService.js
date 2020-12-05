import axios from 'axios';

export default {

   search() {
       return axios.get('/homes');
   },

   addHome(home) {
       return axios.post('/homes', home)
   }

}