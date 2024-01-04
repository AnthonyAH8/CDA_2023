//Démarrer un serveur web en nodejs
// const http = require("http");
const readline = require("readline");

const { stdin: input, stdout: output } = require("process");
const rl = readline.createInterface({ input, output });

// const config = {
//   host: "127.0.0.1",
//   port: 8080,
// };

// const server = http.createServer((req, res) => {
//   console.log(req.method);
//   const { headers } = req;
//   console.log(headers);
//   res.end("hello world!");
// });

// Objet avec les méthodes pour l'intéraction avec une base de données redis
const redis = require("redis");
const host = "127.0.0.1";
const port = "6379";
const client = redis.createClient(port, host);

client.on("connect", () => { }).connect();

// demoRedis(client);

// server.listen(config, () => {
//   console.log(`listening on: http://${config.host}:${config.port}`);
// });

//Fonction pour ajouter dans redis
// async function addToRedis(client, key, value) {
//   try {
//     await client.set(key, value);
//   } catch (err) {
//     console.error(err);
//   }
// }

//Fonction pour récupérer
// async function getFromRedis(client, key) {
//   try {
//     const result = await client.get(key);
//     return result;
//   } catch (err) {
//     console.error(err);
//   }
// }

//Fonction pour supprimer
// async function deleteFromRedis(client, key) {
//   try {
//     await client.del(key);
//   } catch (err) {
//     console.error(err);
//   }
// }

// async function demoRedis(client) {
// //   Inserer des données dans redis string
//   await client.set("key1", "value1");

// //   Récupérer une valeur
//   const valueKey1 = await client.get("key1");
//   console.log(valueKey1);
// }

// rl.question("Veuillez saisir une nouvelle tâche : ", (todo) =>{
//     console.log(todo);
// })


//Mettre l'index à 0
// setTaskIndex(0);

//Démarre
menu();

//Fonctions
//Question en async
function questionAsync(question) {
    return new Promise((resolve, reject) => {
        rl.question(question, (response) => {
            resolve(response);
        });
    });
}

// Menu
// async function menu() {
//     console.log("==== Gestion de tâches ====");
//     let choix = "";
//     do {
//         console.log(
//             "1 -- Ajouter une tâche \n2 -- Afficher les tâches\n3 -- Supprimer une tâche\n"
//         );
//         choix = await questionAsync("Votre choix : ");
//         switch (choix) {
//             case "1":
//                 await addTask();
//                 break;
//             case "2":
//                 await showTask();
//                 break;
//             case "3":
//                 await deleteTask();
//                 break;
//         }
//     } while (choix != "0");
// }

// //Récupérer index
async function getTaskIndex() {
    const count = await client.get("taskIndex");
    return parseInt(count);
}

// //Set Index
// async function setTaskIndex(index) {
//     await client.set("taskIndex", index);
// }

// //Ajouter une tâche
// async function addTask() {
//     const task = await questionAsync("Merci de saisir la tâche : ");
//     const oldIndex = await getTaskIndex();
//     const result = await client.set(`task${oldIndex + 1}`, task);
//     await setTaskIndex(oldIndex + 1);
//     console.log("Task ajoutée " + result);
// }


// //Affichage des tasks
// async function showTask() {
//     const lastIndex = await getTaskIndex();
//     for (let i = 1; i <= lastIndex; i++) {
//       const task = await client.get(`task${i}`);
//       if (task != null) {
//           console.log(task);
//       }
//     }
//   }

//   //Suppression d'une task
//   async function deleteTask() {
//     const taskIndex = await questionAsync("Merci de saisir la clé de la task : ");
//     const result = await client.del(taskIndex);
//     if (result == 1) {
//       console.log("Suppression Ok");
//     }
//   }

async function menu() {
    console.log("Bienvenue dans le système de gestion de stock");
    let choix = ""
    do {
        console.log(`
        1.Ajouter un produit
        2.Mettre à jour un produit
        3.Afficher les stocks
        4.Supprimer un produit
        5.Quitter
        `)
        choix = await questionAsync("Choisissez une option :");

        switch (choix) {
            case "1":
                await addProduct()
                break;

            case "3":
                await productList()
                break;
        }
    } while (choix != "0")
}

async function addProduct() {
    productName = "",
        quantity = "",
        price = ""
    const object = {
        productName: await questionAsync(`Nom du produit ${productName}`),
        quantity: await questionAsync(`Quantité : ${quantity}`),
        price: await questionAsync(`Prix : ${price}`)
    };
    await client.hSet("cle_object", object)
    // const readObj = await client.hGetAll("cle_object");
    // console.log(readObj);
}

async function productList() {
    const lastIndex = await getTaskIndex()
    for (let i = 1; i <= lastIndex; i++) {
        const product = await client.get(`product${i}`);
        if (product != null) {
            console.log(product);
        }
    }
}