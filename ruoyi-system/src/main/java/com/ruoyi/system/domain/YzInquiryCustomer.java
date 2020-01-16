package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 客户询价对象 yz_inquiry_customer
 * 
 * @author ruoyi
 * @date 2020-01-16
 */
public class YzInquiryCustomer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long customerId;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String cusName;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 公司（单位） */
    @Excel(name = "公司", readConverterExp = "单=位")
    private String company;

    /** 注册时间 */
    @Excel(name = "注册时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date regTime;

    /** 回访状态 (0 未回访 1 已回访) */
    @Excel(name = "回访状态 (0 未回访 1 已回访)")
    private Integer regVisit;

    public void setCustomerId(Long customerId) 
    {
        this.customerId = customerId;
    }

    public Long getCustomerId() 
    {
        return customerId;
    }
    public void setCusName(String cusName) 
    {
        this.cusName = cusName;
    }

    public String getCusName() 
    {
        return cusName;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setCompany(String company) 
    {
        this.company = company;
    }

    public String getCompany() 
    {
        return company;
    }
    public void setRegTime(Date regTime) 
    {
        this.regTime = regTime;
    }

    public Date getRegTime() 
    {
        return regTime;
    }
    public void setRegVisit(Integer regVisit) 
    {
        this.regVisit = regVisit;
    }

    public Integer getRegVisit() 
    {
        return regVisit;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("customerId", getCustomerId())
            .append("cusName", getCusName())
            .append("phone", getPhone())
            .append("company", getCompany())
            .append("remark", getRemark())
            .append("regTime", getRegTime())
            .append("regVisit", getRegVisit())
            .toString();
    }
}
