import { defineStore } from 'pinia';
import { computed, reactive } from 'vue';

export const useTodoListStore = defineStore('todoList', () => {
  const state = reactive({
    todoList: [
      { id: 1, todo: 'ES6학습', done: false },
      { id: 2, todo: 'React학습', done: false },
      { id: 3, todo: 'ContextAPI학습', done: true },
      { id: 4, todo: '야구경기 관람', done: false },
    ],
  });

  const addTodo = (todo) => {
    state.todoList.push({ id: new Date().getTime(), todo, done: false });
  };

  const deleteTodo = (id) => {
    const index = state.todoList.findIndex((todo) => todo.id === id);

    state.todoList.splice(index, 1);
  };

  const toggleDone = (id) => {
    const index = state.todoList.findIndex((todo) => todo.id === id);
    state.todoList[index].done = !state.todoList[index].done;
  };

  const countDone = computed(
    () => state.todoList.filter((todoItem) => todoItem.done === true).length
  );

  const todoList = computed(() => state.todoList);

  return { todoList, countDone, addTodo, deleteTodo, toggleDone };
});
