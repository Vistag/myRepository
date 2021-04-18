package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.StockDao;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

@ParentPackage("struts-default")
@Namespace("/")
public class ShowStockAction extends ActionSupport {
    @Action(value = "showStockAction", results = {@Result(name = "success", type = "dispatcher", location = "/jsp/stock/showStock.jsp"),
            @Result(name = "error", type = "dispatcher", location = "/jsp/desert/desert-insert.jsp")})
    public String Select() {
        try {
            ActionContext.getContext().put("list", new StockDao().SelectAll());
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ERROR;
    }
}
