package workshop.dao;

import junit.framework.TestCase;
import workshop.entity.Collection;
import workshop.entity.Match;
import workshop.entity.Player;
import workshop.entity.Weapon;

import java.util.List;

public class Test extends TestCase {

    //测试Collection的CRUD
    public void testCollection() {
        CollectionDAO collectionDAO = new CollectionDAO();
        PlayerDAO playerDAO = new PlayerDAO();
        Collection collection = new Collection();
        Player player = new Player();

        player = new PlayerDAO().queryOnePlayer(1);
        collection.setC_stuff("丁香与醋栗");
        collection.setPlayer(player);
        System.out.println(collection);

//        //添加
//        collectionDAO.insertCollection(collection);

//        查询一个
//        collection = collectionDAO.queryOneCollection(6);
//        System.out.println(collection);
//        collection.setC_stuff("水水水水");
//        //修改
//        collectionDAO.updateCollection(collection);

//        //查询所有
//        List<Collection> collectionList = collectionDAO.queryAllCollection();
//        for (Collection c : collectionList) {
//            System.out.println(c);
//        }

//        //删除
        collectionDAO.deleteCollection(7);
    }

    //测试Match的CRUD
    public void testMatch() {
//        MatchDAO matchDAO = new MatchDAO();
//        Match match = new Match();

//        match.setM_name("一拳雷鸣猎人");
//        match.setM_list("版本之子");
//
//        //添加
//        matchDAO.insertMatch(match);

//        //查询一个
//        matchDAO.queryOneMatch(1);
//        match = matchDAO.queryOneMatch(1);
//        System.out.println(match);
//
//        //修改
//        matchDAO.updateMatch(match);
//
//        //删除
//        matchDAO.deleteMatch(1);
//
//        //查询所有
//        matchDAO.queryAllMatch();
    }

    //测试Player的CRUD
    public void testPlayer() {
        PlayerDAO playerDAO = new PlayerDAO();
        Player player = new Player();

        player.setP_name("葫芦娃爷爷");
        player.setP_work("WARLOCK");
        //添加
        playerDAO.insertPlayer(player);

//        //查询一个
//        playerDAO.queryOnePlayer(1);
//
//        //修改
//        player.setP_name("神之长子");
//        playerDAO.updatePlayer(player);
//
//        //删除
//        playerDAO.deletePlayer(1);
//
//        //查询所有
//        playerDAO.queryAllPlayer();
    }

    //测试Weapon的CRUD
    public void testWeapon() {
        WeaponDAO weaponDAO = new WeaponDAO();
        MatchDAO matchDAO = new MatchDAO();
        Weapon weapon = new Weapon();
        Match match = new Match();

        match = matchDAO.queryOneMatch(1);
        weapon.setW_name("牵引器火炮");
        weapon.setType("霰弹枪");
        weapon.setTime("黎明崛起");
        weapon.setMatch(match);

        //增加
        weaponDAO.insertWeapon(weapon);

//        //查询一个
//        weaponDAO.queryOneWeapon(1);
//
//        //修改
//        weapon.setTime("猩红战争");
//        weaponDAO.updateWeapon(weapon);
//
//        //删除
//        weaponDAO.deleteWeapon(1);
//
//        //查询所有
//        weaponDAO.queryAllWeapon();
    }


//    Weapon weapon = new Weapon();
//    Match match = new MatchDAO().queryOneMatch(1);
//        weapon.setMatch(match);
}
