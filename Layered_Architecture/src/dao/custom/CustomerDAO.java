package dao.custom;

import dao.CrudDAO;
import dto.CustomerDTO;
import entity.Customer;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public interface CustomerDAO extends CrudDAO<Customer,String> {
    public ArrayList<CustomerDTO> getAllCustomersByAddress(String address)throws ClassNotFoundException, SQLException;
}
