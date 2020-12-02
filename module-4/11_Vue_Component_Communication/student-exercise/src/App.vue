<template>
  <div id="app">
    <h1>Reading List</h1>
    <reading-list />
    <h1>Add Book</h1>
    <add-book />
  </div>
</template>

<script>
import ReadingList from './components/ReadingList.vue';
import AddBook from './components/AddBook.vue';

export default {
  name: 'app',
  components: {
    ReadingList,
    AddBook
  }
}
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
