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

const cats = [
    { name: "Garfield", age: 2, race: "Persian", color: "white" },
    { name: "Toto", age: 4, race: "Siamois", color: "brown" },
    { name: "Titi", age: 1, race: "Stray", color: "ginger" }
];

cats.forEach((cat) => {
   
    const TRCat = document.createElement("tr");
    const TDname = document.createElement("td");
    const TDage = document.createElement("td");
    const TDrace = document.createElement("td");
    const TDcolor = document.createElement("td");
    const deleteTR = document.createElement("td");
    const deleteCat = document.createElement("button");
    
    TDname.textContent = cat.name
    TDage.textContent = cat.age
    TDrace.textContent = cat.color
    TDcolor.textContent = cat.race
    deleteCat.textContent = "Enlever"
    deleteCat.addEventListener("click", () =>{
        TRCat.remove()
    })
    deleteTR.appendChild(deleteCat)
    TRCat.appendChild(TDname);
    TRCat.appendChild(TDage)
    TRCat.appendChild(TDrace)
    TRCat.appendChild(TDcolor)
    TRCat.appendChild(deleteTR)
    
    document.getElementById("my-tbody")?.appendChild(TRCat)
    
    const monForm = document.getElementById("monForm")
    monForm.addEventListener("submit", (e) =>{
        e.preventDefault();
        const newCat = [
            document.getElementById("name").value,
            document.getElementById("age").value,
            document.getElementById("race").value,
            document.getElementById("color").value
        ]
        cats.push(newCat)
    })

    console.log(cats);
})



