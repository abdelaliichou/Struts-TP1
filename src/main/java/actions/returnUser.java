package actions;

import com.opensymphony.xwork2.ActionSupport;
import model.Facade;
import model.User;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.ApplicationAware;
import java.util.Map;
import java.util.Objects;

public class returnUser extends ActionSupport implements ApplicationAware, SessionAware {

    // c'est la map ou on va stocker et recupperer tous les objects de session qu'il sont accessible par tout/
    private Map<String, Object> session;
    private Facade facade ;

    // ce id variable c'est pour recuperer le parametre injecter from the home.jsp
    private int id;

    // dans cette fonction, on a recuperer le param id c'est bon.
    public void setId(int id) {
        this.id = id;
    }

    private User user;

    // ic on a permet la suivant de recupere notre user qu'on a trouve selon le id recuperer en parametre et le setID().
    public User getUser() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        // la page suivant selon le struts.xml (monUser.jsp) va recuperer ce object en utlisant le getter de user;
        this.user = this.facade.getUserByID(this.id);
        // ici on vas charger notre map de session par ce object pour qu'il devient accessible dans des autre pages et
        // pas just pour la page suivant .
        this.session.put("user", this.user);
        // ici on fait just un test pour l'error
        addActionError("You are already logged in");
        return SUCCESS;
    }

    @Override
    public void setApplication(Map<String, Object> map) {
        this.facade = (Facade) map.get("facade");
        if (Objects.isNull(this.facade)){
            this.facade = Facade.cree();
            map.put("facade", this.facade);
        }
    }

    @Override
    public void setSession(Map<String, Object> map) {
        // pour qu'on peut recupere tous les objects stocker dans cette map, aussi pour stocker des nouveaux variables.
        this.session = map;
    }
}
