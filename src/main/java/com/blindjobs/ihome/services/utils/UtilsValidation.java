package com.blindjobs.ihome.services.utils;

import java.util.Collection;

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
public class UtilsValidation {

    public static <T> boolean isNull(T v) {
        return v == null;
    }

//    public static <T> boolean isNullOrEmpty(Set<T> v) {
//        return isNull(v) || v.isEmpty();
//    }

    public static <T> boolean isNullOrEmpty(Collection<T> v) {
        return isNull(v) || v.isEmpty();
    }

    public static boolean isNullOrEmpty(String v) {
        return isNull(v) || v.isEmpty() || v.isBlank();
    }

    public static Object ifNull(Object valueNullable, Object valueIfNull) {
        return isNull(valueNullable) ? valueIfNull : valueNullable;
    }

}
