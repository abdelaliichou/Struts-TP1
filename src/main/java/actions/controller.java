package actions;

import com.opensymphony.xwork2.ActionSupport;

public class controller extends ActionSupport {
    @Override
    public String execute() throws Exception {
        // based on the return, we will choose the page we want to go to inside the struts.xml file
        if (5 == 5){
            return "pile";
        } else {
            return "face";
        }
    }
}
