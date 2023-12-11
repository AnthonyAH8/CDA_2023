<script setup>
import { reactive, ref } from 'vue';

// let table = ref([2, 4, 6, 8])
// let toggle = ref(false)
// let count = 8

// function addValue() {
//   count +=2
//   let add = table.value.push(count)
// }

// function deleteValue(){
//   let shift = table.value.shift(table)

// }
// function reverseValue(){
//   let reverse = table.value.reverse(table)
// }


let activities = ref(['Réviser', 'Coder', 'Faire les courses'])
let todo = ref("")
let checked = ref(true)
let filter = ref("")

function addTodo(){
  activities.value.push(todo.value)
  console.log(activities);
}

function doneTodo(){
  activities.value.splice(0,1)
}

// function filtertasks(){
//   activities.filter(activities => )
// }

</script>

<template>
  <form action="#" @submit.prevent> 
    <div>
      <label for="todoList">Liste de choses à faire: </label>
      <input type="text" name="todoList" id="todoList" v-model="todo">
    </div>
    <div>
      <ul v-for="activity in activities">
      <li>{{ activity }}</li>
    </ul>
    </div>

    <div>
      <p>Action des choses: </p>
      <input type="radio" id="todo" value="todo" v-model="todo" />
      <label for="todo">A faire</label>
      <input type="radio" id="done" value="done" v-model="checked" />
      <label for="done">Fait</label>
    </div>

    <div>
      <button @click="addTodo">A faire</button>
      <button @click="doneTodo">Fait</button>
    </div>

    <div>
      
    </div>

  </form>
  <!-- <div>
    <button @click="toggle = !toggle">Toggle liste</button>
    <button @click="addValue">Ajouter élément</button>
    <button @click="deleteValue">Supprimer élément</button>
    <button @click="reverseValue">Inverser la table</button>
  </div>
  <div>
    <ul v-for="t in table" v-show="toggle">
      <li>{{ t }}</li>
    </ul>
  </div>

  <div v-if="table.length === 0">
    <p>Le tableau est vide</p>
  </div> -->
</template>

<style scoped>

</style>
<!-- # TodoList

1. Créer un champ de saisi pour un formulaire
2. Ajouter un todo à une liste réactive
3. On peut éditer le statut d'une todo via une checkbox
4. Ajouter des boutons pour trier la todolist (ex: done, à faire) -->

