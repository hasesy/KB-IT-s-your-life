<script setup>
import { ref, reactive } from 'vue';
import { useRouter } from 'vue-router';
import axios from 'axios';

const BASE = '/api/memo';
const memo = reactive({ title: '', content: '' });
const router = useRouter();

// 5.	메모 등록 코드를 완성하세요.
// - 확인 버튼을 클릭하면 입력한 데이터가 서버에 저장되고, 목록 보기로 이동한다.
async function submit() {
  const addMemo = await axios.post(BASE, memo);

  try {
    if (addMemo.status === 201) {
      back();
    } else {
      console.log('데이터 보내기 오류 발생');
    }
  } catch (error) {
    console.log('데이터 보내기 오류 발생');
  }
}

// - 돌아가기를 클릭하면 목록 보기로 이동한다.
function back() {
  router.push('/memo');
}
</script>

<template>
  <h2>새 메모 작성</h2>

  <div>제목: <input v-model="memo.title" /></div>
  <div>
    내용:
    <textarea rows="5" style="width: 100%" v-model="memo.content"></textarea>
  </div>
  <button @click="submit">확인</button>
  <button @click="back">돌아가기</button>
</template>

<style scoped></style>
