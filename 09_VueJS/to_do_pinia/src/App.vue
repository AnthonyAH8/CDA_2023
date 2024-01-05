<script setup>
import { computed, ref } from 'vue';
import CreateTodo from './components/CreateTodo.vue';
import ListTodo from './components/ListTodo.vue';

let todos = ref("")
let todoList = ref([])
let filteredTodos = ref('all')

let filtered = computed(() => {
  switch (filteredTodos.value) {
    case "all":
      return todoList.value;
    case "done":
      return todoList.value.filter(t => t.checked);
    case "todo":
      return todoList.value.filter(t => !t.checked);
  }
});

function createTodo(){
    if(!todos.value) return;
    let todo = {title: todos.value, checked: false };
    todoList.value.push(todo)
    todos.value = ''
}
</script>

<template>
  <header class="bg-secondary-subtle">
    <div class="d-flex justify-content-center align-items-center ">
      <img src="https://pinia.vuejs.org/logo.svg" alt="image_de_pinia">
      <span class="fs-1 fw-bolder text-secondary">To Do</span>
    </div>
    <div>
      <form>
        <label class="d-flex justify-content-center align-items-center mt-2">
          <input type="text" name="" id="" class="w-auto" placeholder="Je dois..." v-model="todos" @keyup.enter="createTodo">
          <button class="btn btn-warning">Valider</button>
        </label>
      </form>
    </div>
  </header>
  <main>
    <CreateTodo/>
    <ListTodo/>
  </main>
</template>

<style scoped>
  img{
    height: 100px;
    width: 100px;
  }

  button{
    margin-left: 20px;
    border-radius: 8px;
  }

  input{
    border: none;
    padding: 7px 17px;
    margin: 10px 0;
    border-radius: 8px;
  }

  input:focus{
    outline-color:#FFC107
  }

  main{
    background-color: azure;
  }

</style>
