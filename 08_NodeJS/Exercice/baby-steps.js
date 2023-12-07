// let sum = [...process.argv].slice(2).map(arg => +arg).reduce((sum, value) => sum + value);

// console.log(sum)

let result = 0

for (let i = 2; i < process.argv.length; i++) {
  result += Number(process.argv[i])
}

console.log(result)