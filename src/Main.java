import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la contraseña: ");
        String contraseña = scanner.nextLine();
        System.out.print("Confirme la contraseña: ");
        String confirmaciónContraseña = scanner.nextLine();

        try {
            ValidadorContraseña.validarContraseña(contraseña, confirmaciónContraseña);
        } catch (RequisitosContraseñaException | ContraseñasNoCoincidenException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
