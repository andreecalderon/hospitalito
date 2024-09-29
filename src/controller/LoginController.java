package controller;


import view.Login;
import backEnd.BackEnd;
import view.DoctorView;

import java.util.HashMap;

public class LoginController {
    private Login login;
    private BackEnd backEnd;

    public LoginController(Login login) {
        this.login = login;
        this.backEnd = new BackEnd();
        this.login.addLoginListener(e -> iniciarSesion());
    }

    public void iniciarSesion() {
        String cOrreo = login.getCOrreo();
        String contraseña = login.getContra();

        BackEnd consultaLogin = new BackEnd();
        HashMap<String, String> response = consultaLogin.validarDatos(cOrreo, contraseña);

            String nombreDoctor = response.get("Nombre");
            String Especialidad = response.get("Especialidad");

            HashMap<String, String> doctorData = new HashMap<>();
            doctorData.put("Nombre", nombreDoctor);
            doctorData.put("Especialidad", Especialidad);

            new DoctorView(response);
        }
    }

