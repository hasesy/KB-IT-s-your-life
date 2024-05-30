<template>
  <div class="main">
    <h1>모달 열기를 눌러주세요</h1>
    <button @click="showModal">모달 열기</button>
    <ModalComponent :visible="isModalVisible" @close-modal="hideModal">
      <template #title>
        <h1>워!!!!!!!!!!!!!!!!!!!!!!!!!</h1>
      </template>
      <template #photo>
        <img
          src="https://pbs.twimg.com/profile_images/1684152198404665344/wkLSSRub_400x400.jpg"
          alt="놀래키는 고앵이"
        />
      </template>
    </ModalComponent>
  </div>
</template>

<script setup>
import { ref } from 'vue';
import ModalComponent from './components/ModalComponent.vue';

const isModalVisible = ref(false);

function showModal() {
  isModalVisible.value = true;
}

function hideModal() {
  isModalVisible.value = false;
}
</script>

<style scoped>
.main {
  display: flex;
  flex-direction: column;
  align-items: center;
}
</style>
