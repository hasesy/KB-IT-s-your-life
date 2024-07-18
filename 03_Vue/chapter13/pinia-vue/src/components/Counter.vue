<template>
  <div>
    <h1>Counter</h1>
    <h1>count : {{ count }}</h1>
    <h1>count x 2 : {{ doubleCount }}</h1>
    <button @click="increment">+1</button>
  </div>
</template>

<script setup>
import { computed } from 'vue';
import { useCounterStore } from '@/stores/counter';

const counterStore = useCounterStore();
// 함수는 상관없지만, 원시형 데이터는 computed로 가져와야 함
const { increment } = counterStore;
// 읽기 전용 & 반응성을 유지
const count = computed(() => counterStore.count);
const doubleCount = computed(() => counterStore.doubleCount);
</script>
