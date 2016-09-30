package model;

/**
 * Created by Karim on 23/09/2016.
 */

public class Categorie {
    private String codeC;
    private String libelleC;
    private String codeC_parent;

    public Categorie(String codeC, String libelleC, String codeC_parent) {
        this.codeC = codeC;
        this.libelleC = libelleC;
        this.codeC_parent = codeC_parent;
    }

    public String getCodeC() {
        return codeC;
    }

    public void setCodeC(String codeC) {
        this.codeC = codeC;
    }

    public String getLibelleC() {
        return libelleC;
    }

    public void setLibelleC(String libelleC) {
        this.libelleC = libelleC;
    }

    public String getCodeC_parent() {
        return codeC_parent;
    }

    public void setCodeC_parent(String codeC_parent) {
        this.codeC_parent = codeC_parent;
    }
}
