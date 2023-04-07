package controlador;

import modelo.ModeloEspecialidad;
import vista.VistaEspecialidadGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorEspecialidadGUI implements ActionListener {
    private final ModeloEspecialidad modelo;
    private final VistaEspecialidadGUI vista;

    public ControladorEspecialidadGUI(ModeloEspecialidad modelo, VistaEspecialidadGUI vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnNuevo.addActionListener(this);
        this.vista.btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(this.vista.btnNuevo == evento.getSource()) {
            clear();
        }
        else if(vista.btnGuardar == evento.getSource()) {
            System.out.println("Clave:"+
                    Integer.parseInt(vista.jtxClave.getText())+
                    " Nombre:"+
                    vista.jtxNombre.getText());
            JOptionPane.showMessageDialog(
                    null,
                    "Registro Guardado!",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE
            );
            clear();
        }
        else if(vista.btnSalir == evento.getSource()){
            Salir();
        }
    }

    public void clear(){
        this.vista.jtxClave.setText("");
        this.vista.jtxNombre.setText("");
    }

    public void Salir(){
        System.exit(0);
    }
}
