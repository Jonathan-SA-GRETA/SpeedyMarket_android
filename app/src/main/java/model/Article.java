package model;

/**
 * Created by Karim on 23/09/2016.
 */

public class Article {
    private String codeArticle;
    private String libelleArticle;
    private String descriptionArticle;
    private Integer qtArticle;
    private Float prixArticle;
    private String photoArticle;

    public Article(String codeArticle, String libelleArticle, String descriptionArticle, Float prixArticle, String photoArticle) {
        this.codeArticle = codeArticle;
        this.libelleArticle = libelleArticle;
        this.descriptionArticle = descriptionArticle;
        this.prixArticle = prixArticle;
        this.photoArticle = photoArticle;
    }



    public String getCodeArticle() {
        return codeArticle;
    }

    public void setCodeArticle(String codeArticle) {
        this.codeArticle = codeArticle;
    }

    public String getLibelleArticle() {
        return libelleArticle;
    }

    public void setLibelleArticle(String libelleArticle) {
        this.libelleArticle = libelleArticle;
    }

    public String getDescriptionArticle() {
        return descriptionArticle;
    }

    public void setDescriptionArticle(String descriptionArticle) {
        this.descriptionArticle = descriptionArticle;
    }

    public String getPhotoArticle() {
        return photoArticle;
    }

    public void setPhotoArticle(String photoArticle) {
        this.photoArticle = photoArticle;
    }

    public Integer getQtArticle() {
        return qtArticle;
    }

    public void setQtArticle(Integer qtArticle) {
        this.qtArticle = qtArticle;
    }

    public Float getPrixArticle() {
        return prixArticle;
    }

    public void setPrixArticle(Float prixArticle) {
        this.prixArticle = prixArticle;
    }

    @Override
    public String toString() {
        return "Article{" +
                "codeArticle='" + codeArticle + '\'' +
                ", libelleArticle='" + libelleArticle + '\'' +
                '}';
    }
}
