<template>
    <div>
        <reading-list/>
        <nav>
            <a href='#' v-on:click.prevent="goAddBook">Add Book To Reading List</a>
        </nav>
    </div>
</template>

<script>
import ReadingList from '@/components/ReadingList';

export default {
   name: 'my-books',
    components: {
        ReadingList
    },
    methods: {
        goAddBook() {
            this.$router.push({name: 'add-book'})
        }
    },
    created() {

    }
};
</script>

<style>

</style>