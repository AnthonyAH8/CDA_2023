const jwt = require("jsonwebtoken");

function isAuthenticated(req, res, next) {
  try {
    const token = req.headers.authorization.split(" ")[1];
    const decodedToken = jwt.verify(token, "RANDOM_TOKEN_SECRET");
    const userId = decodedToken.userId;
    req.auth = {
      userId: userId,
    };
    return next();
  } catch (error) {
    res.status(401).json({ message: "Merci de vous connecter !" });
  }
}

const generateToken = (userId) => {
  const payload = {
    userId: id,
    username: username,
    password: password,
  }

  const token = jwt.sign(payload, 'RANDOM_TOKEN_SECRET', {expiresIn: "1d"})

  return token
}

module.exports = {
    isAuthenticated,
    generateToken
}
