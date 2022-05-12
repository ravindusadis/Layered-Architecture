package dao;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class Test {
    public static void main(String[] args) {
   /*     DAOFactory daoFactory = new DAOFactory();
        DAOFactory daoFactor2 = new DAOFactory();
        DAOFactory daoFactor3 = new DAOFactory();
        DAOFactory daoFactor4 = new DAOFactory();*/

        DAOFactory daoFactory = DAOFactory.getDaoFactory();
        daoFactory.test();


    }
}
