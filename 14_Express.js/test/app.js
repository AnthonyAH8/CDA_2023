const express = require('express');
const app = express();

const PORT = process.env.PORT || 3000;

app.listen(PORT, () =>{
    console.log(`Bienvenue sur mon serveur port ${PORT}`)
})

app.get('/', (req, res) =>{
    res.send('Bienvenue sur l\'application Express')
});

app.get('/toto', (req, res) =>{
    res.send('Bienvenue Toto')
})