package destiny2.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import destiny2.dao.WeaponDao;
import destiny2.entity.Weapon;
import destiny2.util.DBUtil;
import jdk.jfr.ContentType;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.dispatcher.Parameter;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@ParentPackage(value = "json-default")
@Namespace(value = "/")
public class WeaponAction extends ActionSupport implements ModelDriven<Weapon> {

    private Weapon weapon = new Weapon();
    private WeaponDao dao = new WeaponDao();

    @Override
    public Weapon getModel() {
        return weapon;
    }


    @Action(value = "weapon-guide", results = {
            @Result(name = "weapon-index", type = "dispatcher",
                    params = {"location", "/WEB-INF/jsp/weapon/weapon-index.jsp"}),

            @Result(name = "weapon-manager", type = "dispatcher",
                    params = {"location", "/WEB-INF/jsp/weapon/weapon-manager.jsp"}),

            @Result(name = "login", type = "redirectAction",
                    params = {"ActionName", "manager-guide?type=manager-login-jsp"}),

            @Result(name = "weapon-insert-jsp", type = "dispatcher",
                    params = {"location", "/WEB-INF/jsp/weapon/weapon-insert.jsp"}),

            @Result(name = "weapon-insert", type = "redirectAction",
                    params = {"ActionName", "weapon-guide?type=weapon-manager"}),

            @Result(name = "weapon-delete", type = "redirectAction",
                    params = {"ActionName", "weapon-guide?type=weapon-manager"}),

            @Result(name = "weapon-update-jsp", type = "dispatcher",
                    params = {"location", "/WEB-INF/jsp/weapon/weapon-update.jsp"}),

            @Result(name = "weapon-update", type = "redirectAction",
                    params = {"ActionName", "weapon-guide?type=weapon-manager"}),

            @Result(name = "weapon-query", type = "dispatcher",
                    params = {"location", "/WEB-INF/jsp/weapon/weapon-query.jsp"}),

            @Result(name = "error", type = "dispatcher",
                    params = {"location", "index.jsp"})
    })
    public String guide() throws Exception {
        HttpServletRequest httpServletRequest = ServletActionContext.getRequest();
        String type = httpServletRequest.getParameter("type");

        System.out.println(type);

        switch (type) {

            //跳转至装备信息主页
            case "weapon-index": {
                WeaponDao dao = new WeaponDao();
                List<Weapon> weaponList = dao.selectAll();

                ActionContext ctx = ActionContext.getContext();
                ctx.put("weaponList", weaponList);

                return "weapon-index";
            }

            //跳转至装备信息管理主页
            case "weapon-manager": {
                ActionContext ctx = ActionContext.getContext();
                Map<String, Object> session = ctx.getSession();

                if (session.get("m_id") != null) {
//                    List<Weapon> weaponList = dao.selectAll();
                    ctx.put("weaponList", dao.selectAll());

                    return "weapon-manager";
                } else {
                    return "login";
                }
            }

            //跳转至增加装备信息主页
            case "weapon-insert-jsp": {
                return "weapon-insert-jsp";
            }

            //将表单信息提交至数据库并返回weapon-manager.jsp
            case "weapon-insert": {
                dao.insert(weapon);

                return "weapon-insert";
            }

            //按id删除一条表单信息
            case "weapon-delete": {
                int id = Integer.parseInt(httpServletRequest.getParameter("id"));
                weapon.setW_id(id);
                dao.delete(weapon);

                return "weapon-delete";
            }

            //进入修改装备信息页面
            case "weapon-update-jsp": {
                int id = Integer.parseInt(httpServletRequest.getParameter("id"));
                Weapon w = new Weapon();

                w.setW_id(id);
                w = dao.queryOne(w);

                ActionContext ctx = ActionContext.getContext();
                ctx.put("weapon", w);

                return "weapon-update-jsp";
            }

            //修改装备信息
            case "weapon-update": {
                dao.update(weapon);

                return "weapon-update";
            }

            //查询装备信息
            case "weapon-query": {
                Weapon w = dao.queryOne(weapon);

                ActionContext ctx = ActionContext.getContext();
                ctx.put("weapon", w);

                return "weapon-query";
            }

            default: {
                return ERROR;
            }
        }
    }

}
