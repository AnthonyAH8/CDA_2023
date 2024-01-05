import { Router, createWebHistory } from "vue-router"

const router = createRouter({
    history: createWebHistory(),
    routes: [
        {path: '/', component: Home}
    ],
})

export default router