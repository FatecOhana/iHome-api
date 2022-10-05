package com.blindjobs.ihome.dto.exceptions;

/**
 * TRABALHO IMOBILIARIA (POO): DADOS DOS INTEGRANTES
 *
 * @author KAROLYNE COELHO DE LIMA
 * @author GABRIELA SILVA DE FARIAS BETINI
 * @author KELVEN BENTO FONTES
 * @author VICENZO GIOVANI CARRA LIMA
 * @author GUILHERME PERES LINS DA PALMA
 * @author DOUGLAS WALLACE RODRIGUES JUNIOR
 */
public class ExistentObject extends Exception {
    public ExistentObject() {
    }

    public ExistentObject(String message) {
        super(message);
    }

    public ExistentObject(String message, Throwable cause) {
        super(message, cause);
    }

}
