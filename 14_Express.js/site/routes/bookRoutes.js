const express = require('express');
const fs = require('fs');
const router = express.Router();
const path = require('path')

const livres = path.join(__dirname, '../data/livres.json');

router.get('/', (req, res) => {
    fs.readFile(livres, 'utf8', (error, data) => {
        if (error) {
            console.log('Erreur lors de la lecture du fichier', error);
            res.status(500).send("Erreur interne au serveur")
            return;
        }
        const listeLivres = JSON.parse(data);
        res.json(listeLivres)
    })
})

router.get('/livres/:id', (req, res) => {
    const livresId = parseInt(req.params.id);
    const livre = livres.find(livres => livres.id === livresId)
    if (livre) {
        res.send(`
        Descriptif du livre ${livresId}:
        id : ${livre.id}
        titre: ${livre.titre}
        auteur: ${livre.auteur}
        `);
    } else {
        res.status(404).send(`Le livre avec l'ID ${livresId} n'existe pas.`);
    }
});


module.exports = router;
