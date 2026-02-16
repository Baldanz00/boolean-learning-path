
void main() {

    Auto a1 = new SportCar("Lamborghini aventador",340,3);
    a1.stampaVelocitàMassima();
    a1.stampaNumeroPorte();
    a1.getNome();

    UtilityCar u1 = new UtilityCar("Ford Fiesta",175,5);
    u1.accenditi();
    u1.stampaNumeroPorte();
    u1.stampaVelocitàMassima();
    u1.trainaAuto();
    u1.trainaAuto(a1);
    u1.spegniti();

}