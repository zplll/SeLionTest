package com.mycompany.test.bean.dataBean;

/**
 * Created by zipon on 2017/3/27.
 */
public class SimpleData {
    private String employeeId;

    private String employeeName;

    public String getEmployeeId () {
        return employeeId;
    }

    public void setEmployeeId (String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName () {
        return employeeName;
    }

    public void setEmployeeName (String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder("SimpleData{");
        sb.append("employeeId=").append(employeeId);
        sb.append(", employeeName='").append(employeeName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}