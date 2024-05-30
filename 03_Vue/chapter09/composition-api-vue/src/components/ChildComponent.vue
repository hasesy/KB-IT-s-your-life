<template>
  <div>
    <input v-model.number="inputNum" type="text" />
    <button @click="sendResult">정답</button>
  </div>
</template>

<script setup>
import { ref, defineProps, defineEmits } from 'vue';

const inputNum = ref(0);

const props = defineProps({
  randNum: {
    type: Number,
    required: true,
  },
});

function resultFunc() {
  if (props.randNum === inputNum.value) {
    return '정답입니다!';
  } else if (props.randNum > inputNum.value) {
    return 'UP';
  } else {
    return 'DOWN';
  }
}

const emit = defineEmits(['send-result']);

function sendResult() {
  emit('send-result', resultFunc());
}
</script>
