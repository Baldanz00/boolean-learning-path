// Scrivi un programma che stampi numeri interi da 1 a 100, ma per i multipli di 3 stampi "Fizz"
// al posto del numero e per i multipli di 5 stampi "Buzz". Per i numeri che sono multipli sia
// di 3 che di 5 stampi "FizzBuzz"

//Stampo numeri da 1 a 100 (incremento)

for (let i = 1; i <= 100; i++) {
  // se è multiplo di 3 e di 5
    if (i % 3 === 0 && i % 5 === 0) {
    //Stampa FizzBuzz
        console.log("FizzBuzz");
        //altrimenti se è multiplo di 3
  } else if (i % 3 === 0) {
    //stampo Fizz
    console.log("Fizz");
  } else if (i % 5 === 0) {
    //altrimenti se è multiplo di 5 stampo Buzz
    console.log("Buzz");
  } else {
    console.log(i);
  }
}