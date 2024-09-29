package backEnd;
import java.util.HashMap;
import model.Doctor;
import model.bdDoctor;

public class BackEnd {
    public HashMap<String, String> validarDatos(String usuario, String contraseña) {
        bdDoctor dataDoctor = new bdDoctor();
        HashMap<String, String> response = new HashMap<>();

        Doctor doctor = dataDoctor.login(usuario, contraseña);

        if (doctor != null) {

            response.put("Nombre", doctor.getNombre());
            response.put("Correo", doctor.getC0rreo());
            response.put("Especialidad", doctor.getEspecialidad());
        } else {

            response.put("Error", "Credenciales incorrectas");
            return response;
        }

        return response;
    }


}

