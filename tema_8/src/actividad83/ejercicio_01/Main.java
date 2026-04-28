package actividad83.ejercicio_01;

public class Main {
    public static void main(String[] args) {
        Operaciones suma = (double a, double b) -> {
            double result1 = a + b;
            return "La suma de " + a +  " y " + b + " es " + result1;
        };

        Operaciones division = (double a, double b) -> {
            double result2 = a / b;
            return "La división de " + a +  " y " + b + " es " + result2;
        };

        Operaciones promedio = (double a, double b) -> {
            double result3 = (a + b) / 2;
            return "El promedio de " + a +  " y " + b + " es " + result3;
        };

        Operaciones numeroMenor = (double a, double b) -> {
            return (a < b)? "El numero menor es " + a:
                    "El numero menor es " + b;
        };

        Operaciones dobleNumero = (double a, double b) -> {
            return (a % 2 != 0)? "El doble de " + b + " es " + b * 2:
                    a + " no es primo";
        };

        Operaciones triangulo = (double a, double b) -> {
            double result4 = (a * b) / 2;
            return "El área del triangulo de base " + a +  " y altura " + b + " es " + result4;
        };

        System.out.println(suma.calcular(2, 10));
        System.out.println(division.calcular(5, 2));
        System.out.println(promedio.calcular(5, 2));
        System.out.println(numeroMenor.calcular(5, 10));
        System.out.println(dobleNumero.calcular(2, 2));
        System.out.println(triangulo.calcular(5, 2));

    }
}
