import Chat from "./cat.js"

const modal = document.getElementById("modal")
const validation = document.getElementById("modal-validation")
const modalForm = document.getElementById("modal-form")

validation?.addEventListener("click", () =>{
    modal.style.display = "none"
})

modal.addEventListener("click", (event) =>{
    if (event.target === event.currentTarget) {
        modal.style.display ='none'
    }
})

modalForm?.addEventListener("click", () =>{
    modal.style.display = "flex"
})

let cat =[
    {
        name : "titi",
        age : 5,
        race: 'persian',
        color: 'grey'
    },
    {
        name : "balthazar",
        age : 2,
        race: 'stray',
        color: 'ginger'
    }
];

console.log(cat)

const monForm = document.getElementById("monForm")
monForm.addEventListener("submit", (e) =>{
    e.preventDefault();
    const newCat = new Chat(
        document.getElementById("name").value,
        document.getElementById("age").value,
        document.getElementById("race").value,
        document.getElementById("color").value
        )
    cat.push(newCat)


const TRCat = document.createElement("tr");
const TDname = document.createElement("td");
const TDage = document.createElement("td");
const TDrace = document.createElement("td");
const TDcolor = document.createElement("td");
const deleteTR = document.createElement("td");
const deleteCat = document.createElement("button");
const editCat = document.createElement("button")
    
    TDname.textContent = newCat.name
    TDage.textContent = newCat.age
    TDrace.textContent = newCat.color
    TDcolor.textContent = newCat.race
    deleteCat.textContent = "Enlever"
    deleteCat.addEventListener("click", () =>{
        TRCat.remove()
        cat = cat.filter((chat) => chat !== newCat)
        console.log(cat)
    })
    deleteTR.appendChild(deleteCat)
    TRCat.appendChild(TDname)
    TRCat.appendChild(TDage)
    TRCat.appendChild(TDrace)
    TRCat.appendChild(TDcolor)
    TRCat.appendChild(deleteTR)
    
    document.getElementById("my-tbody")?.appendChild(TRCat)
    
    console.log(cat);

})


function tri(a, b){
    if (a.TDname < b.TDname) {
        return -1
    } if (a.TDname < b.TDname) {
        return 1
    }
}
var alphabet = cat.sort(tri)
console.log(alphabet)