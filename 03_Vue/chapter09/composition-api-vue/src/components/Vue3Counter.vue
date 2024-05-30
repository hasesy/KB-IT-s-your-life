<template>
  <div>
    <h1>Vue3 Counter</h1>
    <p>Count : {{ count }}</p>
    <p>두배로! {{ double }}</p>
    <p>지금까지 계산한 횟수 : {{ CalcNum }}</p>
    <button @click="increment">increment</button>
    <button @click="decrement">decrement</button>
  </div>
</template>

<script setup>
import { ref, computed } from 'vue';

const count = ref(0);
const double = computed(() => count.value * 2);
const CalcNum = ref(0);

function increment() {
  count.value++;
  CalcNum.value++;
}

function decrement() {
  count.value--;
  CalcNum.value++;
}
</script>
