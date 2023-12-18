<script setup>
import { useCharacters } from '../src/store/store';


const CharactersStore = useCharacters()
const { getCaracters } = CharactersStore
getCaracters()
//console.log("liste " + CharactersStore.characters);

</script>

<template>
  <header class="bg-primary">
    <h1>Rick & Morty M2i</h1>
  </header>
  <body class= "d-flex justify-content-center">
    <main>
      <div v-for="character in CharactersStore.characters.results" :key="character.id" class="character">
        <div class="card">
          <img :src="character.image" alt="">
          <p>{{ character.name }}</p>
          <p><span>Species : </span>{{ character.species }}</p>
        </div>
      </div>
    </main>
  </body>
    <footer>
      <div>
        <img src="./assets/logo.jpg" alt="utopios">
      </div>
      <div>
        <img src="./assets/git.png" alt="github">
        <img src="./assets/linkedin.png" alt="linkedin">
      </div>
    </footer>
</template>

<style scoped>


footer {
  display: flex;
  justify-content: space-around;
  align-items: center;
  margin-top: 10px;

  img {
    height: 40px;
    width: 40px;
  }
}

header {
  height: 5vh;
  display: flex;
  justify-content: center;
  align-items: center;
  margin-bottom: 10px;

  h1{
    color: #fff;
    font-size: 1.2rem;
  }
}

main{
  display: flex;
  justify-content: space-around;
  flex-direction: row;
  align-items: center;
  flex-wrap: wrap;
  max-width: 66%;
  
}
.card{
  border: 1px solid black;
  border-radius: 10px;
  background-image: cover;
  padding: 10px;
  margin: 5px;
}

.character{
  display: flex;
  flex-direction: row;
  max-width: 800px;
  img{
    width: 200px;
    height: 200px;
    border-radius: 10px;
  }

  span{
    color: lightgreen;
  }
}
</style>
