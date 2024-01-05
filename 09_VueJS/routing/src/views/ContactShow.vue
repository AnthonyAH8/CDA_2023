<script setup>

import { RouterLink } from 'vue-router';

import { useRouter } from 'vue-router';
import { useRoute } from 'vue-router';
import { inject } from 'vue';
import Error404 from './Error404.vue';

const { contacts } = inject('contacts');

const route = useRoute();
const router = useRouter();

const { contactID } = route.params

const customers = contacts.value.find(customer => customer.id === contactID);

if(!customers){
  router.push(Error404)
}

</script>

<template>
    <div class="container">
        <ul v-for="customer of contacts">
            <li>
            <RouterView>
                {{ customer.name }}
                {{ customer.email }}
                {{ customer.phone }}
                {{ customer.city }}
                {{ customer.state }}
                {{ customer.country }}
                {{ customer.additionnalInfo }}
            </RouterView>
            </li>
        </ul>
    </div>
</template>

<style scoped>
    .container{
        display: flex;
        justify-content:center;
        align-items:center;
        flex-direction:column;
    }
</style>