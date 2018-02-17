package org.smart4j.chapter2.service;

import org.smart4j.chapter2.Utils.PropsUtil;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;

import java.sql.*;
import java.util.*;
import java.util.logging.Logger;

/**
 * Created by yaphetsBin on 2018-01-11.
 */
public class CustomerService {




    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList(String keywords) {
        return null;
    }

    public List<Customer> getCustomerList() {
        {
            Connection conn = null;
            try {
                List<Customer> customerList = new ArrayList<Customer>();
                String sql = "select * from customer";
                conn = DatabaseHelper.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Customer customer = new Customer();
                    customer.setId(rs.getLong("id"));
                    customer.setName(rs.getString("name"));
                    customer.setContact(rs.getString("contact"));
                    customer.setTelephone(rs.getString("telephone"));
                    customer.setEmail(rs.getString("remark"));
                    customerList.add(customer);
                }
                return customerList;
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            return null;
        }
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id) {
        return null;
    }

    public boolean createCustomer(Map<String, Object> filedMao) {
        return false;
    }

    public boolean updateCustomer(long id, Map<String, Object> filedMap) {
        return false;
    }

    public boolean deleteCustomer(long id) {
        return false;
    }

}
