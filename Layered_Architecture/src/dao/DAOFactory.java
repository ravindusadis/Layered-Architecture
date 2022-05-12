package dao;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getDaoFactory() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public enum DAOTypes {
        CUSTOMER, ITEM, ORDER, ORDERDETAILS, QUERYDAO
    }

    public void getDAO(DAOTypes types) {
        switch (types) {
            case CUSTOMER:
                return;
            case ITEM:
                return;
            case ORDER:
                return;
            case QUERYDAO:
                return;
            case ORDERDETAILS:
                return;
            default:
                return;
        }
    }




}
