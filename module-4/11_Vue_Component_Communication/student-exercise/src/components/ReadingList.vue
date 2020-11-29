<template>
  <div class="book-container">
    <book-card
      v-for="book in $store.state.books"
      v-bind:key="book.isbn"
      v-bind:book="book"
    />
  </div>
</template>

<script>
import BookCard from "./BookCard";

export default {
    name: 'reading-list',
    components: {
      BookCard
    //},
    //computed: {
    //  filteredBooks() {
    //    const booksFilter = -1;
    //    const books = [];
    //    return books.filter(book => {
    //      return booksFilter === 0 ? true : booksFilter === book.title;
    //    });
    //  }
    }
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>