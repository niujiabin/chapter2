package org.smart4j.chapter2.service;

import org.smart4j.chapter2.model.Customer;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by yaphetsBin on 2018-01-11.
 */
public class CustomerService {
    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList(String keywords){
        return  null;
    }

    public List<Customer> getCustomerList(){
        return  null;
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id){
        return null;
    }

    public boolean createCustomer(Map<String,Object> filedMao){
        return false;
    }

    public boolean updateCustomer(long id,Map<String,Object> filedMap){
        return false;
    }

    public  boolean deleteCustomer(long id){
        return  false;
    }
}
