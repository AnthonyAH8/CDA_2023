
import { RouterLink } from 'vue-router';
<script setup>

import { useRouter } from 'vue-router';
import { useRoute } from 'vue-router';
import { inject } from 'vue';

const { contacts } = inject('contacts');

const route = useRoute();
const router = useRouter();

const { contactID } = route.params

const customers = contacts.value.find(customer => customer.id === contactID);

</script>

<template>
    <div class="container">
        <ul v-for="customer of contacts">
            <li>
            <RouterLink :to="`/contactShow/${customer.id}`">
                {{ customer.name }}
                {{ customer.email }}
                {{ customer.phone }}
                {{ customer.city }}
                {{ customer.state }}
                {{ customer.country }}
                {{ customer.additionnalInfo }}
            </RouterLink>
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
