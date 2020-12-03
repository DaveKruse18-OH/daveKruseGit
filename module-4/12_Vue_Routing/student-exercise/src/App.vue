<template>
  <div id="app">
    <nav>
      <a href='#' v-on:click.prevent="goHome">Home</a>&nbsp;<a href='#' v-on:click.prevent="goMyBooks">Go Home</a>
    </nav>
    <router-view />
  </div>
</template>

<script>

export default {
  name: 'app',
  methods: {
    goHome() {
      this.$router.push({name: 'home'});
    },
    goMyBooks() {
      this.$router.push({name: 'my-books'})
    }
  }
};

</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin: 60px;
}
</style>
