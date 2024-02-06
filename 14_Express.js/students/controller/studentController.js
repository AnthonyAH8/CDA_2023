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

exports.updateStudent = async (req, res) => {
    try {
        const updatedStudent = await Student.update({where: {lastname: req.params.id}});
        res.status(201).json(updatedStudent)
    } catch (error) {
        res.status(500).json({ message: 'Mauvaise saisie'})
    }
}

exports.deleteStudent = async (req, res) => {
    try {
        const deletedStudent = await Student.destroy({where: {lastname: req.params.id}});
        res.status(201).json(deletedStudent)
    } catch (error) {
        res.status(500).json({ message: 'Mauvaise saisie'})
    }
}