<template>
  <div class="fancy">
    <slot name="title"></slot>
    <slot name="photo"></slot>
  </div>
</template>

<script>
export default {
  name: 'FancyPhotoBox',
};
</script>

<style scoped>
.fancy {
  width: 500px;
  height: 500px;
  text-align: center;
  padding: 30px;
  border-radius: 50%;
  border: 10px solid rebeccapurple;
  background-color: plum;
  margin: 30px;
}
</style>
