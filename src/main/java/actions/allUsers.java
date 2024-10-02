package actions;

import com.opensymphony.xwork2.ActionSupport;
import model.Facade;
import model.User;
import org.apache.struts2.interceptor.ApplicationAware;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class allUsers extends ActionSupport implements ApplicationAware {
    private Facade facade ;

    // cette function elle est accessible par la page jsp suivant directement
    public Collection<User> getUsers(){
        return this.facade.getAll();
    }

    // la fonction execute va nous donner SUCCESS par default donc pas besoin de l'implementer.


    @Override
    public void setApplication(Map<String, Object> map) {
        this.facade = (Facade) map.get("facade");
        if (Objects.isNull(this.facade)){
            this.facade = Facade.cree();
            map.put("facade", this.facade);
        }
    }
}
