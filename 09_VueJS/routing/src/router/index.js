import { createRouter, createWebHashHistory } from 'vue-router';
import Home from '../views/Home.vue';
import Error404 from '../views/Error404.vue';
import Contact from '../views/Contact.vue';
import ContactShow from '../views/ContactShow.vue';

const router  = createRouter({
    history : createWebHashHistory(),
    routes : [
        {path: '/', component: Home},
        {path: '/:pathMatch(.*)', component: Error404},
        {path: '/contact', component: Contact},
        {path: '/contactShow', component: ContactShow},
    ]
})

export default router;