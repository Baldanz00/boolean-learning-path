//
//Crea un array di oggetti che rappresentano delle persone.
//Ogni persona ha un nome, un cognome e un'età.
//Partendo da questo, crea quindi un nuovo array inserendo, per ogni persona, una frase
//(stringa) con il nome e cognome e l'indicazione se può
//guidare, in base all'età.


// Array iniziale di persone
const persone = [
  { nome: "Mario", cognome: "Rossi", eta: 25 },
  { nome: "Luca", cognome: "Bianchi", eta: 16 },
  { nome: "Anna", cognome: "Verdi", eta: 30 },
  { nome: "Giulia", cognome: "Neri", eta: 17 },
  { nome: "Francesco", cognome: "Galli", eta: 18 }
];

// Nuovo array con le frasi personalizzate
const frasiGuida = [];

for (const persona of persone) {
  const { nome, cognome, eta } = persona;
  const puòGuidare = eta >= 18 ? "può guidare" : "non può guidare";
  const frase = `${nome} ${cognome} ${puòGuidare}.`;
  frasiGuida.push(frase);
}

// Stampa del nuovo array
console.log(frasiGuida);