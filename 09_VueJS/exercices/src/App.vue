<!-- <script setup>
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
let filter = ref("all")

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
      <select v-model="filter">
        <option disabled value="">Etat de la tâche</option>
        <option>A faire</option>
        <option>Fait</option>
      </select>
    </div>

    <div>
      <button @click="addTodo">A faire</button>
      <button @click="doneTodo">Fait</button>
    </div>


  </form>
  <div>
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
<<<<<<< HEAD
4. Ajouter des boutons pour trier la todolist (ex: done, à faire) --> -->

<!-- <script setup>
import { ref, computed, onMounted } from 'vue';
import { v4 as uuidv4 } from 'uuid';

let todoInput = ref("");
let todos = ref([]);
let filterInput = ref("all");

let filteredTodos = computed(() => {
  switch (filterInput.value) {
    case "all":
      return todos.value;
    case "done":
      return todos.value.filter(t => t.checked);
    case "todo":
      return todos.value.filter(t => !t.checked)
  }
});

function createTodo() {
  if (!todoInput.value) return;
  let todo = { id: uuidv4(), title: todoInput.value, checked: false };
  todos.value.push(todo);
  todoInput.value = "";
}


</script>

<template>
  <h1>To do List</h1>
  <div class="container">
    <div>
      <input type="text" placeholder="saisir une tâche ..." v-model="todoInput" @keyup.enter="createTodo">
      <select name="" id="" v-model="filterInput">
        <option value="all">all</option>
        <option value="done">done</option>
        <option value="todo">todo</option>
      </select>
    </div>

    <div class="render">
      <ul>
        <li v-for="todo in filteredTodos" :key="todo.id">
          <span>{{ todo.title }}</span> <input type="checkbox" v-model="todo.checked">
        </li>
      </ul>
    </div>
  </div>
</template> 

<style scoped>
h1 {
  text-align: center;
}

.container {
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
}

input {
  border: 1px solid black;
  padding: 10px 25px;
  font-size: 1rem;
  border-radius: 10px 0 0 10px;
  color: lightseagreen;
  background-color: hsla(0, 0%, 0%, 0.7);
}

select {
  border: 1px solid black;
  border-radius: 0 10px 10px 0;
  padding: 10px 25px;
  font-size: 1rem;
  color: lightseagreen;
  background-color: hsla(0, 0%, 0%, 0.7);
}

input:focus, select:focus {
  outline: none;
}

::placeholder {
  color: lightseagreen;
}

option {
  background-color: lightslategray;
}

.render{
  display: flex;
  align-self: center;
  justify-content: center;
  border-radius: 20px;
}

li{
  list-style-type: none;
  color: lightseagreen;
  background-color: hsla(0, 0%, 0%, 0.7);
  text-align: center;

}

</style> -->

<script setup>

import { watchEffect, ref } from 'vue';

let id = ref(1)
let data = ref(null)

watchEffect(async () => {
  // console.log(id.value)
  const response = await fetch('https://pokeapi.co/api/v2/pokemon/' + id.value
  )
  data.value = await response.json()
},
)
</script>

<template>
  <div v-if="data" class="pokedex">
    <label>ID ou Nom du pokémon:</label>
    <input type="text" v-model="id" placeholder="ID du pokémon:">
    <img :src="data.sprites.front_default">
    <span>Nom: {{ data.name }}</span>
    <span>Taille: {{ data.height }} pouces </span>
    <span>Poids: {{ data.weight }} lbs </span>
  </div>
</template>

<style scoped>
.pokedex {

  position: relative;
  margin: 50px auto;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
  background-color: rgba(245, 20, 0, 0.6);
  color: teal;
  height: 600px;
  width: 600px;
  font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
  border-radius: 10px;

  & span {
    font-size: 1.5rem;
    margin: 20px 0;
  }

  & label{
    margin-bottom: 10px;
    font-size: 2rem;
  }

  & input{
    background-color: #fff;
    width: 20rem;
    box-sizing: border-box;
    border: none;
    border-radius: 5px;
  }
  & input[type=text]{
    color: teal;
    align-items: center;
  }
}

img {
  position: absolute;
  top: 0;
  left: 0;
  width: 150px;
  height: 150px;
  border-radius: 1px solid black;
  background-image: contain;
}

input:focus{
  outline: none;
  background-color: bisque;
  
}

::placeholder {
  color: lightseagreen;
}
</style>


