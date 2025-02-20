package services

import models.Candidate

class CandidatesManager {
    List<Candidate> candidatos= []

    void listCandidates(){
        candidatos.each {it ->
            println(it.toString())
        }
    }

    void addCandidato(Candidate candidato) {
        candidatos << candidato
    }



}
