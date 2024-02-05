const jwt = require('jsonwebtoken');

function isAuthenticated(req, result, next){
    try {
        const token = req.headers.authorization.split(' ')[1];
        const verifyToken = jwt.verify(token, "RANDOM_TOKEN_SECRET");
        return next();
    }catch (error){
        res.status(401).json({ message: "Connexion requise" });
    }
}

module.exports = isAuthenticated;