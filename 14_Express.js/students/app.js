const express = require('express');
const DB = require('./config/db');
const students = require('./routes/studentRoutes');
const app = express();
const port = 3000;

app.use(express.json()).use('/api', students)

app.listen(port, () => {
    console.log(`http://localhost:${port}`);
  });