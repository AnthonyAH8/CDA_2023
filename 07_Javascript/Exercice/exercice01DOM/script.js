const monBouton = document.querySelector('button#buttonAdd')
const AddPrenom = document.querySelector('input#myInput')

monBouton.addEventListener("click", (event) =>{
    const createUL = document.querySelector("ul#MyUL");
    if(createUL){
        const createLI = document.createElement("li");
        createLI.textContent = event.target.value
        createUL.appendChild(createLI);
    }
})
