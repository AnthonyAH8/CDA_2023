const { Student } = require("../config/db")

exports.getAllStudents = async (req, res) => {
    try {
        const students = await Student.findAll()
        res.json(students)
    } catch (error) {
        res.status(500).json({ message: 'Mauvaise saisie'})
    }
};

exports.createStudent = async (req, res) => {
    try {
        const { lastname, role } = req.body;
        const newStudent = await Student.create({ lastname, role});
        res.status(201).json(newStudent)
    } catch (error) {
        res.status(500).json({ message: 'Mauvaise saisie'})
    }
}