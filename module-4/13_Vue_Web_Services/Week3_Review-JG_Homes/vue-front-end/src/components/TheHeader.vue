<template>
  <div>
      <img src="../assets/java-green.png" />
      <h1>{{pageTitle}}</h1>

      <nav>
          <a href="#">Home</a>
          <a href="#">About</a>
          <a href="#">Search Homes</a>
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
