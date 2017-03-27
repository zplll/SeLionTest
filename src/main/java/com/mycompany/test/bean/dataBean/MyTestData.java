package com.mycompany.test.bean.dataBean;

/**
 * Created by zipon on 2017/3/27.
 */
public class MyTestData {
    private String caseId;
    private String caseDetail;

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getCaseDetail() {
        return caseDetail;
    }

    public void setCaseDetail(String caseDetail) {
        this.caseDetail = caseDetail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"caseId\":\"")
                .append(caseId).append('\"');
        sb.append(",\"caseDetail\":\"")
                .append(caseDetail).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
