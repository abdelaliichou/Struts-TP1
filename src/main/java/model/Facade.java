package model;

import javax.print.DocFlavor;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Facade {
    private Map<Integer, User> userMap;

    private Facade(){
        this.userMap = new HashMap<>();
    }

    public static Facade cree(){
        // initialisation d'une facade;
        Facade facade = new Facade();
        facade.ajouterUser("ICHOU","Abdelali");
        facade.ajouterUser("AMMOUR", "Meriem");
        facade.ajouterUser("NEGADI", "Khadidja");
        facade.ajouterUser("ICHOU", "Mohammed");

        return facade;
    }

    public int ajouterUser(String nom, String prenom){
        User user = User.creeUser(nom,prenom);
        this.userMap.put(user.getId(), user);
        return user.getId();
    }

    public User getUserByID(int id) throws UserNotFoundException {
        User user = this.userMap.get(id);
        if (Objects.isNull(user)){
            throw new UserNotFoundException();
        }
        return user ;
    }

    public Collection<User> getAll(){
        return this.userMap.values();
    }
}
