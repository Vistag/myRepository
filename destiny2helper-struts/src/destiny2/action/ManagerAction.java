package destiny2.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import destiny2.dao.ManagerDao;
import destiny2.entity.Manager;
import destiny2.util.DBUtil;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wanghaoji@hikvision.com.cn
 */

@ParentPackage(value = "json-default")
@Namespace(value = "/")
public class ManagerAction extends ActionSupport implements ModelDriven {

    private Manager manager = new Manager();
    private ManagerDao dao = new ManagerDao();

    @Override
    public Object getModel() {
        return manager;
    }

    @Action(value = "manager-guide", results = {
            @Result(name = "manager-login-jsp", type = "dispatcher",
                    params = {"location", "/WEB-INF/jsp/manager/manager-login.jsp"}),

            @Result(name = "manager-login-success", type = "redirectAction",
                    params = {"ActionName", "weapon-guide?type=weapon-manager"}),

            @Result(name = "manager-login-fail", type = "dispatcher",
                    params = {"location", "/WEB-INF/jsp/manager/manager-login-fail.jsp"}),

            @Result(name = "manager-insert-jsp", type = "dispatcher",
                    params = {"location", "/WEB-INF/jsp/manager/manager-insert.jsp"}),

            @Result(name = "manager-insert", type = "dispatcher",
                    params = {"location", "/WEB-INF/jsp/manager/manager-insert-success.jsp"}),

            @Result(name = "error", type = "dispatcher",
                    params = {"location", "index.jsp"})
    })
    public String guide() throws Exception {
        HttpServletRequest httpServletRequest = ServletActionContext.getRequest();
        String type = httpServletRequest.getParameter("type");

        System.out.println(type);

        switch (type) {
            case "manager-login-jsp": {
                return "manager-login-jsp";
            }

            case "manager-login": {
                Manager m = dao.queryById(manager.getM_id());

                if (manager.getM_id().equals(m.getM_id()) && manager.getM_password().equals(m.getM_password())) {
                    ActionContext ctx = ActionContext.getContext();
                    ctx.getSession().put("m_id", manager.getM_id());

                    return "manager-login-success";
                } else {
                    return "manager-login-fail";
                }
            }

            case "manager-insert-jsp": {
                return "manager-insert-jsp";
            }

            case "manager-insert": {

                dao.insert(manager);

                return "manager-insert";
            }

            default: {
                return ERROR;
            }
        }


    }
}
