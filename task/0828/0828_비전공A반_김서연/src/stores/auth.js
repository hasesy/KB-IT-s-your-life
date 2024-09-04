import { ref, computed, reactive } from 'vue';
import { defineStore } from 'pinia';

const initState = {
  token: '',
  user: {
    username: '',
    email: '',
    roles: [],
  },
};

export const useAuthStore = defineStore('auth', () => {
  const state = ref({ ...initState });
  const isLogin = computed(() => !!state.value.user.username);
  const username = computed(() => state.value.user.username);
  const email = computed(() => state.value.user.email);
  const login = async (member) => {
    state.value.token = 'test token';
    state.value.user = {
      username: member.username,
      email: member.username + '@test.com',
    };

    localStorage.setItem('auth', JSON.stringify(state.value));
  };

  const logout = () => {
    localStorage.clear();
    state.value = { ...initState };
  };

  const load = () => {
    const auth = localStorage.getItem('auth');
    if (auth != null) {
      state.value = JSON.parse(auth);
      console.log(state.value);
    }
  };

  load();

  return {
    state,
    username,
    email,
    isLogin,
    login,
    logout,
  };
});
