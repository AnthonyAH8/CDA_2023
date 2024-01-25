const express = require('express');
const app = express();
app.use(express.static('public'));
const path = require('path');
const connection = require('./config/db');
const mongoose = require('mongoose');
mongoose.connect('mongodb://localhost:27017/express_2000');
const db = mongoose.connection;

db.on('error', console.error.bind(console, 'Erreur de connexion à MongoDB :'));
db.once('open', () => {
  console.log('Connecté à MongoDB');
});

const router = require('./routes/bookRoutes');
app.use('/', router);

app.set('view engine', 'pug')
app.set('views', path.join(__dirname, 'views'));


const PORT = process.env.PORT || 3000;

app.listen(PORT, () =>{
    console.log(`Bienvenue sur mon serveur port ${PORT}`)
});

app.get('/', (req, res) =>{
    res.send('Bienvenue sur mon site web')
});

app.get('/bienvenue', (req, res) =>{
    res.render('index', {title: 'Page d\'accueil', message: 'Bienvenue'})
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

