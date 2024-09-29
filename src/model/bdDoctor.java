package model;


import java.util.ArrayList;
import model.Doctor;

public class bdDoctor {
    private ArrayList<Doctor> data;

    public bdDoctor() {
        data = new ArrayList<>();

        data.add(new Doctor("Dr. Juan Pérez", "juan@hospitalario.com", "Cardiología", "555-0001", "juanperez", "123"));
        data.add(new Doctor("Dra. Ana Gómez", "anagomez@hospital.com", "Dermatología", "555-0002", "anagomez", "contraseña456"));
        data.add(new Doctor("Dr. Luis Fernández", "luisfernandez@hospital.com", "Pediatría", "555-0003", "luisfernandez", "contraseña789"));
        data.add(new Doctor("Dra. María Rodríguez", "mariarodriguez@hospital.com", "Ginecología", "555-0004", "mariarodriguez", "contraseña101"));
        data.add(new Doctor("Dr. Carlos Sánchez", "carlossanchez@hospital.com", "Neurología", "555-0005", "carlossanchez", "contraseña202"));
    }

    public Doctor login(String usuario, String contraseña) {
        for (Doctor doctor : data) {
            if (doctor.getUsuario().equals(usuario) && doctor.getContraseña().equals(contraseña)) {
                return doctor;
            }
        }
        return null;
    }
    public ArrayList<Doctor> getDoctores() {
        return data;
    }

}