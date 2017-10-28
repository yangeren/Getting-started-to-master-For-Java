package ch8;

import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.*;

public class ManagerTest {
    @Test
    public void testGetBonus() throws Exception {
        Employee employee = new Employee();
        employee.setName("java");
        employee.setSalary(100);
        employee.setBirthday(new Date());
        Manager manager = new Manager();
        manager.setName("wanghan");
        manager.setSalary(3000);
        manager.setBirthday(new Date());
        manager.setBonus(2000);


        System.out.println("员工姓名： " + employee.getName());
        System.out.println("员工工资： " + employee.getSalary());
        System.out.println("员工生日： " + employee.getBirthday());
        System.out.println("经理姓名： " + manager.getName());
        System.out.println("经理工资： " + manager.getSalary());
        System.out.println("经理生日： " + manager.getBirthday());
        System.out.println("经理奖金： " + manager.getBonus());
    }

    @Test
    public void testSetBonus() throws Exception {
    }

}