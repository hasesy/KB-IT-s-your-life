import { createRouter, createWebHistory } from 'vue-router';

import Home from '@/pages/Home.vue';
import Login from '@/pages/Login.vue';
import Todo from '@/pages/Todo.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
    },
    {
      path: '/login',
      name: 'login',
      component: () => Login,
    },
    {
      path: '/todo',
      name: 'todo',
      component: () => Todo,
      meta: { requiresAuth: true },
    },
  ],
});

// beforeEach() = 라우터가 실행되기 전에 이 메서드를 먼저 실행시켜주셈
// to는 어디로 가는지, from은 어디에서 왔는지, next는 통과시키고 싶으면 실행시키는 함수
// some은 배열들 중 하나라도 true면 true를 보내줌
router.beforeEach((to, from, next) => {
  // matched는 갈 곳들을 매치해주는데 여기선 Home, Login, Todo가 뜰거임
  // 그걸 some으로 meta.requiresAuth를 가진 애를 고르는 것
  if (to.matched.some((record) => record.meta.requiresAuth)) {
    if (localStorage.getItem('auth') !== 'true') {
      alert('로그인이 필요합니다.');
      next({ name: 'login' });
    } else {
      next();
    }
  } else {
    next();
  }
});

export default router;
