<template>
  <div>
      <img src="../assets/java-green.png"/>
      <h1>  {{pageTitle}} </h1>
      <nav>
        <a href="#">Home</a>
        <a href="#">About</a>
        <a href="#">Home Search</a>
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


<style>
img {
    width:18%;
    height: auto;
}

nav {
    display: flex;
    justify-content: center;
}

nav a {
    padding: 15px 25px;
    background-color: rgb(4,245,85);
}
nav a:hover {
    background-color: #37df7d;
}
</style>