<template>
  <div id="app">
     <the-header></the-header>
      <home-search></home-search>
      <the-footer></the-footer>
  </div>
</template>

<script>
import TheHeader from './components/TheHeader.vue'
import TheFooter from './components/TheFooter.vue'
import HomeSearch from './components/HomeSearch.vue'

export default {
  name: 'App',
  components: {
    TheHeader,
    TheFooter,
    HomeSearch
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
