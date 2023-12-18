import { defineStore } from "pinia";
import { ref } from "vue";

let id = ref("");
// let data = ref(null)
let error = ref(null)
let characters = ref()

export const useCharacters = defineStore('store', () => {
    // const filter = ref('all') Filtre //
    
    async function getCaracters () {
        try {
            const result = await fetch(`https://rickandmortyapi.com/api/character/?page=1`)
            characters.value = await result.json();
         //   console.log(characters.value)
        } catch (error) {
            error.value = error.message
        }
    }
    return { id, error, characters, getCaracters}
})
