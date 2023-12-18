import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";
import List from "../views/HomeView.vue";
import Filter from "../views/HomeView.vue";
import Character from "../views/HomeView.vue";

const router = createRouter({
    history: createWebHistory(),
    routes: [
        {path: '/', component : HomeView},
        {path: '/list', component : List},
        {path: '/filter', component : Filter},
        {path: '/character', component : Character},
    ],
})

export default router;