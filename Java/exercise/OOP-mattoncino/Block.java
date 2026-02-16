public class Block {
    /*Scrivi una classe che crea un blocco (Duh..)

    Requisiti

    Il costruttore dovrebbe prendere un array come argomento,
    questo conterrà 3 numeri interi della forma [larghezza, lunghezza, altezza]
    da cui dovrebbe essere creato il blocco.
    public Block(int[] formaMattoncino){
se l'array è nullo o inferiore dei miei 3 campi ---> eccezione
inizializiamo:
this.widht = formaMattoncino[0]; - larghezza
this.lenght = formaMattoncino[1]; - lunghezza
this.height = formaMattoncino[2] - altezza
    }

    Definisci questi metodi:
        - `getWidth()` return the width of the `Block`
        - `getLength()` return the length of the `Block`
        - `getHeight()` return the height of the `Block`
        - `getVolume()` return the volume of the `Block`
        public int getVolume() {
    return width * length * height;
}
        - `getSurfaceArea()` return the surface area of the `Block`
        public int getSurfaceArea() {
    return 2 * (width * length + width * height + length * height);
}

    Esempi
    Block b = new Block(new int[]{2,4,6}) -> creates a `Block` object with a width of `2` a length of `4` and a height of `6`
    b.getWidth() // -> 2
    b.getLength() // -> 4
    b.getHeight() // -> 6
    b.getVolume() // -> 48
    b.getSurfaceArea() // -> 88*/

    private int width; //altezza
    private int length; //lunghezza
    private int height; //larghezza

    public Block(int[] formaMAttoncino) {
        if(formaMAttoncino == null || formaMAttoncino.length != 3){
            throw new IllegalArgumentException("Il mattoncino deve avere 3 misure per essere valido: widht,lenght e height");
        }
        this.width = formaMAttoncino[0];
        this.length = formaMAttoncino[1];
        this.height = formaMAttoncino[2];
    }

    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }

    public int getLenght() { return length; }
    public void setLenght(int lenght) { this.length = lenght; }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    public int getVolume(){ return width * length * height; }

    public int getSurfaceArea() { return 2 * (width * length + width * height + length * height); }

}