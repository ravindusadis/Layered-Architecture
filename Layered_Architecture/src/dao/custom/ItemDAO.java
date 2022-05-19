package dao.custom;

import dao.CrudDAO;
import dto.ItemDTO;
import entity.Item;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public interface ItemDAO extends CrudDAO<Item,String> {
    public ArrayList<ItemDTO> getItemFromPrice(double price)throws ClassNotFoundException, SQLException;
}
