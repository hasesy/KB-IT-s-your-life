<script setup>
import { RouterLink, RouterView } from 'vue-router';
</script>

<template>
  <header>
    <h1 style="margin-bottom: 10px">우리에겐 RM이 있조 !</h1>
    <h3 style="color: gray; margin-left: 25px; margin-top: 10px">
      Na geonu &nbsp;&nbsp;&nbsp; Kim isu &nbsp;&nbsp;&nbsp; Kim yeonbi
      &nbsp;&nbsp;&nbsp; Kim seoyeon
    </h3>
  </header>
  <div class="profile">
    <RouterLink to="/"></RouterLink>
    <div id="cover">
      <RouterLink to="/geonu"
        ><img class="image" src="../images/geonu.png" alt="Geonu" />
      </RouterLink>
      <div style="text-align: center">
        <h2>나건우</h2>
        <h3>1997.07.29</h3>
        <h3>010-2531-6122</h3>
        <h3>kwna0729@naver.com</h3>
      </div>
      <div class="overlay"></div>
    </div>
    <div id="cover">
      <RouterLink to="/isu"
        ><img class="image" src="../images/isu.png" alt="Isu"
      /></RouterLink>
      <div style="text-align: center">
        <h2>김이수</h2>
        <h3>2000.01.13</h3>
        <h3>010-4090-2214</h3>
        <h3>gimeus@naver.com</h3>
      </div>
      <div class="overlay"></div>
    </div>
    <div id="cover">
      <RouterLink to="/seoyeon"
        ><img class="image" src="../images/seoyeon.png" alt="Seoyeon"
      /></RouterLink>
      <div style="text-align: center">
        <h2>김서연</h2>
        <h3>2000.06.07</h3>
        <h3>010-9498-7605</h3>
        <h3>kseoy0607@gmail.com</h3>
      </div>
      <div class="overlay"></div>
    </div>
    <div id="cover">
      <RouterLink to="/yeonbi"
        ><img class="image" src="../images/yeonbi.png" alt="Yeonbi"
      /></RouterLink>
      <div style="text-align: center">
        <h2>김연비</h2>
        <h3>1992.07.11</h3>
        <h3>010-2387-4207</h3>
        <h3>yeonbikim@naver.com</h3>
      </div>
      <div class="overlay"></div>
    </div>

    <RouterView />
  </div>
</template>

<style>
body {
  margin: 0 auto;
  padding: 0;
  background-color: black;
}

.profile {
  display: flex;
  justify-content: center;
  width: 100%;
}

.image {
  width: 400px;
  margin: 46px;
  margin-bottom: 0;
}

h3 {
  margin: 8px;
}

#cover {
  position: relative;
  color: black;
}

#cover:hover {
  color: white;
}

.overlay {
  position: absolute;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.8);
  opacity: 1;
}

h1 {
  color: white;
  margin-left: 20px;
}

.overlay:hover {
  background-color: rgba(0, 0, 0, 0);
  opacity: 0;
  transition-duration: 1s;
}
</style>
