public class Matematico {

    public int suma(int numero1, int numero2){
        return numero1 + numero2;
    }

    public Matematico(){
        System.out.println("matematico dice: 5 + 3 es "+ suma(5, 3));
    }

    public int factorial(int numero){
        if(numero < 0) return -1;
        int factorial = 1;

        for (int i = 2; i <= numero; i++){
            factorial *= i;
        }
        return factorial;
    }

    public int sumaImpares(int numero){
        if(numero < 0) return -1;
        int suma = 0;
        for (int i = 1; i < numero; i++){
            if (i % 2 != 0){
                suma += i;
            }
        }
        return suma;
    }

    public int cuentaVocales(String palabra){
        int suma = 0;
        for (int i = 1; i != palabra.length(); i++){
            if (identificaVocal(palabra.charAt(i))){
                suma++;
            }
        }
        return suma;
    }

    public boolean identificaVocal(char letra){
        letra = Character.toLowerCase(letra);
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}
