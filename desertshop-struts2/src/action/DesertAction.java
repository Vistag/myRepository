package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import dao.DesertDao;
import dao.StockDao;
import entity.Desert;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import util.DBUtil;

import javax.servlet.http.HttpServletRequest;

import static java.lang.Integer.parseInt;

@ParentPackage(value = "json-default")
@Namespace("/")
public class DesertAction extends ActionSupport implements ModelDriven {
    private Desert desert = new Desert();
    private DesertDao dao = new DesertDao();


    @Override
    public Object getModel() {
        return desert;
    }

    @Action(value = "desert-guide", results = {
            @Result(name = "desert-index", type = "dispatcher",
                    params = {"location", "/jsp/desert/desert-index.jsp"}),

            @Result(name = "desert-insert-jsp", type = "dispatcher",
                    params = {"location", "/jsp/desert/desert-insert.jsp"}),

            @Result(name = "desert-refresh", type = "redirectAction",
                    params = {"ActionName", "desert-guide?type=desert-index"}),

            @Result(name = "desert-update-jsp", type = "dispatcher",
                    params = {"location", "/jsp/desert/desert-update.jsp"}),

            @Result(name = "desert-query", type = "dispatcher",
                    params = {"location", "/jsp/desert/desert-query.jsp"}),

            @Result(name = "index", type = "dispatcher",
                    params = {"location", "/index.jsp"})
    })
    public String guide() throws Exception {
        HttpServletRequest httpServletRequest = ServletActionContext.getRequest();
        String type = httpServletRequest.getParameter("type");

        System.out.println(type);

        switch (type) {
            case "desert-index": {
                ActionContext ctx = ActionContext.getContext();
                ctx.put("desertList", dao.queryAll());

                return "desert-index";
            }

            case "desert-insert-jsp": {

                return "desert-insert-jsp";
            }

            case "desert-insert": {
                dao.insert(desert);
                new StockDao().Insert(Integer.valueOf(new DesertDao().queryOne(desert).getD_id()), desert.getD_number(), desert.getD_name());
                return "desert-refresh";
            }

            case "desert-delete": {
                String id = httpServletRequest.getParameter("id");
                desert.setD_id(id);

                dao.delete(desert);
                new StockDao().Delete(parseInt(desert.getD_id()));
                return "desert-refresh";
            }

            case "desert-update-jsp": {
                String id = httpServletRequest.getParameter("id");
                Desert d = new Desert();

                d.setD_id(id);
                Desert d2 = dao.queryOne(d);

                ActionContext ctx = ActionContext.getContext();
                ctx.put("desert", d2);

                return "desert-update-jsp";
            }

            case "desert-update": {
                dao.update(desert);
                new StockDao().update(Integer.valueOf(new DesertDao().queryOne(desert).getD_id()), desert.getD_number(), desert.getD_name());
                return "desert-refresh";
            }

            case "desert-query": {
                System.out.println(desert);
                Desert d = dao.queryOne(desert);

                ActionContext ctx = ActionContext.getContext();
                ctx.put("desert", d);

                return "desert-query";
            }

            default: {
                return "index";
            }
        }
    }
}
