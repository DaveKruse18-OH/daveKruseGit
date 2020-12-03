<template>
  <div>
      <img src="../assets/java-green.png" />
      <h1>{{pageTitle}}</h1>

      <nav>
   
        <router-link v-bind:to="{ name: 'home' }">Home</router-link>
         <router-link v-bind:to="{ name: 'search' }">Search Homes</router-link>
         <router-link v-bind:to="{ name: 'addHome' }">Add A New Home</router-link>
        <router-link v-bind:to="{ name: 'login' }" v-if="$store.state.token == ''">Login</router-link>
        <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>

      </nav>

  </div>    
</template>

<script>
export default {
    name: 'the-header',
    data() {
        return {
           pageTitle: 'Java Green Home Search'
        };
    }

}
</script>

<style scoped>

nav {
        display: flex;
        justify-content: center;
        flex-wrap: wrap;
      }
      nav a {
        text-decoration: none;
        display: block;
        padding: 15px 25px;
        text-align: center;
        background-color: rgb(4, 245, 85);
        color: #03722e;
        margin: 0;
        font-family: sans-serif;
      }
      nav a:hover {
        background-color: #59ec96;
        color: #ffffff;
      }


  img {
      width: 15%;
      height: auto;
  }

</style>>
