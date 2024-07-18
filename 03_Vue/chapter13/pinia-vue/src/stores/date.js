import { ref } from 'vue';
import { defineStore } from 'pinia';

export const useDateStore = defineStore('Date', () => {
  const printMsg = ref('');

  const date = new Date();
  const year = date.getFullYear();
  const month = date.getMonth();
  const day = date.getDate();

  function yearPrint() {
    printMsg.value = `오늘은 ${year}년 입니다`;
  }

  function monthPrint() {
    printMsg.value = `오늘은 ${month + 1}월 입니다`;
  }

  function datePrint() {
    printMsg.value = `오늘은 ${day}일 입니다`;
  }

  return { printMsg, yearPrint, monthPrint, datePrint };
});
