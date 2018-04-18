package com.example.jordan.androcv;

import java.io.Serializable;

public class Formation implements Serializable {
    private String anneeDiplome;
    private String etablissement;
    private String libelle;

    public Formation(String anneeDiplome, String etablissement, String libelle) {
        this.anneeDiplome = anneeDiplome;
        this.etablissement = etablissement;
        this.libelle = libelle;
    }

    public String getAnneeDiplome() {
        return anneeDiplome;
    }

    public void setAnneeDiplome(String anneeDiplome) {
        this.anneeDiplome = anneeDiplome;
    }

    public String getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(String etablissement) {
        this.etablissement = etablissement;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


}
