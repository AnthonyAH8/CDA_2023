<script setup>
import { computed, ref, reactive } from 'vue';
  // let message = "Hello world";
  // let messageRAW = "<p>Hello world</p>";
  // let red = "color-red";
  // let isDisabled = true;
  // // let attributes = {class: 'bold', href: monLien}

  // let count = ref(0)
  // count.value = 0
  // function add(){
  //   count.value+=2
  // }

  // let personne1 = reactive({id: 2, firstName:"jean", lastName:"dupont"})

  // let message2 = ref("Hello world")

  // function reverse(){
  //   message2.value = message2.value.split('').reverse().join('')
  // }

  // function add(){
  //   message2.value += "!"
  // }

  // function alertMessage(){
  //   alert(message2.value)
  // }

  // let numbers = ref([1, 4, 12, 16, 2])

  // let nombrePairs = computed(() => {
  //   return numbers.value.filter(n => n % 2 === 0).length;
  // })

  // function addToNumbers(){
  //   numbers.value.push(Math.floor(Math.random() * 100))
  // }

  // let personne = reactive({ firstName: 'Toto', lastName: 'Titi', birthDate: new Date(1990, 1, 1)})

  // let age = computed(() => {
  //   let calcul = Date.now() - personne.birthDate.getTime()
  //   return Math.floor(calcul / (1000 * 60 * 60 * 24 * 365.25));
  // })

  // let age = ref(0)
  // let ok = ref(true)


  // let isRed = ref(false)
  // let color = ref("red")

  // function changeColor(){
  //   color.value = color.value === 'red' ? "blue" : "red"
  // }
  
</script>

<template>
 <!-- <h1 v-html="messageRAW"></h1> A éviter -->
  <!-- <p>{{ message }}</p>
  <p v-bind:class='red'>Lorem ipsum dolor sit amet consectetur adipisicing elit. Aliquid voluptatibus et, magnam blanditiis cum assumenda esse dicta modi nostrum. Corporis vel, doloribus eligendi mollitia consectetur quasi consequatur soluta eaque atque!</p>
  <p :class='red'>Lorem ipsum dolor sit amet consectetur adipisicing elit. Aliquid voluptatibus et, magnam blanditiis cum assumenda esse dicta modi nostrum. Corporis vel, doloribus eligendi mollitia consectetur quasi consequatur soluta eaque atque!</p>
  
  <form action="#">
    <input type="text" name="" id="" placeholder="Votre texte" :disabled="isDisabled">
  </form>

  <hr> -->

  <!-- <a v-bind="attributes">Mon lien gras</a> -->

  <!-- <p>la taille de mon message est de {{ message.length }} lettres</p>

  <p :class="message.length > 5 ? 'bold': null">Toto</p>

  <div>
    <p>Compteur: <span class="count">{{ count }}</span></p>
    <button v-on:click="add">Ajouter 1</button>
  </div>
  
  <div>
    <h2>{{ personne1.firstName }}</h2>
    <h2>{{ personne1.lastName }}</h2>
  </div> -->

  <!-- <div>
    <h2>{{ message2 }}</h2>
    <button @click="reverse">Inverser</button>
    <button @click="add">!</button>
    <a v-on:click.prevent="alertMessage">Alert</a>
  </div> -->

  <!-- <h2>Voici la liste des nombres</h2>
  <p>{{ numbers.toString() }}</p>
  <h3>Il y a {{ nombrePairs }} nombres pairs dans ce tableau</h3>
  <button v-on:click="addToNumbers">Ajouter nombre</button> -->

<!-- <h2>Date de naissance:</h2>
<p><span> {{ personne.firstName }}</span><span> Né(e) en {{ personne.birthDate }}</span></p>
<p> Âge :{{ age }} ans</p> -->

<!-- <h1>Welcome</h1>
<form action="#" @submit.prevent>
  <input :input="age" @change="e => age = e.target.value" type="text">
  <button type="submit">Envoyer</button>
</form>

<div v-if="age >= 18">
  <p>Majeur</p>
</div>
<div v-else>
  <p>Mineur</p>
</div>
<div v-show="ok">
  <p>Hello world</p>
</div>
<div>
  <button @click="ok = !ok">Afficher</button>
</div> -->

<!-- <p :class="{red: isRed}" @click="isRed = !isRed">Noir au rouge</p>

<p :style="{color : color}" @click="changeColor">Rouge au bleu</p> -->

</template>

<style scoped>
  /* h1{
    color: chartreuse;
  }
  .color-red{
    color: red;
  }

  .bold{
    font-weight: bold;
  }

  .count{
    color: lightseagreen;
    font-size: 5em;
  }

  button{
    margin-right: 20px;
  } */

  .red{
    color: red;
  }
</style>
