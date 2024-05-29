<template>
  <div>
    <FancyPhotoBox>
      <template #title>
        <h1>살려줘요</h1>
      </template>
      <template #photo>
        <img
          src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3_i7ecTTVSfyb9SxxrNV4OHSAw6athgdMDw&s"
          alt="도움이 필요한 고앵이"
        />
      </template>
    </FancyPhotoBox>
  </div>
</template>

<script>
import FancyPhotoBox from './FancyPhotoBox.vue';

export default {
  name: 'ParentFancyPhotoBox',
  components: { FancyPhotoBox },
};
</script>

<style lang="scss" scoped></style>
