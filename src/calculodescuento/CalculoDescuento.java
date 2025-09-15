/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculodescuento;

/**
 * @author Franklin Parra
 */
public class CalculoDescuento {

    public static void main(String[] args) {
        
        // requisito:llamar al metodo con solo el monto, usa 10% por defecto
        double compra1 = 500.0;
        double descuento1 = calcularDescuento(compra1); // este usa el método sobrecargado (solo 1 parametro)
        double total1 = compra1 - descuento1;

        System.out.println("=== Compra 1 (10% descuento por defecto) ====");
        System.out.println("Precio original: $" + compra1);
        System.out.println("Descuento aplicado: $" + descuento1);
        System.out.println("Precio final a pagar: $" + total1);
        System.out.println();

        // Requisito:llamar al metodo con monto y porcentaje personalizado (15%)
        double compra2 = 800.0;
        double descuento2 = calcularDescuento(compra2, 15.0); // este usa el metodo con 2 parametros
        double total2 = compra2 - descuento2;

        System.out.println("==== Compra 2 (15% descuento personalizado) ====");
        System.out.println("Precio original: $" + compra2);
        System.out.println("Descuento aplicado: $" + descuento2);
        System.out.println("Precio final a pagar: $" + total2);
    }

    // requisito: metodo que recibe monto y porcentaje, y devuelve el valor del descuento.
    public static double calcularDescuento(double montoTotal, double porcentajeDescuento) {
        return montoTotal * (porcentajeDescuento / 100.0);
    }

    // requisito: metodo sobrecargado, solo recibe monto, aplica 10% automaticamente
    public static double calcularDescuento(double montoTotal) {
        return calcularDescuento(montoTotal, 10.0); // reutiliza el metodo de arriba
    }
}