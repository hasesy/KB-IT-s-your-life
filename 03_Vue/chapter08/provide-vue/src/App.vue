<script setup>
import Child from './components/Child.vue';
</script>

<template>
  <div>
    <Child :drilling="drilling" />
  </div>
</template>

<script>
export default {
  name: 'App',
  data() {
    return {
      drilling: '으아아아아아 어디까지 내려가는 거예요~',
    };
  },
  provide() {
    return {
      fly: '한 번에 와버렸구먼유',
    };
  },
};
</script>

<style lang="scss" scoped></style>
