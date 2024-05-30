<template>
  <div>
    <h1>드디어 도착한 props의 내용은?!</h1>
    <h2>Props로 굴러온 데이터 : {{ drilling }}</h2>
    <h2>Inject로 날아온 데이터 : {{ fly }}</h2>
  </div>
</template>

<script>
export default {
  name: 'GrandChild',
  props: ['drilling'],
  inject: ['fly'],
};
</script>

<style lang="scss" scoped></style>
