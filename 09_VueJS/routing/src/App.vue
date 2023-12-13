<script setup>
import { RouterLink, RouterView } from 'vue-router';


</script>

<template>
  <header>
    <h1>Liste des clients</h1>
  </header>
  <main>
    <li>
      <RouterLink to="/">Accueil</RouterLink>
    </li>
    <li>
      <RouterLink to="/contact">Contacts</RouterLink>
    </li>
    <li>
      <RouterLink to="/contactShow">Détail des clients</RouterLink>
    </li>
    <RouterView></RouterView>
  </main>
</template>

<style scoped>
main {
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
}
</style>
