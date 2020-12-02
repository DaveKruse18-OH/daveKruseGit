<template>
  <div>
    <h1>Hello?</h1>
    <form id="frmAddNewBook" v-on:submit.prevent="addNewBook()">
      <div>
        <label for="bookTitle">Book Title:</label>
        <input type="text" name="bookTitle" v-model="newBook.title"/>
      </div>
      <div class="field">
        <label for="bookAuthor">Book Author:</label>
        <input type="text" name="bookAuthor" v-model="newBook.author"/>
      </div>
      <div class="field">
        <label for="bookIsbn">Username:</label>
        <input type="text" name="bookIsbn" v-model="newBook.isbn"/>
      </div>
      <button type="submit" class="btn save">Save Book</button>
    </form>
  </div>
</template>

<script>


export default {
    name: 'add-book',
    props: ["book"],
    components: {
    }
}
</script>

<style scoped>
.temp {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}

table {
  margin-top: 20px;
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen,
    Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
  margin-bottom: 20px;
}
th {
  text-transform: uppercase;
}
td {
  padding: 10px;
}
tr.disabled {
  color: red;
}
input,
select {
  font-size: 16px;
}

form {
  margin: 20px;
  width: 350px;
}
.field {
  padding: 10px 0px;
}
label {
  width: 140px;
  display: inline-block;
}
button {
  margin-right: 5px;
}
.all-actions {
  margin-bottom: 40px;
}
.btn.save {
  margin: 20px;
  float: right;
}
</style>