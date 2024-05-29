package org.example.exercices;

import org.example.exercices.entities.Commentaire;
import org.example.exercices.entities.Image;

import javax.persistence.*;

@Entity
@Table(name = "product")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "marque")
    private String marque;
    @Column(name = "reference")
    private String reference;
    @Column(name = "dateAchat")
    private int dateAchat;
    @Column(name = "prix")
    private double prix;
    @Column(name = "stock")
    private int stock;

    @ManyToOne
    @JoinColumn(name = "images_id")
    private Image image;

    @ManyToOne
    @JoinColumn(name = "commentaire_id")
    private Commentaire commentaire;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(int dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getPrix() {
        return prix;
    }

    public Object setPrix(double prix) {
        this.prix = prix;
        return null;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {

        this.stock = stock;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Commentaire getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(Commentaire commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", reference='" + reference + '\'' +
                ", dateAchat=" + dateAchat +
                ", prix=" + prix +
                ", stock=" + stock +
                '}';
    }
}
