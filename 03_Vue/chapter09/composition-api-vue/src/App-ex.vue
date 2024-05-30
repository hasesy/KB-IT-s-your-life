<template>
  <div>
    <h1>{{ msg }}</h1>
    <ChildComponent :randNum="randNum" @send-result="emitHandler" />
  </div>
</template>

<script setup>
import { ref } from 'vue';
import ChildComponent from './components/ChildComponent.vue';

const msg = ref('랜덤 숫자를 맞춰주세요.');
const randNum = ref(parseInt(Math.random() * 20));

function emitHandler(value) {
  msg.value = value;
}
</script>
