//A partire da un array di stringhe, crea un secondo array
//formattando le stringhe del primo array in minuscolo e con
//l'iniziale maiuscola. es ["pippo", "Pluto","Paperino"]
//==> ["Pippo", "Pluto", "Paperino"]

//Array iniziale
const nomi = ["pippo", "PLUTO" , "Paperino"];
//nuovo arìrray
const nomiFormattati =[];
for (let i=0; i<nomi.length; i++) {
    const nome=nomi[i].toLowerCase(); //tutto in minuscolo
    const nomeFormattato = nome.charAt(0).toUpperCase() + nome.slice(1) //iniziale maiuscola
    nomiFormattati.push(nomeFormattato);
}
console.log(nomiFormattati); //stampa dei nomi formattati
