package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.YzInquiryCustomerMapper;
import com.ruoyi.system.domain.YzInquiryCustomer;
import com.ruoyi.system.service.IYzInquiryCustomerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户询价Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-01-16
 */
@Service
public class YzInquiryCustomerServiceImpl implements IYzInquiryCustomerService 
{
    @Autowired
    private YzInquiryCustomerMapper yzInquiryCustomerMapper;

    /**
     * 查询客户询价
     * 
     * @param customerId 客户询价ID
     * @return 客户询价
     */
    @Override
    public YzInquiryCustomer selectYzInquiryCustomerById(Long customerId)
    {
        return yzInquiryCustomerMapper.selectYzInquiryCustomerById(customerId);
    }

    /**
     * 查询客户询价列表
     * 
     * @param yzInquiryCustomer 客户询价
     * @return 客户询价
     */
    @Override
    public List<YzInquiryCustomer> selectYzInquiryCustomerList(YzInquiryCustomer yzInquiryCustomer)
    {
        return yzInquiryCustomerMapper.selectYzInquiryCustomerList(yzInquiryCustomer);
    }

    /**
     * 新增客户询价
     * 
     * @param yzInquiryCustomer 客户询价
     * @return 结果
     */
    @Override
    public int insertYzInquiryCustomer(YzInquiryCustomer yzInquiryCustomer)
    {
        return yzInquiryCustomerMapper.insertYzInquiryCustomer(yzInquiryCustomer);
    }

    /**
     * 修改客户询价
     * 
     * @param yzInquiryCustomer 客户询价
     * @return 结果
     */
    @Override
    public int updateYzInquiryCustomer(YzInquiryCustomer yzInquiryCustomer)
    {
        return yzInquiryCustomerMapper.updateYzInquiryCustomer(yzInquiryCustomer);
    }

    /**
     * 删除客户询价对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteYzInquiryCustomerByIds(String ids)
    {
        return yzInquiryCustomerMapper.deleteYzInquiryCustomerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户询价信息
     * 
     * @param customerId 客户询价ID
     * @return 结果
     */
    @Override
    public int deleteYzInquiryCustomerById(Long customerId)
    {
        return yzInquiryCustomerMapper.deleteYzInquiryCustomerById(customerId);
    }
}
