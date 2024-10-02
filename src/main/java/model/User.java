package model;

public class User {

    private String nom;
    private String prenom;
    private int id;

    public User(String nom, String prenom, int id) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
    }

    private static int IDU = 0;
    public static User creeUser(String nom, String prenom){
        return new User(nom, prenom, IDU++);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }
}
