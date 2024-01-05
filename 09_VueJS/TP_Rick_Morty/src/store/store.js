import { defineStore } from 'pinia';
import { ref } from 'vue';

export const useCharacters = defineStore('store', () => {
  const id = ref('');
  // let data = ref(null)
  const error = ref(null)
  const characters = ref()
  const page = ref(1)

  // const filter = ref('all') Filtre //

  const getCaracters = async () => {
    try {
      const result = await fetch(`https://rickandmortyapi.com/api/character/?page=${page.value}`)
      characters.value = await result.json();
    } catch (err) {
      error.value = err.message
    }
  }

  const changePage = (pageNumber) => {
    page.value = pageNumber;
    getCaracters();
  }

  const currentPage = ref(1);
  const itemsPage = ref(20)
  const displayedItems = () => {
    const start = (currentPage.value - 1) * itemsPage.value;
    const end = start + itemsPage.value;
    return characters.value.slice(start, end);
  };

  return { id, error, characters, getCaracters, currentPage, itemsPage, displayedItems, changePage }
})
