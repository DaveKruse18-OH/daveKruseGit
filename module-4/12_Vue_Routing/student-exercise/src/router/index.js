import Vue from 'vue';
import VueRouter from 'vue-router';
import Home from '../views/Home.vue';
import MyBooks from '../views/MyBooks.vue';

Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    name: 'home',
    component: Home
  },
  {
    path: '/myBooks',
    name: 'my-books',
    component: MyBooks
  }
];

const router = new VueRouter({
  mode: 'history',
  routes
});

export default router;
