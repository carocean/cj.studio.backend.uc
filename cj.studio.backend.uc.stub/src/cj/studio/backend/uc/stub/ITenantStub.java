package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.bo.Account;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.bo.Tenant;
import cj.studio.backend.uc.bo.TenantAttribute;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

import java.util.ArrayList;
import java.util.List;

@CjOpenports(usage = "租户存根")
public interface ITenantStub extends IOpenportService {
    @CjOpenport(usage = "申请租户账户。正常申请顺序：先注册统一用户，而后使用该用户再申请租户账户")
    void addAccount(@CjOpenportParameter(name = "tenantCode", usage = "租户编码") String tenantCode,
                    @CjOpenportParameter(name = "accountCode", usage = "账户编码") String accountCode,
                    @CjOpenportParameter(name = "accountName", usage = "账户名") String accountName,
                    @CjOpenportParameter(name = "userCode", usage = "用户编码，如果为已知用户创建指定租户下的账户则赋值，如果未知则为空系统自动生成账户所对应的用户") String userCode,
                    @CjOpenportParameter(name = "face", usage = "头像路径") String face);

    @CjOpenport(usage = "移除指定租户的账户")
    void removeAccount(@CjOpenportParameter(name = "tenantCode", usage = "租户编码") String tenantCode,
                       @CjOpenportParameter(name = "accountCode", usage = "账户编码") String accountCode);

    @CjOpenport(usage = "获取租户下账户数")
    long getAccountCount(@CjOpenportParameter(name = "tenantCode", usage = "租户编码") String tenantCode);

    @CjOpenport(usage = "获取租户下一页账户", elementType = Account.class)
    List<Account> pageAccount(@CjOpenportParameter(name = "tenantCode", usage = "租户编码") String tenantCode,
                              @CjOpenportParameter(name = "currPage", usage = "当前页") int currPage,
                              @CjOpenportParameter(name = "pageSize", usage = "页大小") int pageSize);

    @CjOpenport(usage = "获取指定租户下的一个账户")
    Account getAccount(@CjOpenportParameter(name = "tenantCode", usage = "租户编码") String tenantCode,
                       @CjOpenportParameter(name = "accountCode", usage = "账户编码") String accountCode);

    @CjOpenport(usage = "添加tenant")
    void addTenant(@CjOpenportParameter(name = "tenantCode", usage = "租户编码") String tenantCode,
                   @CjOpenportParameter(name = "tenantName", usage = "租户名") String tenantName,
                   @CjOpenportParameter(name = "ownerCode", usage = "租户所有者标识") String ownerCode,
                   @CjOpenportParameter(name = "ownerType", usage = "租户所有者类型，只有两种：personal（个人租户）,company(企业租户)") String ownerType);

    @CjOpenport(usage = "移除tenant")
    void removeTenant(@CjOpenportParameter(name = "tenantCode", usage = "租户编码") String tenantCode);

    @CjOpenport(usage = "获取tenant", type = Tenant.class)
    Tenant getTenant(@CjOpenportParameter(name = "tenantCode", usage = "租户编码") String tenantCode);

    @CjOpenport(usage = "为指定租户设置企业")
    void setCompanyOnTenant(@CjOpenportParameter(name = "companyCode", usage = "公司编码") String companyCode,
                            @CjOpenportParameter(name = "tenantCode", usage = "租户编码") String tenantCode);

    @CjOpenport(usage = "获取租户数")
    long getTenantCount();

    @CjOpenport(usage = "获取一页", type = ArrayList.class, elementType = Tenant.class)
    List<Tenant> pageTenant(@CjOpenportParameter(name = "currPage", usage = "当前页") int currPage,
                            @CjOpenportParameter(name = "pageSize", usage = "页大小") int pageSize);

    @CjOpenport(usage = "获取租户的信息段", type = ArrayList.class, elementType = Segment.class)
    List<Segment> getSegmentsOfTenant(@CjOpenportParameter(name = "tenantCode", usage = "租户编码") String tenantCode);

    @CjOpenport(usage = "为租户添加扩展信息段")
    void addSegmentOfTenant(@CjOpenportParameter(name = "tenantCode", usage = "租户编码") String tenantCode,
                            @CjOpenportParameter(name = "segCode", usage = "信息段编码") String segCode,
                            @CjOpenportParameter(name = "sort", usage = "段在租户中的顺序") int sort);

    @CjOpenport(usage = "移除租户指定关联的信息段")
    void removeSegmentOfTenant(@CjOpenportParameter(name = "tenantCode", usage = "租户编码") String tenantCode,
                               @CjOpenportParameter(name = "segCode", usage = "信息段编码") String segCode);

    @CjOpenport(usage = "清空该租户的信息段")
    void emptySegmentsOfTenant(@CjOpenportParameter(name = "tenantCode", usage = "租户编码") String tenantCode);

    @CjOpenport(usage = "添加用户属性")
    void addTenantAttribute(@CjOpenportParameter(name = "tenantCode", usage = "租户代码") String tenantCode,
                            @CjOpenportParameter(name = "segCode", usage = "段代码") String segCode,
                            @CjOpenportParameter(name = "attrCode", usage = "属性代码") String attrCode,
                            @CjOpenportParameter(name = "value", usage = "属性值") String value);

    @CjOpenport(usage = "移除租户下指定的属性")
    void removeTenantAttribute(@CjOpenportParameter(name = "tenantCode", usage = "租户代码") String tenantCode,
                               @CjOpenportParameter(name = "segCode", usage = "段代码") String segCode,
                               @CjOpenportParameter(name = "attrCode", usage = "属性代码") String attrCode);

    @CjOpenport(usage = "获取租户下指定的属性值")
    String getTenantAttribute(@CjOpenportParameter(name = "tenantCode", usage = "租户代码") String tenantCode,
                              @CjOpenportParameter(name = "segCode", usage = "段代码") String segCode,
                              @CjOpenportParameter(name = "attrCode", usage = "属性代码") String attrCode);

    @CjOpenport(usage = "清空租户下的属性")
    void emptyTenantAttributes(@CjOpenportParameter(name = "tenantCode", usage = "租户代码") String tenantCode,
                               @CjOpenportParameter(name = "segCode", usage = "段代码") String segCode);

    @CjOpenport(usage = "清空租户下的属性", type = ArrayList.class, elementType = TenantAttribute.class)
    List<TenantAttribute> getTenantAttributes(@CjOpenportParameter(name = "tenantCode", usage = "租户代码") String tenantCode,
                                              @CjOpenportParameter(name = "segCode", usage = "段代码") String segCode);
}
