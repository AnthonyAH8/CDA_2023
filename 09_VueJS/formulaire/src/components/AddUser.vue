<script setup>
import { ref, defineEmits } from 'vue';
import UserList from './UserList.vue';

const newUser = ref('');
const newUserMail = ref('')
const emit = defineEmits(['add-user', 'add-user-mail'])

function emitaddUser(){
    emit('add-user', newUser.value);
    newUser.value = ''
}

function emitaddUserMail(){
  emit('add-user-mail', newUserMail.value);
  newUserMail.value = ''
}

</script>
<template>
  <div>
    {{ users}}
  </div>
  <div class="d-grid flex-column justify-content-center">
    <input type="text" placeholder="Saisir votre nom d'utilisateur" class="my-2 form-control" v-model="newUser" @keyup.enter="emitaddUser">
    <input type="text" placeholder="Saisir votre adresse mail" class="my-2 form-control" v-model="newUserMail" @keyup.enter="emitaddUserMail">
    <button @click="emitaddUser" class="btn btn-success my-2">Ajouter un utilisateur </button>
    <button @click="emitaddUserMail" class="btn btn-primary my-2">Ajouter une adresse mail </button>
  </div>
</template>
<style scoped>

</style>
