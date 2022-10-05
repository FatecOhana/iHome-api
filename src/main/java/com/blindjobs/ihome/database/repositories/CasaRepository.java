package com.blindjobs.ihome.database.repositories;

import com.blindjobs.ihome.database.models.Casa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

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
@Repository
public interface CasaRepository extends JpaRepository<Casa, UUID> {

}
