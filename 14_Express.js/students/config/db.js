const Sequelize = require('sequelize');

const sequelize = new Sequelize("students", "root", "losc0812", {
    host: "localhost",
    dialect: "mysql",
});

const Student = require('../models/students')(sequelize);
const User = require('../models/users')(sequelize);

sequelize
  .sync({ force: false })
  .then(() => console.log("La base de données à bien été synchronisée"))
  .catch((error) =>
    console.error("Erreur :", error.message)
  );

module.exports = {
    Student,
    User,
}