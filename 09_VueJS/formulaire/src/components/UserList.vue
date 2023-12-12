<script setup>
import { ref, defineProps } from 'vue';


const users = ref([])
const newUser = ref("")
const newUserMail = ref("")

const props = defineProps({
  user: {
    type: String,
    required: true,
  },
  index: {
    type: Number,
    required: true
  }
})

</script>

<template>
 
</template>


<style scoped></style>