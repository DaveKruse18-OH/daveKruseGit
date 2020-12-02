import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {

    homes: [
      {
        mlsId: '1000',
        address: '123 Java Green Lane',
        city: 'Columbus',
        state: 'Ohio',
        zip: '43023',
        price: '1,222,345.00',
        imageName: require('../assets/1000.jpg')
      },
      {
        mlsId: '1001',
        address: '123 Vue Street',
        city: 'Grandview',
        state: 'Ohio',
        zip: '43015',
        price: '952,345.72',
        imageName: require('../assets/1001.jpg')
      },
      {
        mlsId: '1002',
        address: '123 Java Blue Court',
        city: 'Columbus',
        state: 'Ohio',
        zip: '43023',
        price: '750,000.00',
        imageName: require('../assets/1002.jpg')
      },
      {
        mlsId: '1003',
        address: '999 C-Sharp Rd.',
        city: 'Dublin',
        state: 'Ohio',
        zip: '43017',
        price: '99.97',
        imageName: require('../assets/1003.jpg')
      },
      {
        mlsId: '1004',
        address: '555 Cohort Lane. Apt. 1',
        city: 'Columbus',
        state: 'Ohio',
        zip: '43022',
        price: '1,000,000.01',
        imageName: require('../assets/1004.jpg')
      }      
  ],


  },
  mutations: {
  },
  actions: {
  },
  modules: {
  }
})
