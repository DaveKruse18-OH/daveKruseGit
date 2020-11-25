<template>
  <div>
      <p>&#169; {{copyText}} </p>
  </div>    
</template>

<script>
export default {
    name: 'the-footer',
    data() {
        return {
           copyText: 'Java Green Enterprises LLC. All rights reserved.'
        };
    }

}
</script>

<style>

</style>