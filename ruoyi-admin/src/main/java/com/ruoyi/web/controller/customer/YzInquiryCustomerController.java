package com.ruoyi.web.controller.customer;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.YzInquiryCustomer;
import com.ruoyi.system.service.IYzInquiryCustomerService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 客户询价Controller
 * 
 * @author ruoyi
 * @date 2020-01-16
 */
@Controller
@RequestMapping("/system/customer")
public class YzInquiryCustomerController extends BaseController
{
    private String prefix = "system/customer";

    @Autowired
    private IYzInquiryCustomerService yzInquiryCustomerService;

    @RequiresPermissions("system:customer:view")
    @GetMapping()
    public String customer()
    {
        return prefix + "/customer";
    }

    /**
     * 查询客户询价列表
     */
    @RequiresPermissions("system:customer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(YzInquiryCustomer yzInquiryCustomer)
    {
        startPage();
        List<YzInquiryCustomer> list = yzInquiryCustomerService.selectYzInquiryCustomerList(yzInquiryCustomer);
        return getDataTable(list);
    }

    /**
     * 导出客户询价列表
     */
    @RequiresPermissions("system:customer:export")
    @Log(title = "客户询价", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(YzInquiryCustomer yzInquiryCustomer)
    {
        List<YzInquiryCustomer> list = yzInquiryCustomerService.selectYzInquiryCustomerList(yzInquiryCustomer);
        ExcelUtil<YzInquiryCustomer> util = new ExcelUtil<YzInquiryCustomer>(YzInquiryCustomer.class);
        return util.exportExcel(list, "customer");
    }

    /**
     * 新增客户询价
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户询价
     */
    @RequiresPermissions("system:customer:add")
    @Log(title = "客户询价", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(YzInquiryCustomer yzInquiryCustomer)
    {
        return toAjax(yzInquiryCustomerService.insertYzInquiryCustomer(yzInquiryCustomer));
    }

    /**
     * 修改客户询价
     */
    @GetMapping("/edit/{customerId}")
    public String edit(@PathVariable("customerId") Long customerId, ModelMap mmap)
    {
        YzInquiryCustomer yzInquiryCustomer = yzInquiryCustomerService.selectYzInquiryCustomerById(customerId);
        mmap.put("yzInquiryCustomer", yzInquiryCustomer);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户询价
     */
    @RequiresPermissions("system:customer:edit")
    @Log(title = "客户询价", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(YzInquiryCustomer yzInquiryCustomer)
    {
        return toAjax(yzInquiryCustomerService.updateYzInquiryCustomer(yzInquiryCustomer));
    }

    /**
     * 删除客户询价
     */
    @RequiresPermissions("system:customer:remove")
    @Log(title = "客户询价", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(yzInquiryCustomerService.deleteYzInquiryCustomerByIds(ids));
    }
}
