<template>
  <div>
    <ParentScopedSlot />
  </div>
</template>

<script>
import ParentScopedSlot from './components/ParentScopedSlot.vue';

export default {
  name: 'App',
  components: { ParentScopedSlot },
};
</script>

<style scoped></style>
