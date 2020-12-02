<template>
    <div>
        <best-seller-list/>
        <new-releases-list/>
  </div>
</template>

<script>
import BestSellerList from '@/components/BestSellerList';
import NewReleasesList from '@/components/NewReleasesList';

export default {
    name: 'home',
    components: {
        BestSellerList,
        NewReleasesList
    },
    created() {

    }
};
</script>

<style>

</style>