package controller;

import dao.DAOFactory;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class Test {
    public static void main(String[] args) {
        DAOFactory daoFactory = DAOFactory.getDaoFactory();
        daoFactory.getDAO(DAOFactory.DAOTypes.ITEM);
    }
}
