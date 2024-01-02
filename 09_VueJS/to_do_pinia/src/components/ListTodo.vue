<script setup>
    import { useTodos } from '@/stores/todolist';

    const filtered = useTodos();
</script>

<template>

<ul v-for="todo in filtered">
    <li>
        {{ todo.title }}
    </li>
</ul>

</template>

<style scoped>
   ul{
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: row;
   } 
</style>