const monForm = document.getElementById("monForm")
const submitButton = document.getElementById("submitButton")

const inputContact = document.querySelector('input')
inputContact.addEventListener('input', (event) => {
    const userName = event.target
    const passWord = event.target
    
    if(!userName.value && !passWord.value){
        userName.style.backgroundColor = 'red'
        passWord.style.backgroundColor = 'red'
        userName.style.color = "white"
    }else {
        userName.style.backgroundColor = 'chartreuse';
        passWord.style.backgroundColor = 'blue'
    }
})

monForm.addEventListener('submit', (event) => {
    event.preventDefault()
    let username = document.getElementById("username").value
    let password = document.getElementById("password").value
    if(password && username){
        const userDetails = {
            username: username,
            password: password
          };
          console.log(userDetails);
      }
})