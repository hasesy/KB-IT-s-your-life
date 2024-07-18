<template>
  <div>
    <h1>Date</h1>
    <h1>{{ printMsg }}</h1>
    <button @click="yearPrint">년도 출력</button>
    <button @click="monthPrint">월 출력</button>
    <button @click="datePrint">일자 출력</button>
  </div>
</template>

<script setup>
import { computed } from 'vue';
import { useDateStore } from '@/stores/date';

const dateStore = useDateStore();
const { yearPrint, monthPrint, datePrint } = dateStore;

const printMsg = computed(() => dateStore.printMsg);
</script>
