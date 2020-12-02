import Vue from 'vue'
import VueRouter from 'vue-router'
import Products from '@/views/Products'
import ProductDetail from '@/views/ProductDetail'
import AddReview from '@/views/AddReview'

Vue.use(VueRouter)

const routes = [
  {
     path: '/',          // path we want to associate to this View component
     name: 'products',   //route name
     component: Products
  },
  {
     path: 'products/:id',
     name: 'product-detail',
     component: ProductDetail
  },
  {
    path: 'products/:id/add-review',
    name: 'add-review',
    component: AddReview
  }

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
