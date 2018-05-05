package org.jsheng.bean;

public class Depatment {

    private Integer deptId;

    private String deptName;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Depatment() {
    }

    public Depatment(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
}