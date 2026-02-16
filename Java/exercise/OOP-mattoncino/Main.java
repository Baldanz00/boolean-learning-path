void main() {

    Block b1 = new Block(new int[]{5,6,3});
    System.out.println("L'altezza del mattoncino è: " + b1.getWidth());
    System.out.println("La lunghezza del mattoncino è: " + b1.getLenght());
    System.out.println("La larghezza del mattoncino è: " + b1.getHeight());

    System.out.println("Il volume del mattoncino è: " + b1.getVolume());
    System.out.println("L'area del mattoncino è: " + b1.getSurfaceArea());
}