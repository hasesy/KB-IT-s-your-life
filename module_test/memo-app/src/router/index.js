import { createRouter, createWebHistory } from 'vue-router';
import MemoListPage from '../pages/MemoListPage.vue';
import MemoDetailPage from '@/pages/MemoDetailPage.vue';
import MemoWritePage from '@/pages/MemoWritePage.vue';

const HomeView = () => import('../pages/MemoListPage.vue');

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/', name: 'home', component: HomeView },
    // 1.	라우터 테이블을 완성하세요.
    { path: '/memo', name: 'memo', component: MemoListPage },
    { path: '/memo/view/:id', name: 'memo/id', component: MemoDetailPage },
    { path: '/memo/write', name: 'memo/write', component: MemoWritePage },
  ],
});

export default router;
