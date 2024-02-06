const express = require('express');
const studentController = require('../controller/studentController');
const router = express.Router();

router.get('/', studentController.getAllStudents)
router.get('/add-student', studentController.createStudent)

module.exports = router