import java.util.Scanner;

public class CalculadoraPresupuestos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistema de Presupuestos - Facundo Franco ---");
        
        System.out.print("Ingrese el costo de los materiales: ");
        double materiales = sc.nextDouble();
        
        System.out.print("Ingrese las horas estimadas de trabajo: ");
        int horas = sc.nextInt();
        
        double costoHora = 5000.0; // Valor de referencia
        double manoDeObra = horas * costoHora;
        double total = materiales + manoDeObra;
        
        System.out.println("\n--- Resumen del Presupuesto ---");
        System.out.println("Costo Materiales: $" + materiales);
        System.out.println("Mano de Obra (" + horas + " hs): $" + manoDeObra);
        System.out.println("TOTAL ESTIMADO: $" + total);
    }
}
