<script setup>
import MemoList from '@/components/MemoList.vue';
import { ref, reactive } from 'vue';
import axios from 'axios';

const BASE = '/api/memo';

// 문제2. src/pages/MemoLsitPage.vue에서는 메모 목록을 서버로부터 받아, MemoList 컴포넌트로 전달한다.
// 스크립트 파트를 완성하세요.

const memos = ref([]);

async function load() {
  try {
    const fetchMemoRes = await axios.get(BASE);

    if (fetchMemoRes.status === 200) {
      memos.value = fetchMemoRes.data;
    } else {
      console.log('데이터 통신 오류 발생');
    }
  } catch (error) {
    console.log(error);
  }
}
///////

load(); //초기 데이터 로드 함수 호출
</script>

<template>
  <h2>Memo 목록</h2>
  <MemoList :memos="memos" />

  <div>
    <router-link to="/memo/write">새 메모</router-link>
  </div>
</template>

<style scoped></style>
