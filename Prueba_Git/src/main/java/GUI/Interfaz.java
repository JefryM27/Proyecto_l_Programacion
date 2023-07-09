/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jefry
 */
public class Interfaz extends javax.swing.JFrame {

    DefaultTableModel modeloCONMEBOL = new DefaultTableModel();
    DefaultTableModel modeloAFC = new DefaultTableModel();
    DefaultTableModel modeloCONCACAF = new DefaultTableModel();
    DefaultTableModel modeloCAF = new DefaultTableModel();
    DefaultTableModel modeloOFC = new DefaultTableModel();
    DefaultTableModel modeloUEFA = new DefaultTableModel();

    private void cargarCONMEBOL() {
        ArrayList<Object> seleccionesCONMEBOL = new ArrayList<Object>();
        seleccionesCONMEBOL.add("Selecciones");
        for (Object columna : seleccionesCONMEBOL) {
            modeloCONMEBOL.addColumn(columna);
        }
        this.tblSeleccionesCONMEBOL.setModel(modeloCONMEBOL);

        ArrayList<Object[]> SeleccionesCONMEBOL = new ArrayList<Object[]>();

        Object[] seleccion1Conmebol = new Object[]{"Argentina"};
        Object[] seleccion2Conmebol = new Object[]{"Bolivia"};
        Object[] seleccion3Conmebol = new Object[]{"Brasil"};
        Object[] seleccion4Conmebol = new Object[]{"Chile"};
        Object[] seleccion5Conmebol = new Object[]{"Colombia"};
        Object[] seleccion6Conmebol = new Object[]{"Ecuador"};
        Object[] seleccion7Conmebol = new Object[]{"Paraguay"};
        Object[] seleccion8Conmebol = new Object[]{"Perú"};
        Object[] seleccion9Conmebol = new Object[]{"Uruguay"};
        Object[] seleccion10Conmebol = new Object[]{"Venezuela"};

        SeleccionesCONMEBOL.add(seleccion1Conmebol);
        SeleccionesCONMEBOL.add(seleccion2Conmebol);
        SeleccionesCONMEBOL.add(seleccion3Conmebol);
        SeleccionesCONMEBOL.add(seleccion4Conmebol);
        SeleccionesCONMEBOL.add(seleccion5Conmebol);
        SeleccionesCONMEBOL.add(seleccion6Conmebol);
        SeleccionesCONMEBOL.add(seleccion7Conmebol);
        SeleccionesCONMEBOL.add(seleccion8Conmebol);
        SeleccionesCONMEBOL.add(seleccion9Conmebol);
        SeleccionesCONMEBOL.add(seleccion10Conmebol);

        for (Object[] SeleccioneCONMEBOL : SeleccionesCONMEBOL) {
            modeloCONMEBOL.addRow(SeleccioneCONMEBOL);
        }
        tblSeleccionesCONMEBOL.setModel(modeloCONMEBOL);
    }

    private void cargarAFC() {
        ArrayList<Object> seleccionesAFC = new ArrayList<Object>();
        seleccionesAFC.add("Pos.");
        seleccionesAFC.add("Selecciones");
        seleccionesAFC.add("Pts.");
        seleccionesAFC.add("PJ");
        seleccionesAFC.add("PG");
        seleccionesAFC.add("PE");
        seleccionesAFC.add("PP");
        seleccionesAFC.add("GF");
        seleccionesAFC.add("GC");
        seleccionesAFC.add("Dif.");

        for (Object columna : seleccionesAFC) {
            modeloAFC.addColumn(columna);
        }
        this.tblVerAFC.setModel(modeloAFC);

        ArrayList<Object[]> SeleccionesAFC = new ArrayList<Object[]>();

        Object[] seleccion1AFC = new Object[]{"1", "Afganistán", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion2AFC = new Object[]{"2", "Arabia Saudí", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion3AFC = new Object[]{"3", "Australia", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion4AFC = new Object[]{"4", "Bahréin", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion5AFC = new Object[]{"5", "Bangladesh", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion6AFC = new Object[]{"6", "Brunéi Darussalam", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion7AFC = new Object[]{"7", "Bután", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion8AFC = new Object[]{"8", "Camboya", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion9AFC = new Object[]{"9", "Chinese Taipei", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion10AFC = new Object[]{"10", "Emiratos Árabes Unidos", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion11AFC = new Object[]{"11", "Filipinas", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion12AFC = new Object[]{"12", "Guam", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion13AFC = new Object[]{"13", "Hong Kong China", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion14AFC = new Object[]{"14", "India", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion15AFC = new Object[]{"15", "Indonesia", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion16AFC = new Object[]{"16", "Irak", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion17AFC = new Object[]{"17", "Japón", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion18AFC = new Object[]{"18", "Jordania", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion19AFC = new Object[]{"19", "Kuwait", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion20AFC = new Object[]{"20", "Laos", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion21AFC = new Object[]{"21", "Líbano", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion22AFC = new Object[]{"22", "Macao", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion23AFC = new Object[]{"23", "Malasia", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion24AFC = new Object[]{"24", "Maldivas", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion25AFC = new Object[]{"25", "Mongolia", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion26AFC = new Object[]{"26", "Myanmar", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion27AFC = new Object[]{"27", "Nepal", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion28AFC = new Object[]{"28", "Omán", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion29AFC = new Object[]{"29", "Pakistán", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion30AFC = new Object[]{"30", "Palestina", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion31AFC = new Object[]{"31", "Qatar", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion32AFC = new Object[]{"32", "RDP de Corea", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion33AFC = new Object[]{"33", "República de Corea", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion34AFC = new Object[]{"34", "República Kirguisa", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion35AFC = new Object[]{"35", "Rl de Irán", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion36AFC = new Object[]{"36", "RP China", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion37AFC = new Object[]{"37", "Singapur", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion38AFC = new Object[]{"38", "Siria", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion39AFC = new Object[]{"39", "Sri Lanka", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion40AFC = new Object[]{"40", "Tailandia", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion41AFC = new Object[]{"41", "Tayikistán", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion42AFC = new Object[]{"42", "Timor Oriental", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion43AFC = new Object[]{"43", "Turkmenistán", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion44AFC = new Object[]{"44", "Uzbekistán", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion45AFC = new Object[]{"45", "Vietnam", "0", "0", "0", "0", "0", "0", "0", "0"};
        Object[] seleccion46AFC = new Object[]{"46", "Yemen", "0", "0", "0", "0", "0", "0", "0", "0"};

        SeleccionesAFC.add(seleccion1AFC);
        SeleccionesAFC.add(seleccion2AFC);
        SeleccionesAFC.add(seleccion3AFC);
        SeleccionesAFC.add(seleccion4AFC);
        SeleccionesAFC.add(seleccion5AFC);
        SeleccionesAFC.add(seleccion6AFC);
        SeleccionesAFC.add(seleccion7AFC);
        SeleccionesAFC.add(seleccion8AFC);
        SeleccionesAFC.add(seleccion9AFC);
        SeleccionesAFC.add(seleccion10AFC);
        SeleccionesAFC.add(seleccion11AFC);
        SeleccionesAFC.add(seleccion12AFC);
        SeleccionesAFC.add(seleccion13AFC);
        SeleccionesAFC.add(seleccion14AFC);
        SeleccionesAFC.add(seleccion15AFC);
        SeleccionesAFC.add(seleccion16AFC);
        SeleccionesAFC.add(seleccion17AFC);
        SeleccionesAFC.add(seleccion18AFC);
        SeleccionesAFC.add(seleccion19AFC);
        SeleccionesAFC.add(seleccion20AFC);
        SeleccionesAFC.add(seleccion21AFC);
        SeleccionesAFC.add(seleccion22AFC);
        SeleccionesAFC.add(seleccion23AFC);
        SeleccionesAFC.add(seleccion24AFC);
        SeleccionesAFC.add(seleccion25AFC);
        SeleccionesAFC.add(seleccion26AFC);
        SeleccionesAFC.add(seleccion27AFC);
        SeleccionesAFC.add(seleccion28AFC);
        SeleccionesAFC.add(seleccion29AFC);
        SeleccionesAFC.add(seleccion30AFC);
        SeleccionesAFC.add(seleccion31AFC);
        SeleccionesAFC.add(seleccion32AFC);
        SeleccionesAFC.add(seleccion33AFC);
        SeleccionesAFC.add(seleccion34AFC);
        SeleccionesAFC.add(seleccion35AFC);
        SeleccionesAFC.add(seleccion36AFC);
        SeleccionesAFC.add(seleccion37AFC);
        SeleccionesAFC.add(seleccion38AFC);
        SeleccionesAFC.add(seleccion39AFC);
        SeleccionesAFC.add(seleccion40AFC);
        SeleccionesAFC.add(seleccion41AFC);
        SeleccionesAFC.add(seleccion42AFC);
        SeleccionesAFC.add(seleccion43AFC);
        SeleccionesAFC.add(seleccion44AFC);
        SeleccionesAFC.add(seleccion45AFC);
        SeleccionesAFC.add(seleccion46AFC);

        for (Object[] seleccioneAFC : SeleccionesAFC) {
            modeloAFC.addRow(seleccioneAFC);
        }
        tblVerAFC.setModel(modeloAFC);
    }

    private void cargaCONCACAF() {
        ArrayList<Object> seleccionesCONCACAF = new ArrayList<Object>();
        seleccionesCONCACAF.add("Selecciones");
        for (Object columna : seleccionesCONCACAF) {
            modeloCONCACAF.addColumn(columna);
        }
        this.tblSeleccionCONCACAF.setModel(modeloCONCACAF);

        ArrayList<Object[]> SeleccionesConca = new ArrayList<Object[]>();

        Object[] seleccion1CONCACAF = new Object[]{"Anguila"};
        Object[] seleccion2CONCACAF = new Object[]{"Antigua y Barbuda"};
        Object[] seleccion3CONCACAF = new Object[]{"Aruba"};
        Object[] seleccion4CONCACAF = new Object[]{"Bahamas"};
        Object[] seleccion5CONCACAF = new Object[]{"Barbados"};
        Object[] seleccion6CONCACAF = new Object[]{"Belice"};
        Object[] seleccion7CONCACAF = new Object[]{"Bermudas"};
        Object[] seleccion8CONCACAF = new Object[]{"Bonaire"};
        Object[] seleccion9CONCACAF = new Object[]{"Canadá"};
        Object[] seleccion10CONCACAF = new Object[]{"Costa Rica"};
        Object[] seleccion11CONCACAF = new Object[]{"Cuba"};
        Object[] seleccion12CONCACAF = new Object[]{"Curazao"};
        Object[] seleccion13CONCACAF = new Object[]{"Dominica"};
        Object[] seleccion14CONCACAF = new Object[]{"El Salvador"};
        Object[] seleccion15CONCACAF = new Object[]{"Estados Unidos"};
        Object[] seleccion16CONCACAF = new Object[]{"Granada"};
        Object[] seleccion17CONCACAF = new Object[]{"Guatemala"};
        Object[] seleccion18CONCACAF = new Object[]{"Guadalupe"};
        Object[] seleccion19CONCACAF = new Object[]{"Guayana"};
        Object[] seleccion20CONCACAF = new Object[]{"Guayana Francesa"};
        Object[] seleccion21CONCACAF = new Object[]{"Haití"};
        Object[] seleccion22CONCACAF = new Object[]{"Honduras"};
        Object[] seleccion23CONCACAF = new Object[]{"Islas Caimán"};
        Object[] seleccion24CONCACAF = new Object[]{"Islas Turcas y Caicos"};
        Object[] seleccion25CONCACAF = new Object[]{"Islas Vírgenes Británicas"};
        Object[] seleccion26CONCACAF = new Object[]{"Islas Vírgenes de los Estados Unidos"};
        Object[] seleccion27CONCACAF = new Object[]{"Jamaica"};
        Object[] seleccion28CONCACAF = new Object[]{"Martinica"};
        Object[] seleccion29CONCACAF = new Object[]{"México"};
        Object[] seleccion30CONCACAF = new Object[]{"Montserrat"};
        Object[] seleccion31CONCACAF = new Object[]{"Nicaragua"};
        Object[] seleccion32CONCACAF = new Object[]{"Panamá"};
        Object[] seleccion33CONCACAF = new Object[]{"Puerto Rico"};
        Object[] seleccion34CONCACAF = new Object[]{"República Dominicana"};
        Object[] seleccion35CONCACAF = new Object[]{"Saint-Martin"};
        Object[] seleccion36CONCACAF = new Object[]{"San Cristóbal y Nieves"};
        Object[] seleccion37CONCACAF = new Object[]{"San Vicente y las Granadinas"};
        Object[] seleccion38CONCACAF = new Object[]{"Santa Lucía"};
        Object[] seleccion39CONCACAF = new Object[]{"Sint Maarten"};
        Object[] seleccion40CONCACAF = new Object[]{"Surinam"};
        Object[] seleccion41CONCACAF = new Object[]{"Trinidad y Tobago"};

        SeleccionesConca.add(seleccion1CONCACAF);
        SeleccionesConca.add(seleccion2CONCACAF);
        SeleccionesConca.add(seleccion3CONCACAF);
        SeleccionesConca.add(seleccion4CONCACAF);
        SeleccionesConca.add(seleccion5CONCACAF);
        SeleccionesConca.add(seleccion6CONCACAF);
        SeleccionesConca.add(seleccion7CONCACAF);
        SeleccionesConca.add(seleccion8CONCACAF);
        SeleccionesConca.add(seleccion9CONCACAF);
        SeleccionesConca.add(seleccion10CONCACAF);
        SeleccionesConca.add(seleccion11CONCACAF);
        SeleccionesConca.add(seleccion12CONCACAF);
        SeleccionesConca.add(seleccion13CONCACAF);
        SeleccionesConca.add(seleccion14CONCACAF);
        SeleccionesConca.add(seleccion15CONCACAF);
        SeleccionesConca.add(seleccion16CONCACAF);
        SeleccionesConca.add(seleccion17CONCACAF);
        SeleccionesConca.add(seleccion18CONCACAF);
        SeleccionesConca.add(seleccion19CONCACAF);
        SeleccionesConca.add(seleccion20CONCACAF);
        SeleccionesConca.add(seleccion21CONCACAF);
        SeleccionesConca.add(seleccion22CONCACAF);
        SeleccionesConca.add(seleccion23CONCACAF);
        SeleccionesConca.add(seleccion24CONCACAF);
        SeleccionesConca.add(seleccion25CONCACAF);
        SeleccionesConca.add(seleccion26CONCACAF);
        SeleccionesConca.add(seleccion27CONCACAF);
        SeleccionesConca.add(seleccion28CONCACAF);
        SeleccionesConca.add(seleccion29CONCACAF);
        SeleccionesConca.add(seleccion30CONCACAF);
        SeleccionesConca.add(seleccion31CONCACAF);
        SeleccionesConca.add(seleccion32CONCACAF);
        SeleccionesConca.add(seleccion33CONCACAF);
        SeleccionesConca.add(seleccion34CONCACAF);
        SeleccionesConca.add(seleccion35CONCACAF);
        SeleccionesConca.add(seleccion36CONCACAF);
        SeleccionesConca.add(seleccion37CONCACAF);
        SeleccionesConca.add(seleccion38CONCACAF);
        SeleccionesConca.add(seleccion39CONCACAF);
        SeleccionesConca.add(seleccion40CONCACAF);
        SeleccionesConca.add(seleccion41CONCACAF);

        for (Object[] SeleccioneConca : SeleccionesConca) {
            modeloCONCACAF.addRow(SeleccioneConca);
        }
        tblSeleccionCONCACAF.setModel(modeloCONCACAF);
    }

    private void cargarOFC() {
        ArrayList<Object> seleccionesOFC = new ArrayList<Object>();
        seleccionesOFC.add("Selecciones");
        for (Object columna : seleccionesOFC) {
            modeloOFC.addColumn(columna);
        }
        this.tblSeleccionOFC.setModel(modeloOFC);

        ArrayList<Object[]> SeleccionesOFC = new ArrayList<Object[]>();

        Object[] seleccion1OFC = new Object[]{"Fiyi"};
        Object[] seleccion2OFC = new Object[]{"Islas Cook"};
        Object[] seleccion3OFC = new Object[]{"Islas Salomón"};
        Object[] seleccion4OFC = new Object[]{"Nueva Caledonia"};
        Object[] seleccion5OFC = new Object[]{"Nueva Zelanda"};
        Object[] seleccion6OFC = new Object[]{"Papúa Nueva Guinea"};
        Object[] seleccion7OFC = new Object[]{"Samoa"};
        Object[] seleccion8OFC = new Object[]{"Samoa Americana"};
        Object[] seleccion9OFC = new Object[]{"Tahiti"};
        Object[] seleccion10OFC = new Object[]{"Tonga"};
        Object[] seleccion11OFC = new Object[]{"Vanuatu"};
        Object[] seleccion12OFC = new Object[]{"Islas Kiribati"};
        Object[] seleccion13OFC = new Object[]{"Tuvalu"};

        SeleccionesOFC.add(seleccion1OFC);
        SeleccionesOFC.add(seleccion2OFC);
        SeleccionesOFC.add(seleccion3OFC);
        SeleccionesOFC.add(seleccion4OFC);
        SeleccionesOFC.add(seleccion5OFC);
        SeleccionesOFC.add(seleccion6OFC);
        SeleccionesOFC.add(seleccion7OFC);
        SeleccionesOFC.add(seleccion8OFC);
        SeleccionesOFC.add(seleccion9OFC);
        SeleccionesOFC.add(seleccion10OFC);
        SeleccionesOFC.add(seleccion11OFC);
        SeleccionesOFC.add(seleccion12OFC);
        SeleccionesOFC.add(seleccion13OFC);

        for (Object[] SeleccioneOFC : SeleccionesOFC) {
            modeloOFC.addRow(SeleccioneOFC);
        }
        tblSeleccionOFC.setModel(modeloOFC);
    }

    private void cargarUEFA() {
        ArrayList<Object> seleccionesUEFA = new ArrayList<Object>();
        seleccionesUEFA.add("Selecciones");
        for (Object columna : seleccionesUEFA) {
            modeloOFC.addColumn(columna);
        }
        this.tblSeleccionUEFA.setModel(modeloUEFA);

        ArrayList<Object[]> SeleccionesUEFA = new ArrayList<Object[]>();

        Object[] seleccion1UEFA = new Object[]{"Albania"};
        Object[] seleccion2UEFA = new Object[]{"Alemania"};
        Object[] seleccion3UEFA = new Object[]{"Andorra"};
        Object[] seleccion4UEFA = new Object[]{"Armenia"};
        Object[] seleccion5UEFA = new Object[]{"Austria"};
        Object[] seleccion6UEFA = new Object[]{"Azerbaiyán"};
        Object[] seleccion7UEFA = new Object[]{"Bélgica"};
        Object[] seleccion8UEFA = new Object[]{"Bielorrusia"};
        Object[] seleccion9UEFA = new Object[]{"Bosnia y Herzegovina"};
        Object[] seleccion10UEFA = new Object[]{"Bulgaria"};
        Object[] seleccion11UEFA = new Object[]{"Chipre"};
        Object[] seleccion12UEFA = new Object[]{"Croacia"};
        Object[] seleccion13UEFA = new Object[]{"Dinamarca"};
        Object[] seleccion14UEFA = new Object[]{"Escocia"};
        Object[] seleccion15UEFA = new Object[]{"Eslovaquia"};
        Object[] seleccion16UEFA = new Object[]{"Eslovenia"};
        Object[] seleccion17UEFA = new Object[]{"España"};
        Object[] seleccion18UEFA = new Object[]{"Estonia"};
        Object[] seleccion19UEFA = new Object[]{"Finlandia"};
        Object[] seleccion20UEFA = new Object[]{"Francia"};
        Object[] seleccion21UEFA = new Object[]{"Gales"};
        Object[] seleccion22UEFA = new Object[]{"Georgia"};
        Object[] seleccion23UEFA = new Object[]{"Gibraltar"};
        Object[] seleccion24UEFA = new Object[]{"Hungría"};
        Object[] seleccion25UEFA = new Object[]{"Inglaterra"};
        Object[] seleccion26UEFA = new Object[]{"Irlanda"};
        Object[] seleccion27UEFA = new Object[]{"Irlanda del Norte"};
        Object[] seleccion28UEFA = new Object[]{"Islandia"};
        Object[] seleccion29UEFA = new Object[]{"Islas Feroe"};
        Object[] seleccion30UEFA = new Object[]{"Israel"};
        Object[] seleccion31UEFA = new Object[]{"Italia"};
        Object[] seleccion32UEFA = new Object[]{"Kazajistán"};
        Object[] seleccion33UEFA = new Object[]{"Kosovo"};
        Object[] seleccion34UEFA = new Object[]{"Letonia"};
        Object[] seleccion35UEFA = new Object[]{"Liechtenstein"};
        Object[] seleccion36UEFA = new Object[]{"Lituania"};
        Object[] seleccion37UEFA = new Object[]{"Luxemburgo"};
        Object[] seleccion38UEFA = new Object[]{"Macedonia del Norte"};
        Object[] seleccion39UEFA = new Object[]{"Malta"};
        Object[] seleccion40UEFA = new Object[]{"Moldavia"};
        Object[] seleccion41UEFA = new Object[]{"Montenegro"};
        Object[] seleccion42UEFA = new Object[]{"Noruega"};
        Object[] seleccion43UEFA = new Object[]{"Paises Bajos"};
        Object[] seleccion44UEFA = new Object[]{"Polonia"};
        Object[] seleccion45UEFA = new Object[]{"Portugal"};
        Object[] seleccion46UEFA = new Object[]{"Republica Checa"};
        Object[] seleccion47UEFA = new Object[]{"Rumania"};
        Object[] seleccion48UEFA = new Object[]{"Rusia"};
        Object[] seleccion49UEFA = new Object[]{"San Marino"};
        Object[] seleccion50UEFA = new Object[]{"Serbia"};
        Object[] seleccion51UEFA = new Object[]{"Suecia"};
        Object[] seleccion52UEFA = new Object[]{"Suiza"};
        Object[] seleccion53UEFA = new Object[]{"Turquia"};
        Object[] seleccion54UEFA = new Object[]{"Ucrania"};

        SeleccionesUEFA.add(seleccion1UEFA);
        SeleccionesUEFA.add(seleccion2UEFA);
        SeleccionesUEFA.add(seleccion3UEFA);
        SeleccionesUEFA.add(seleccion4UEFA);
        SeleccionesUEFA.add(seleccion5UEFA);
        SeleccionesUEFA.add(seleccion6UEFA);
        SeleccionesUEFA.add(seleccion7UEFA);
        SeleccionesUEFA.add(seleccion8UEFA);
        SeleccionesUEFA.add(seleccion9UEFA);
        SeleccionesUEFA.add(seleccion10UEFA);
        SeleccionesUEFA.add(seleccion11UEFA);
        SeleccionesUEFA.add(seleccion12UEFA);
        SeleccionesUEFA.add(seleccion13UEFA);
        SeleccionesUEFA.add(seleccion14UEFA);
        SeleccionesUEFA.add(seleccion15UEFA);
        SeleccionesUEFA.add(seleccion16UEFA);
        SeleccionesUEFA.add(seleccion17UEFA);
        SeleccionesUEFA.add(seleccion18UEFA);
        SeleccionesUEFA.add(seleccion19UEFA);
        SeleccionesUEFA.add(seleccion20UEFA);
        SeleccionesUEFA.add(seleccion21UEFA);
        SeleccionesUEFA.add(seleccion22UEFA);
        SeleccionesUEFA.add(seleccion23UEFA);
        SeleccionesUEFA.add(seleccion24UEFA);
        SeleccionesUEFA.add(seleccion25UEFA);
        SeleccionesUEFA.add(seleccion26UEFA);
        SeleccionesUEFA.add(seleccion27UEFA);
        SeleccionesUEFA.add(seleccion28UEFA);
        SeleccionesUEFA.add(seleccion29UEFA);
        SeleccionesUEFA.add(seleccion30UEFA);
        SeleccionesUEFA.add(seleccion31UEFA);
        SeleccionesUEFA.add(seleccion32UEFA);
        SeleccionesUEFA.add(seleccion33UEFA);
        SeleccionesUEFA.add(seleccion34UEFA);
        SeleccionesUEFA.add(seleccion35UEFA);
        SeleccionesUEFA.add(seleccion36UEFA);
        SeleccionesUEFA.add(seleccion37UEFA);
        SeleccionesUEFA.add(seleccion38UEFA);
        SeleccionesUEFA.add(seleccion39UEFA);
        SeleccionesUEFA.add(seleccion40UEFA);
        SeleccionesUEFA.add(seleccion41UEFA);
        SeleccionesUEFA.add(seleccion42UEFA);
        SeleccionesUEFA.add(seleccion43UEFA);
        SeleccionesUEFA.add(seleccion44UEFA);
        SeleccionesUEFA.add(seleccion45UEFA);
        SeleccionesUEFA.add(seleccion46UEFA);
        SeleccionesUEFA.add(seleccion47UEFA);
        SeleccionesUEFA.add(seleccion48UEFA);
        SeleccionesUEFA.add(seleccion49UEFA);
        SeleccionesUEFA.add(seleccion50UEFA);
        SeleccionesUEFA.add(seleccion51UEFA);
        SeleccionesUEFA.add(seleccion52UEFA);
        SeleccionesUEFA.add(seleccion53UEFA);
        SeleccionesUEFA.add(seleccion54UEFA);

        for (Object[] SeleccioneUEFA : SeleccionesUEFA) {
            modeloUEFA.addRow(SeleccioneUEFA);
        }
        tblSeleccionUEFA.setModel(modeloUEFA);
    }

    private void cargarCAF() {
        ArrayList<Object> seleccionesCAF = new ArrayList<Object>();
        seleccionesCAF.add("Selecciones");
        for (Object columna : seleccionesCAF) {
            modeloCAF.addColumn(columna);
        }
        this.tblSeleccionCAF.setModel(modeloCAF);

        ArrayList<Object[]> SeleccionesCAF = new ArrayList<Object[]>();

        Object[] seleccion1CAF = new Object[]{"Angola"};
        Object[] seleccion2CAF = new Object[]{"Argelia"};
        Object[] seleccion3CAF = new Object[]{"Benín"};
        Object[] seleccion4CAF = new Object[]{"Botsuana"};
        Object[] seleccion5CAF = new Object[]{"Burkina Faso"};
        Object[] seleccion6CAF = new Object[]{"Burundi"};
        Object[] seleccion7CAF = new Object[]{"Cabo Verde"};
        Object[] seleccion8CAF = new Object[]{"Camerún"};
        Object[] seleccion9CAF = new Object[]{"Chad"};
        Object[] seleccion10CAF = new Object[]{"Comoras"};
        Object[] seleccion11CAF = new Object[]{"Congo"};
        Object[] seleccion12CAF = new Object[]{"Costa de Marfil"};
        Object[] seleccion13CAF = new Object[]{"Egipto"};
        Object[] seleccion14CAF = new Object[]{"Eritrea"};
        Object[] seleccion15CAF = new Object[]{"Esuatini"};
        Object[] seleccion16CAF = new Object[]{"Etiopía"};
        Object[] seleccion17CAF = new Object[]{"Gabón"};
        Object[] seleccion18CAF = new Object[]{"Gambia"};
        Object[] seleccion19CAF = new Object[]{"Ghana"};
        Object[] seleccion20CAF = new Object[]{"Guinea"};
        Object[] seleccion21CAF = new Object[]{"Guinea Ecuatorial"};
        Object[] seleccion22CAF = new Object[]{"Guinea-Bissáu"};
        Object[] seleccion23CAF = new Object[]{"Kenia"};
        Object[] seleccion24CAF = new Object[]{"Lesoto"};
        Object[] seleccion25CAF = new Object[]{"Liberia"};
        Object[] seleccion26CAF = new Object[]{"Libia"};
        Object[] seleccion27CAF = new Object[]{"Madagascar"};
        Object[] seleccion28CAF = new Object[]{"Malaui"};
        Object[] seleccion29CAF = new Object[]{"Mali"};
        Object[] seleccion30CAF = new Object[]{"Marruecos"};
        Object[] seleccion31CAF = new Object[]{"Mauricio"};
        Object[] seleccion32CAF = new Object[]{"Mauritania"};
        Object[] seleccion33CAF = new Object[]{"Mozambique"};
        Object[] seleccion34CAF = new Object[]{"Namibia"};
        Object[] seleccion35CAF = new Object[]{"Níger"};
        Object[] seleccion36CAF = new Object[]{"Nigeria"};
        Object[] seleccion37CAF = new Object[]{"RD del Congo"};
        Object[] seleccion38CAF = new Object[]{"República Centroafricana"};
        Object[] seleccion39CAF = new Object[]{"Ruanda"};
        Object[] seleccion40CAF = new Object[]{"Santo Tomé y Príncipe"};
        Object[] seleccion41CAF = new Object[]{"Senegal"};
        Object[] seleccion42CAF = new Object[]{"Seychelles"};
        Object[] seleccion43CAF = new Object[]{"Sierra Leona"};
        Object[] seleccion44CAF = new Object[]{"Somalia"};
        Object[] seleccion45CAF = new Object[]{"Sudáfrica"};
        Object[] seleccion46CAF = new Object[]{"Sudán"};
        Object[] seleccion47CAF = new Object[]{"Sudán del Sur"};
        Object[] seleccion48CAF = new Object[]{"Tanzania"};
        Object[] seleccion49CAF = new Object[]{"Togo"};
        Object[] seleccion50CAF = new Object[]{"Túnez"};
        Object[] seleccion51CAF = new Object[]{"Uganda"};
        Object[] seleccion52CAF = new Object[]{"Yibuti"};
        Object[] seleccion53CAF = new Object[]{"Zambia"};

        SeleccionesCAF.add(seleccion1CAF);
        SeleccionesCAF.add(seleccion2CAF);
        SeleccionesCAF.add(seleccion3CAF);
        SeleccionesCAF.add(seleccion4CAF);
        SeleccionesCAF.add(seleccion5CAF);
        SeleccionesCAF.add(seleccion6CAF);
        SeleccionesCAF.add(seleccion7CAF);
        SeleccionesCAF.add(seleccion8CAF);
        SeleccionesCAF.add(seleccion9CAF);
        SeleccionesCAF.add(seleccion10CAF);
        SeleccionesCAF.add(seleccion11CAF);
        SeleccionesCAF.add(seleccion12CAF);
        SeleccionesCAF.add(seleccion13CAF);
        SeleccionesCAF.add(seleccion14CAF);
        SeleccionesCAF.add(seleccion15CAF);
        SeleccionesCAF.add(seleccion16CAF);
        SeleccionesCAF.add(seleccion17CAF);
        SeleccionesCAF.add(seleccion18CAF);
        SeleccionesCAF.add(seleccion19CAF);
        SeleccionesCAF.add(seleccion20CAF);
        SeleccionesCAF.add(seleccion21CAF);
        SeleccionesCAF.add(seleccion22CAF);
        SeleccionesCAF.add(seleccion23CAF);
        SeleccionesCAF.add(seleccion24CAF);
        SeleccionesCAF.add(seleccion25CAF);
        SeleccionesCAF.add(seleccion26CAF);
        SeleccionesCAF.add(seleccion27CAF);
        SeleccionesCAF.add(seleccion28CAF);
        SeleccionesCAF.add(seleccion29CAF);
        SeleccionesCAF.add(seleccion30CAF);
        SeleccionesCAF.add(seleccion31CAF);
        SeleccionesCAF.add(seleccion32CAF);
        SeleccionesCAF.add(seleccion33CAF);
        SeleccionesCAF.add(seleccion34CAF);
        SeleccionesCAF.add(seleccion35CAF);
        SeleccionesCAF.add(seleccion36CAF);
        SeleccionesCAF.add(seleccion37CAF);
        SeleccionesCAF.add(seleccion38CAF);
        SeleccionesCAF.add(seleccion39CAF);
        SeleccionesCAF.add(seleccion40CAF);
        SeleccionesCAF.add(seleccion41CAF);
        SeleccionesCAF.add(seleccion42CAF);
        SeleccionesCAF.add(seleccion43CAF);
        SeleccionesCAF.add(seleccion44CAF);
        SeleccionesCAF.add(seleccion45CAF);
        SeleccionesCAF.add(seleccion46CAF);
        SeleccionesCAF.add(seleccion47CAF);
        SeleccionesCAF.add(seleccion48CAF);
        SeleccionesCAF.add(seleccion49CAF);
        SeleccionesCAF.add(seleccion50CAF);
        SeleccionesCAF.add(seleccion51CAF);
        SeleccionesCAF.add(seleccion52CAF);
        SeleccionesCAF.add(seleccion53CAF);

        for (Object[] SeleccioneCAF : SeleccionesCAF) {
            modeloCAF.addRow(SeleccioneCAF);
        }
        tblSeleccionCAF.setModel(modeloCAF);
    }

    /*private void SedeEncuentro(){//Es casi inutil
        int identificador;
        String paisSede;
        String sedeDeEncuentros;
        ArrayList<String> paisesDeEncuentros;
        boolean marcador;
    }
    private void paisesDeEncuentro(){
    ArrayList<String> paises = new ArrayList<>();
        paises.add("1.Argentina");
        paises.add("2.Bolivia");
        paises.add("3.Brasil");
        paises.add("4.Chile");
        paises.add("5.Colombia");
        paises.add("6.Ecuador");
        paises.add("7.Paraguay");
        paises.add("8.Perú");
        paises.add("9.Uruguay");
        paises.add("10.Venezuela");
    }
    private void SedesDeEncuentro(){
        ArrayList<String> sedes = new ArrayList<>();
        sedes.add("1.Buenos Aires");
        sedes.add("2.La Paz");
        sedes.add("3.Río de Janeiro");
        sedes.add("4.Santiago");
        sedes.add("5.Barranquilla");
        sedes.add("6.Quito");
        sedes.add("7.Asunción");
        sedes.add("8.Lima");
        sedes.add("9.Montevideo");
        sedes.add("10.Caracas");

        ArrayList<String> sedesEncuentro = generarSedesEncuentro(sedes, 3);

        // Imprimir la información de las sedes de encuentro
        for (SedeEncuentro sede : sedesEncuentro) {
            System.out.println("Identificador: " + sede.getIdentificador());
            System.out.println("País de la sede: " + sede.getPaisSede());
            System.out.println("Sede del encuentro: " + sede.getSedeEncuentro());
            System.out.println("Países del encuentro: " + sede.getPaisesEncuentro());
            System.out.println("Marcado: " + sede.isMarcado());
            System.out.println();
        }
    }
    private void generarSedes(){
    // Generar las sedes de encuentro al azar
        Random random = new Random();
        for (int i = 1; i <= 3; i++) {
            int identificador = i;
            String paisDeEncuentro = paises.get(random.nextInt(paises.size()));
            String sedesDeEncuentro = "Sede " + i;
            ArrayList<String> sedes = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                paisesEncuentro.add(paises.get(random.nextInt(paises.size())));
            }
            boolean marcado = random.nextBoolean();
            SedesDeEncuentro sede = new SedesEncuentro(identificador, paisDeEncuentro, sedesDeEncuentro, sedes, marcado);
            sedesEncuentro.add(sede);
        }
    }*/
    public class Encuentro {

        private int marcadorEquipo1;
        private int marcadorEquipo2;

        // Constructor
        public Encuentro() {
            Random random = new Random();
            this.marcadorEquipo1 = random.nextInt(11);  // Genera un número aleatorio de 0 a 10
            this.marcadorEquipo2 = random.nextInt(11);  // Genera un número aleatorio de 0 a 10
        }

        public class Marcador {

            private int equipo1;
            private int equipo2;

            // Constructor
            public Marcador(int equipo1, int equipo2) {
                this.equipo1 = equipo1;
                this.equipo2 = equipo2;
            }

            // Método para determinar el resultado del encuentro
            public int calcularPuntos() {
                if (equipo1 == equipo2) {
                    return 1;  // Empate, se suma 1 punto a la tabla de clasificación
                } else if (equipo1 > equipo2) {
                    return 3;  // Equipo 1 gana, se suman 3 puntos a la tabla de clasificación
                } else {
                    return 0;  // Equipo 2 gana, no suma puntos en la tabla de clasificación
                }
            }
        }
    }

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.cargarCONMEBOL();
        this.cargarAFC();
        this.cargaCONCACAF();
        this.cargarOFC();
        this.cargarUEFA();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSelecionesAFC = new javax.swing.JTable();
        btnPartidoAFC = new javax.swing.JButton();
        btnTodosPartidosAFC = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblVerAFC = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSeleccionCONCACAF = new javax.swing.JTable();
        btnPartidoCONCACAF = new javax.swing.JButton();
        btnTodosPartidosCONCACAF = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSeleccionesCONMEBOL = new javax.swing.JTable();
        btnPartidoCONMEBOL = new javax.swing.JButton();
        btnTodosPartidosCONMEBOL = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblSeleccionOFC = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblSeleccionUEFA = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSeleccionCAF = new javax.swing.JTable();
        btnTodosPartidosCAF = new javax.swing.JButton();
        btnPartidoCAF = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblSelecionesAFC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Selecciones AFC"
            }
        ));
        jScrollPane1.setViewportView(tblSelecionesAFC);

        btnPartidoAFC.setBackground(new java.awt.Color(204, 204, 204));
        btnPartidoAFC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPartidoAFC.setText("Partido por Partido");

        btnTodosPartidosAFC.setBackground(new java.awt.Color(204, 204, 204));
        btnTodosPartidosAFC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTodosPartidosAFC.setText("Todos los partidos");
        btnTodosPartidosAFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosPartidosAFCActionPerformed(evt);
            }
        });

        tblVerAFC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos.", "Seleccion", "Pts.", "PJ", "PG", "PE", "PP", "GF", "GC", "Dif."
            }
        ));
        jScrollPane7.setViewportView(tblVerAFC);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTodosPartidosAFC, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPartidoAFC, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96)
                .addComponent(btnPartidoAFC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnTodosPartidosAFC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("AFC", jPanel11);

        tblSeleccionCONCACAF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Selecciones CONCACAF"
            }
        ));
        jScrollPane3.setViewportView(tblSeleccionCONCACAF);

        btnPartidoCONCACAF.setBackground(new java.awt.Color(204, 204, 204));
        btnPartidoCONCACAF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPartidoCONCACAF.setText("Partido por Partido");
        btnPartidoCONCACAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoCONCACAFActionPerformed(evt);
            }
        });

        btnTodosPartidosCONCACAF.setBackground(new java.awt.Color(204, 204, 204));
        btnTodosPartidosCONCACAF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTodosPartidosCONCACAF.setText("Todos los partidos");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTodosPartidosCONCACAF, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPartidoCONCACAF))
                .addGap(55, 55, 55))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnPartidoCONCACAF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTodosPartidosCONCACAF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("CONCACAF", jPanel13);

        tblSeleccionesCONMEBOL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Selecciones CONMEBOL"
            }
        ));
        jScrollPane4.setViewportView(tblSeleccionesCONMEBOL);

        btnPartidoCONMEBOL.setBackground(new java.awt.Color(204, 204, 204));
        btnPartidoCONMEBOL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPartidoCONMEBOL.setText("Partidos por Partido");

        btnTodosPartidosCONMEBOL.setBackground(new java.awt.Color(204, 204, 204));
        btnTodosPartidosCONMEBOL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTodosPartidosCONMEBOL.setText("Todos los partidos");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPartidoCONMEBOL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTodosPartidosCONMEBOL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(88, 88, 88))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnPartidoCONMEBOL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnTodosPartidosCONMEBOL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(330, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("CONMEBOL", jPanel15);

        tblSeleccionOFC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seleccion"
            }
        ));
        jScrollPane5.setViewportView(tblSeleccionOFC);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(426, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("OFC", jPanel16);

        tblSeleccionUEFA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seleccion"
            }
        ));
        jScrollPane6.setViewportView(tblSeleccionUEFA);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(376, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("UEFA", jPanel17);

        tblSeleccionCAF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Selecciones CAF"
            }
        ));
        jScrollPane2.setViewportView(tblSeleccionCAF);

        btnTodosPartidosCAF.setBackground(new java.awt.Color(204, 204, 204));
        btnTodosPartidosCAF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTodosPartidosCAF.setText("Todos los Partidos");
        btnTodosPartidosCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosPartidosCAFActionPerformed(evt);
            }
        });

        btnPartidoCAF.setBackground(new java.awt.Color(204, 204, 204));
        btnPartidoCAF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPartidoCAF.setText("Partido por Partido");
        btnPartidoCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidoCAFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPartidoCAF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTodosPartidosCAF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnPartidoCAF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTodosPartidosCAF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("CAF", jPanel12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTodosPartidosCAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosPartidosCAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTodosPartidosCAFActionPerformed

    private void btnPartidoCAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoCAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPartidoCAFActionPerformed

    private void btnPartidoCONCACAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidoCONCACAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPartidoCONCACAFActionPerformed

    private void btnTodosPartidosAFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosPartidosAFCActionPerformed
        this.simularPartidos(new Object[]{}, modeloAFC);

    }//GEN-LAST:event_btnTodosPartidosAFCActionPerformed

    public int generarGoles() {
        // Generar un número aleatorio de goles entre 0 y 10
        Random random = new Random();
        int goles = random.nextInt(11); // Genera números entre 0 y 10 (ambos inclusive)
        return goles;
    }

    private void simularPartidos(Object[] equipos, DefaultTableModel modelo) {
        int numEquipos = equipos.length;

        for (int i = 0; i < numEquipos; i++) {
            for (int j = i + 1; j < numEquipos; j++) {
                // Simular partido entre equipo i y equipo j
                int golesEquipoI = this.generarGoles();// Lógica para generar los goles del equipo i
                int golesEquipoJ = this.generarGoles();// Lógica para generar los goles del equipo j

                // Actualizar los resultados en la tabla correspondiente
                //modelo.setValueAt(golesEquipoI, i, j + 2); // +2 para omitir las dos primeras columnas
                //modelo.setValueAt(golesEquipoJ, j, i + 2); // +2 para omitir las dos primeras columnas
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPartidoAFC;
    private javax.swing.JButton btnPartidoCAF;
    private javax.swing.JButton btnPartidoCONCACAF;
    private javax.swing.JButton btnPartidoCONMEBOL;
    private javax.swing.JButton btnTodosPartidosAFC;
    private javax.swing.JButton btnTodosPartidosCAF;
    private javax.swing.JButton btnTodosPartidosCONCACAF;
    private javax.swing.JButton btnTodosPartidosCONMEBOL;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tblSeleccionCAF;
    private javax.swing.JTable tblSeleccionCONCACAF;
    private javax.swing.JTable tblSeleccionOFC;
    private javax.swing.JTable tblSeleccionUEFA;
    private javax.swing.JTable tblSeleccionesCONMEBOL;
    private javax.swing.JTable tblSelecionesAFC;
    private javax.swing.JTable tblVerAFC;
    // End of variables declaration//GEN-END:variables
}
