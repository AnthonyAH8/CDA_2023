// let nb = Number(prompt("Veuillez saisir une durée"));

// let count;
// let count2;

// let decrease = document.getElementById('count')
// let decreasehms = document.getElementById('count')

// document.getElementById('start-count').addEventListener("click", ()=>{
//     count = setInterval(() =>{
//         if(nb <0){
//            decrease.style.color = "red"
//         }else{
//            decrease.textContent = nb--
//            decrease.style.color = "blue"
//         }

//     }, 1000)
// })

// document.getElementById("stop").addEventListener("click", () =>{
//     clearInterval(count)
//     count = undefined;
//     decrease.textContent = nb
// })

// function toHour(nb){
//     document.getElementById('start-count-hms').addEventListener("click", () =>{
//         count2 = setInterval(() => {
//             if(nb < 86400){
//                 let heure = Math.floor(nb/3600)
//                 let minutes = Math.floor((nb % 3600)/ 60);
//                 let secondes = Math.floor(nb % 60);
//                 document.getElementById("heure").textContent = `${heure}h `;
//                 document.getElementById("minutes").textContent = `${ minutes}m `;
//                 document.getElementById("secondes").textContent = `${ secondes}s`;
//                 return `${heure}h ${minutes}m ${secondes}s`
//             }
//         }, 1000)
//     })
// }

// console.log(toHour(nb));

// 10000s = 2h 46m 40s