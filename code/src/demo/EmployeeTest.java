package demo;

import java.util.Date;

/**
 * @author hx1999
 * @Date 2020/6/19
 */
public class EmployeeTest {

    public static void main(String[] args) {
        Employee harry = new Employee();
        harry.setHireDay(new Date());

        //返回雇佣日期,类型为Date.
        Date date = harry.getHireDay();
        System.out.println(date.getTime());
        double ten = 10 * 365.25 * 24 * 60 * 60 * 1000;
        date.setTime(date.getTime() - (long) ten);

        //此时我们会发现harry的hireDay被改变了
        System.out.println(harry.getHireDay().getTime());
    }

}
