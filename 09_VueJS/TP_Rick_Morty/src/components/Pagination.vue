<script setup>
import { useCharacters } from '@/store/store';
const CharactersStore = useCharacters()
const { getCaracters } = CharactersStore
getCaracters()
</script>
<template>
    <h1>toto</h1>
</template>

<style scoped>
</style>