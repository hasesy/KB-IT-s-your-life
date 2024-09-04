<script setup>
import config from '@/config';
</script>
<template>
  <div class="jumbotron p-5 bg-primary text-black">
    <h1>{{ config.title }}</h1>
    <p>{{ config.subtitle }}</p>
  </div>
</template>
<style scoped>
.jumbotron {
  background-repeat: no-repeat;
  background-position: center;
  background-size: cover;
  color: white;
  padding: 2rem;
}
</style>
