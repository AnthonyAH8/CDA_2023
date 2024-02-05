const express = require('express');
const router = express.Router();
const isAuthenticated = require('../middlewares/authentification')

module.exports = router