<script setup>
import { ref } from 'vue';
import AddUser from './components/AddUser.vue';
import UserList from './components/UserList.vue';

const users = ref([])
const newUser = ref("")
const newUserMail = ref("")

const addUser = newUser => {
  users.value.push({text: newUser})
  console.log(newUser)
}

const addUserMail = newUserMail => {
  users.value.push({text: newUserMail})
  console.log(newUserMail)
}

// const removeUser = index => {
//   users.value.splice(index, 1)
// }
</script>

<template>
  <h1 class="text-center mt-5">Utilisateurs</h1>
  <h3 v-if="users.length"></h3>
  <AddUser @add-user="addUser"/>
  <div>
    <UserList v-for="(user, index) in users"
    :key="index"
    :user="user"
    :index="index"
    @add-user="addUser"
    />
  </div>
  <div>
    <UserList v-for="(user, index) in users"
    :key="index"
    :user="user"
    :index="index"
    @add-user="addUser"
    @add-user-mail= "addUserMail"
    />
  </div>
</template>

<style scoped>

</style>
