<script setup>
import MemoItem from './MemoItem.vue';

// 문제 3. memos 프로퍼티를 정의하세요.
defineProps({
  memos: {
    type: Array,
    required: true,
  },
});
</script>

<template>
  <table style="width: 100%">
    <thead>
      <tr>
        <th style="width: 50px">id</th>
        <th>title</th>
      </tr>
    </thead>

    <tbody>
      <!-- 문제 3. memos 프로퍼티로 MemoItem 컴포넌트를 메모 수 만큼 렌더링 하세요. -->
      <MemoItem v-for="memo in memos" :key="memo.id" :memo="memo" />
    </tbody>
  </table>
</template>

<style scoped></style>
