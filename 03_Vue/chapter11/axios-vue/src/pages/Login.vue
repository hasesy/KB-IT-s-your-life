<template>
  <div>
    <h1>Login</h1>
    아이디 : <input v-model.trim="userId" type="text" />
    <br />
    패스워드 : <input v-model.trim="userPassword" type="password" />
    <br />
    <button @click="login">로그인</button>
    &nbsp;
    <button @click="logout">로그아웃</button>
  </div>
</template>

<script setup>
import { ref } from 'vue';
import axios from 'axios';

const userId = ref('');
const userPassword = ref('');

async function login() {
  try {
    const url = 'http://localhost:3000/users';
    const loginRes = await axios.get(url);

    const userArr = loginRes.data;

    const findedUser = userArr.find((item, index) => item.id === userId.value);

    if (findedUser === undefined) {
      return alert('해당 ID를 가지는 사용자가 없습니다!');
    }

    if (findedUser.password !== userPassword.value) {
      return alert('비밀번호가 일치하지 않습니다!');
    }

    localStorage.setItem('auth', 'true');
    alert('로그인 성공!');
  } catch (e) {
    alert('로그인 과정에 문제 발생!');
    console.log(e);
  }
}

async function logout() {
  localStorage.removeItem('auth');
  alert('로그아웃 되었습니다!');
}
</script>
