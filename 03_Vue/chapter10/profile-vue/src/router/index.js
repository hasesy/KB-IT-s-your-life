import { createRouter, createWebHistory } from 'vue-router';

import Geonu from '@/pages/Geonu.vue';
import Isu from '@/pages/Isu.vue';
import Seoyeon from '@/pages/Seoyeon.vue';
import Yeonbi from '@/pages/Yeonbi.vue';
import Home from '@/pages/Home.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
    },
    {
      path: '/geonu',
      name: 'geonu',
      component: Geonu,
    },
    {
      path: '/seoyeon',
      name: 'seoyeon',
      component: Seoyeon,
    },
    {
      path: '/isu',
      name: 'isu',
      component: Isu,
    },
    {
      path: '/yeonbi',
      name: 'yeonbi',
      component: Yeonbi,
    },
  ],
});

export default router;
