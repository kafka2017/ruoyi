package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.YzInquiryCustomer;
import java.util.List;

/**
 * 客户询价Mapper接口
 * 
 * @author ruoyi
 * @date 2020-01-16
 */
public interface YzInquiryCustomerMapper 
{
    /**
     * 查询客户询价
     * 
     * @param customerId 客户询价ID
     * @return 客户询价
     */
    public YzInquiryCustomer selectYzInquiryCustomerById(Long customerId);

    /**
     * 查询客户询价列表
     * 
     * @param yzInquiryCustomer 客户询价
     * @return 客户询价集合
     */
    public List<YzInquiryCustomer> selectYzInquiryCustomerList(YzInquiryCustomer yzInquiryCustomer);

    /**
     * 新增客户询价
     * 
     * @param yzInquiryCustomer 客户询价
     * @return 结果
     */
    public int insertYzInquiryCustomer(YzInquiryCustomer yzInquiryCustomer);

    /**
     * 修改客户询价
     * 
     * @param yzInquiryCustomer 客户询价
     * @return 结果
     */
    public int updateYzInquiryCustomer(YzInquiryCustomer yzInquiryCustomer);

    /**
     * 删除客户询价
     * 
     * @param customerId 客户询价ID
     * @return 结果
     */
    public int deleteYzInquiryCustomerById(Long customerId);

    /**
     * 批量删除客户询价
     * 
     * @param customerIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteYzInquiryCustomerByIds(String[] customerIds);
}
