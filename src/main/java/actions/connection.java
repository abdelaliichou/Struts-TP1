package actions;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Objects;

public class connection extends ActionSupport {
    private String name;
    private String mdps;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMdps() {
        return mdps;
    }

    public void setMdps(String mdps) {
        this.mdps = mdps;
    }

    @Override
    public void validate() {
        if (Objects.isNull(mdps) || mdps.isEmpty()){
            addFieldError("mdps", "You need to insert a password !");
        }
        if (Objects.isNull(name)|| name.isEmpty()){
            addFieldError("name", "You need to insert a name !");
        }
    }

    @Override
    public String execute() throws Exception {
        // here we need to call the connection function that exists in the facade and catch all the exceptions
        return SUCCESS;
    }

}
