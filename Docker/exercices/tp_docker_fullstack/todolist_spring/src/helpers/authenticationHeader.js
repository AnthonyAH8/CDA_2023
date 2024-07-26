import Cookies from 'js-cookie';

function authenticationHeader() {
  const user = JSON.parse(localStorage.getItem("user"))
const token = Cookies.get("XSRF-TOKEN")
const headers = {}
if(user && user.data.token){
            headers["Authorization"] = "Bearer " + user.data.token
        }
    
        if(token){
            headers["XSRF-TOKEN"] = token
        }
    
        return headers
}

export default authenticationHeader

