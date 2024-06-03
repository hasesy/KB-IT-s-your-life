<template>
  <div>
    <h1>오늘의 기분은!? {{ msg }}</h1>
    <img :src="imgSrc" :alt="msg" />
  </div>
</template>

<script setup>
import { ref, watch, computed } from 'vue';
import { useRoute } from 'vue-router';

const currentRoute = useRoute();
const mood = ref(currentRoute.params.mood);

watch(
  () => currentRoute.params.mood,
  (newMood) => {
    mood.value = newMood;
  }
);

const msg = computed(() =>
  mood.value === 'happy' ? '행복합니다' : '신납니다!'
);

const imgSrc = computed(() =>
  mood.value === 'happy'
    ? 'https://i.pinimg.com/564x/c5/5c/76/c55c762ce418abefd071aa7e81c5a213.jpg'
    : 'https://p19-capcutugimg-sign-va.ibyteimg.com/tos-alisg-v-643f9f/okIWUIyBLmv7PBW5BAEY7viBlAABNwf4iaXATg~tplv-sehyhbs0wv-resize:400:400.jpeg?rk3s=51a218fb&x-expires=1719939965&x-signature=cSEBjONU5VT7C5DiQC0Qsthmdek%3D'
);
</script>
