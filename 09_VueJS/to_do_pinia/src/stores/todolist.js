import { ref } from 'vue'
import { defineStore } from 'pinia'

export const useTodos = defineStore('todos', () => {
  const todolist = ref([])

  function addTodo(todo) {
    todolist.value.push(todo)
  }

  function removeTodo(todo){
    todolist.value = todolist.value.filter(t => t !== todo)
  }

  return { useTodos, todolist, addTodo, removeTodo }
})
