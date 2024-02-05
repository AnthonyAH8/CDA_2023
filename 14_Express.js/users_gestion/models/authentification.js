const express = require('express');
const router = express.Router();
const bcrypt = require('bcrypt');
const fs = require("fs/promises");
const path = require("path");
const jwt = require('jsonwebtoken');
const isAuthenticated = require('../middlewares/authentification');

const dataUser = path.join(__dirname, '../data/user.json');

async function fileContent() {
    try {
        const data = await fs.readFile(dataUser, "utf8");
        return JSON.parse(data);
    } catch (error) {
        throw error;
    }
}

router.post('/signup', async (req, res) => {
    const { username, email, password } = req.body;
    const users = await fileContent();
    bcrypt.hash(password, 12, (error, hash) => {
        if (error) throw error;
        const newUser = {
            username: username,
            email: email,
            password: hash
        };
        users.push(newUser);
        fs.writeFile(dataUser, JSON.stringify(users), (error, result) => {
            if (result) {
                res.send('Bienvenue !')
            } else {
                console.log('Erreur durant votre inscription');
                return
            }
        });
    });
});

router.post('/connexion', isAuthenticated, async (req, res) => {
    const { username, email, password } = req.body;
    const users = await fileContent();
    const user = users.find((user) => user.email == email);

    if(user){
        bcrypt.compare(username, password, user.password, (error, result) => {
            if(result) {
                result.status(200).json({
                    token: jwt.sign({ user: user.id }, "RANDOM_TOKEN_SECRET", {
                        expiresIn: '1d',
                    }),
                })
            } else {
                result.status(401).send('Informations incorrectes');
            }
        });
    } else {
        result.status(401).send('Informations incorrectes');
    }
})

module.exports = router