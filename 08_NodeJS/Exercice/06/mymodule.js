const path = require('path')
const fs = require('fs')

module.exports = function sortFile(directory, extension, callback){

    let error = null;

    fs.readdir(directory, (err, files) =>{
        if(err){
            callback(err, []);
            return
        }
        let filteredList = files.filter((file) => path.extname(file) === `.${extension}`)
       callback(error, filteredList)
    });
}

