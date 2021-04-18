package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.StockDao;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

@ParentPackage("struts-default")
@Namespace("/")
public class SellStockAction extends ActionSupport {
    @Action(value = "sellStockAction", results = {@Result(name = "success", type = "chain", location = "showStockAction"),
            @Result(name = "error", type = "chain", location = "showStockAction")})
    public String sell() {
        try {
            new StockDao().Sell(Integer.valueOf(ServletActionContext.getRequest().getParameter("sid")));
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ERROR;
    }
}
