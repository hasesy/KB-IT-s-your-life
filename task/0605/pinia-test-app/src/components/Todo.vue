<template>
  <div>
    <h1>TodoList 테스트(Composition API)</h1>
    <hr />
    할일 추가 :
    <input v-model="todo" type="text" />
    <button @click="addTodoHandler">추가</button>
    <hr />
    <ul>
      <li v-for="todoItem in todoList" :key="todoItem.id">
        <span style="cursor: pointer" @click="toggleDone(todoItem.id)">
          {{ todoItem.todo }} {{ todoItem.done ? '(완료)' : '' }}
        </span>
        &nbsp; &nbsp; &nbsp;
        <button @click="deleteTodo(todoItem.id)">삭제</button>
      </li>
    </ul>
    <div>완료된 할일 수 : {{ countDone }}</div>
  </div>
</template>

<script setup>
import { useTodoListStore } from '@/stores/todo';
import { ref, computed } from 'vue';

const todo = ref('');

const todoListStore = useTodoListStore();
const { todoList, addTodo, deleteTodo, toggleDone } = todoListStore;
const countDone = computed(() => todoListStore.countDone);

const addTodoHandler = () => {
  addTodo(todo.value);
  todo.value = '';
};
</script>
