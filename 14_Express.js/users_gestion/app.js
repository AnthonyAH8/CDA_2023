const mongoose = require('mongoose');
const express = require('express');

const app = express();
const port = 3000;
const db = mongoose.connection;
const User = require('./routes/userRoutes')

mongoose.connect('mongodb://localhost:27017/users_gestion', {
    useNewUrlParser: true,
    useUnifiedTopology: true,
});

db.on("error", console.error.bind(console, "Erreur de connexion à mongoDB"));
db.once("open", () => {
    console.log("Connecté à mongoDB");
});


// app.use(express.json()).use("/api/movies", movieRoutes);

app.get("*", (req, res) => {
    res.send("Erreur 404");
});

app.listen(port, () => {
    console.log(`http://localhost:${port}`);
});

app
  .use(express.json())
  .use('/userRoutes', User)
  