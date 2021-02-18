package Familias;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2017 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 */
import java.util.ArrayList;

public class Persona {
    // Variables de instancia privadas

    private String nombre;
    private Persona padre;
    private Persona madre;
    private ArrayList hijos = new ArrayList();

    // Constructores públicos
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, Persona padre, Persona madre) {
        this.nombre = nombre;
        this.padre = padre;
        this.madre = madre;
        padre.addHijo(this);
        madre.addHijo(this);
    }

    // Método privado
    private void addHijo(Persona hijo) {
        hijos.add(hijo);
    }

    // Métodos públicos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void verHijos() {
        for (Object hijo : this.hijos) {
            System.out.println(this.getNombre() + " tiene como hij@ a " + ((Persona) hijo).getNombre());
        }

    }

}
