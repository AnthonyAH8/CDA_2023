<script setup>

import { inject } from 'vue';

const { contacts } = inject('contacts')

</script>

<template>
    <div class="customers">
        <h2>Clients : </h2>
        <ul>
            <li v-for="customer in contacts"><RouterLink :to="`contact/${customer.id}`">{{ customer.name }} {{ customer.email }} {{ customer.phone }}</RouterLink></li>
            
        </ul>
    </div>
    </template>

<style scoped>
.customers{
        display: flex;
        justify-content:center;
        align-items:center;
        flex-direction:column;
}
</style>
