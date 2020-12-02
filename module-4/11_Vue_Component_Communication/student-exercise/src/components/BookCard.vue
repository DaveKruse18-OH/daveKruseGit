

<template>
  <div class="card" id="bookcard">
    <h2 class="book-title">{{book.title}}</h2>
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <h3 class="book-author">{{book.author}}</h3>
    <button v-on:click.prevent="flipStatus(true)" v-if="!book.read">Mark Read</button>
    <button v-on:click.prevent="flipStatus(false)" v-if="book.read">Mark Unread</button>
  </div>
</template>

<script>
export default {
    name: 'book-card',
    props: ["book"],
    methods: {
        flipStatus(value) {
            //this.setClasses();
            this.$store.commit('SET_READ_STATUS', {book: this.book, value: value});
        },
        setClasses() {
            let element = document.getElementsByTagName("book-card");
            if (element.classList.contains("card-read")) {
                element.classList.remove("card-read");
            } else {
                element.classList.add("card-read");
            }
        }
    }
}
</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card-read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}

</style>