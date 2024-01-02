<script setup>
import { ref } from 'vue';
import ListTodo from './ListTodo.vue';
</script>

<template>

    <div>
        <ul v-for="todo in filtered">
    <li>
        {{ todo.title }}
    </li>
</ul>
    </div>

</template>

<style>

</style>