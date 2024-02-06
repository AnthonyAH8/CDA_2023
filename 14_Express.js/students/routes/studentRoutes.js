const express = require('express');
const studentController = require('../controller/studentController');
const isAuthenticated  = require('../middlewares/authentication');
const router = express.Router();


router.get('/', studentController.getAllStudents)
router.get('/add-student', isAuthenticated, studentController.createStudent)
router.get('/update-student', isAuthenticated, studentController.updateStudent)
router.get('/delete-student', isAuthenticated, studentController.deleteStudent)

module.exports = router