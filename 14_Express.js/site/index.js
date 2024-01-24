const express = require('express');
const app = express();
app.use(express.static('public'));

const router = require('./routes/bookRoutes');
app.use('/', router);


const PORT = process.env.PORT || 3000;

app.listen(PORT, () =>{
    console.log(`Bienvenue sur mon serveur port ${PORT}`)
})

app.get('/', (req, res) =>{
    res.send('Bienvenue sur mon site web')
});

app.get('/bienvenue', (req, res) =>{
    res.send('<h1>Express 2000</h1>')
});

app.get('/info', (req, res) => {
    res.json({
        pseudo : 'Toto',
        age: '22'
    })
})

app.get('/acces_interdit', (req, res) =>{
    res.status(502).send('<h2>Bad Gateway</h2>')
});

app.get('/redirection-accueil', (req, res) => {
    res.redirect('/')
});

app.get('*', (req, res) => {
    res.send('Mauvaise direction')
});
