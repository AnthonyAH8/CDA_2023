const fs = require('fs')
const path = require('path')

var filePath = process.argv[2]
var extensionFilter = process.argv[3]

function filter(pathFile, extension){
    fs.readdir(pathFile, (err, files) =>{
        if(err){
            console.log(err.message);
            return
        }
        let filteredList = files.filter(file => path.extname(file) === `.${extension}`)
        filteredList.forEach(f => console.log(f))
    });
}

filter(filePath, extensionFilter);