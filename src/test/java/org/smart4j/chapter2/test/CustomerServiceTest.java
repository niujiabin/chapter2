package org.smart4j.chapter2.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.service.CustomerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yaphetsBin on 2018-01-11.
 */
public class CustomerServiceTest {

    private  final CustomerService customerService;

    public CustomerServiceTest(){
        customerService = new CustomerService();
    }

    @Before
    public  void init(){

    }
    @Test
    public void getCustomerListTest() throws Exception{
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(2,customerList.size());
    }
    @Test
    public  void createCustomerTest() throws Exception{
        Map<String,Object> filedMap = new HashMap<String,Object>();
        filedMap.put("name","customer100");
        filedMap.put("contact","John");
        filedMap.put("telephone","13131331");
        boolean result = customerService.createCustomer(filedMap);
        Assert.assertTrue(result);
    }
    @Test
    public  void updateCustomerTest() throws Exception{
        long id = 1;
        Map<String,Object> fieldMap = new HashMap<String,Object>();
        fieldMap.put("contact","NiuJIbain");
        boolean result = customerService.updateCustomer(id,fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomer() throws Exception{
        long id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }


}
