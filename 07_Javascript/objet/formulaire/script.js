const monForm = document.getElementById("monForm")
const submitButton = document.getElementById("submitButton")

monForm.addEventListener('submit', (event) => {
    event.preventDefault()
    console.log("Le formulaire est envoyé")
})

const email = document.getElementById("email")
email.addEventListener('input', (event)=> {
    const emailElement = event.target

    if (!emailElement.value) {
        emailElement.style.backgroundColor = "chartreuse"
        submitButton.setAttribute('disabled', '')
    } else {
        emailElement.style.backgroundColor = "red"
        submitButton.removeAttribute('disabled');
    }
})