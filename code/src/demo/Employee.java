package demo;

import java.util.Date;

/**
 * @author hx1999
 * @Date 2020/6/19
 */
public class Employee {

    private Date hireDay;
    //其他
    public Date getHireDay() {
        return hireDay;//不好的写法
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }
}
