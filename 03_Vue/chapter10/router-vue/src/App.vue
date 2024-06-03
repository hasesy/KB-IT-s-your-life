<script setup></script>

<template>
  <div>
    <nav>
      <!-- 케밥케이스든 카밀케이스든 둘 다 가능, 통일만 하기 -->
      <router-link to="/">홈페이지</router-link>
      <!-- 스페이스바 한 칸을 의미 - $nbsp -->
      &nbsp;
      <router-link to="/about">라우터란?</router-link>
      &nbsp;
      <router-link to="/dynamic/happy">행복하다</router-link>
      &nbsp;
      <router-link to="/dynamic/exciting">신난다</router-link>
    </nav>
    <RouterView />
  </div>
</template>
