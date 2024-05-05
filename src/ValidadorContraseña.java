public class ValidadorContraseña {
    public static void validarContraseña(String contraseña, String confirmaciónContraseña) throws RequisitosContraseñaException, ContraseñasNoCoincidenException {
        if (contraseña.length() < 8) {
            throw new RequisitosContraseñaException("La contraseña debe tener al menos 8 caracteres.");
        }

        if (contraseña.contains(" ")) {
            throw new RequisitosContraseñaException("La contraseña no puede contener espacios en blanco.");
        }

        if (!contraseña.matches(".*[a-zA-Z].*") || !contraseña.matches(".*\\d.*") || !contraseña.matches(".*[!@#$%^&*()].*")) {
            throw new RequisitosContraseñaException("La contraseña debe contener al menos un carácter, una mayúscula, un número y un carácter especial.");
        }

        if (!contraseña.equals(confirmaciónContraseña)) {
            throw new ContraseñasNoCoincidenException("Las contraseñas no coinciden.");
        }

        System.out.println("La contraseña es válida.");
    }
}
