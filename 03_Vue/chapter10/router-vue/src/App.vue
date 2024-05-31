<script setup></script>

<template>
  <div>
    <nav>
      <!-- 케밥케이스든 카밀케이스든 둘 다 가능, 통일만 하기 -->
      <router-link to="/">홈페이지</router-link>
      <!-- 스페이스바 한 칸을 의미 - $nbsp -->
      &nbsp;
      <RouterLink to="/about">라우터란?</RouterLink>
    </nav>
    <RouterView />
  </div>
</template>
