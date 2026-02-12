//Crea un array composto da 10 automobili.
//Ogni oggetto automobile avrà le seguenti proprietà: marca, modello e alimentazione
//(benzina, diesel, gpl, elettrico, metano).
//Dividi le automobili in 3 array separati: nel primo array solo le auto a benzina,
// nel secondo solo le auto a diesel, nel terzo il resto delle auto.
//Infine stampa separatamente i 3 array.

// Array iniziale delle 10 automobili
const automobili = [
  { marca: "Fiat", modello: "Tipo", alimentazione: "benzina" },
  { marca: "Volkswagen", modello: "Golf", alimentazione: "diesel" },
  { marca: "Tesla", modello: "Model 3", alimentazione: "elettrico" },
  { marca: "Renault", modello: "Clio", alimentazione: "gpl" },
  { marca: "Toyota", modello: "Yaris", alimentazione: "benzina" },
  { marca: "BMW", modello: "X3", alimentazione: "diesel" },
  { marca: "Audi", modello: "A3", alimentazione: "metano" },
  { marca: "Ford", modello: "Fiesta", alimentazione: "benzina" },
  { marca: "Peugeot", modello: "3008", alimentazione: "gpl" },
  { marca: "Nissan", modello: "Leaf", alimentazione: "elettrico" }
];

// Array vuoti per la divisione in base all'alimentazione
const autoBenzina = [];
const autoDiesel = [];
const altreAuto = [];

// Ciclo for per dividere le auto
for (let i = 0; i < automobili.length; i++) {
  const auto = automobili[i];

  if (auto.alimentazione === "benzina") {
    autoBenzina.push(auto);
  } else if (auto.alimentazione === "diesel") {
    autoDiesel.push(auto);
  } else {
    altreAuto.push(auto);
  }
}

// Stampa dei risultati
console.log("Auto a benzina:");
console.log(autoBenzina);

console.log("\nAuto a diesel:");
console.log(autoDiesel);

console.log("\nAltre auto (gpl, elettrico, metano):");
console.log(altreAuto);