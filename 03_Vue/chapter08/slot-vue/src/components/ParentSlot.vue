<template>
  <div>
    <ChildSlot>
      <h1>테스트, 너는 잘 가니?!</h1>
      <img
        src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3_i7ecTTVSfyb9SxxrNV4OHSAw6athgdMDw&s"
        alt="도움고앵이"
      />
    </ChildSlot>
  </div>
</template>

<script>
import ChildSlot from './ChildSlot.vue';

export default {
  name: 'ParentSlot',
  components: { ChildSlot },
};
</script>

<style lang="scss" scoped></style>
