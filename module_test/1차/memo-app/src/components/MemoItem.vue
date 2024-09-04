<script setup>
defineProps({
  memo: { type: Object, required: true },
});
</script>

<template>
  <tr>
    <td>{{ memo.id }}</td>
    <td>
      <RouterLink :to="{ name: 'memo/id', params: { id: memo.id } }">
        {{ memo.title }}
      </RouterLink>
    </td>
  </tr>
</template>

<style scoped></style>
