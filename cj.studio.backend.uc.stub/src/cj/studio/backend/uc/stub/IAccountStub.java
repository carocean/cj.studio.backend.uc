package cj.studio.backend.uc.stub;

import cj.studio.backend.uc.bo.*;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

import java.util.ArrayList;
import java.util.List;

@CjOpenports(usage = "账户存根")
public interface IAccountStub extends IOpenportService {

    @CjOpenport(usage = "获取账户。返回账户，如果不存在则返回null", type = Account.class)
    Account getAccount(@CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode,
                       @CjOpenportParameter(name = "accountCode", usage = "账户") String accountCode);

    @CjOpenport(usage = "返回账户数")
    long getAccountCount(@CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode);

    @CjOpenport(usage = "获取一页账户", type = ArrayList.class, elementType = Account.class)
    List<Account> getPage(@CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode,
                          @CjOpenportParameter(name = "currPage", usage = "当前页号") int currPage,
                          @CjOpenportParameter(name = "pageSize", usage = "页大小") int pageSize);

    @CjOpenport(usage = "获取账户的信息段", type = ArrayList.class, elementType = Segment.class)
    List<Segment> getSegmentsOfAccount(@CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode,
                                       @CjOpenportParameter(name = "accountCode", usage = "账户") String accountCode);

    @CjOpenport(usage = "添加账户的信息段")
    void addSegmentOfAccount(@CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode,
                             @CjOpenportParameter(name = "accountCode", usage = "账户") String accountCode,
                             @CjOpenportParameter(name = "segCode", usage = "段号") String segCode,
                             @CjOpenportParameter(name = "sort", usage = "段顺序") int sort);

    @CjOpenport(usage = "移除账户的信息段")
    void removeSegmentOfAccount(@CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode,
                                @CjOpenportParameter(name = "segCode", usage = "段号") String segCode);

    @CjOpenport(usage = "清空账户的信息段")
    void emptySegmentsOfAccount(@CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode);

    @CjOpenport(usage = "添加账户的属性", command = "post")
    void addAccountAttribute(@CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode,
                             @CjOpenportParameter(name = "accountCode", usage = "账户") String accountCode,
                             @CjOpenportParameter(name = "segCode", usage = "段号") String segCode,
                             @CjOpenportParameter(name = "attrCode", usage = "属性") String attrCode,
                             @CjOpenportParameter(name = "value", usage = "属性值") String value);

    @CjOpenport(usage = "移除账户的属性")
    void removeAccountAttribute(@CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode,
                                @CjOpenportParameter(name = "accountCode", usage = "账户") String accountCode,
                                @CjOpenportParameter(name = "segCode", usage = "段号") String segCode,
                                @CjOpenportParameter(name = "attrCode", usage = "属性") String attrCode);

    @CjOpenport(usage = "清空账户指定段下的所有属性")
    void emptyAccountAttributes(@CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode,
                                @CjOpenportParameter(name = "accountCode", usage = "账户") String accountCode,
                                @CjOpenportParameter(name = "segCode", usage = "段号") String segCode);

    @CjOpenport(usage = "获取账户指定段下的所有属性", type = ArrayList.class, elementType = AccountAttribute.class)
    List<AccountAttribute> getAccountAttributes(@CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode,
                                                @CjOpenportParameter(name = "accountCode", usage = "账户") String accountCode,
                                                @CjOpenportParameter(name = "segCode", usage = "段号") String segCode);

    @CjOpenport(usage = "按信息段及其属性值查询账户", type = Account.class)
    Account getAccountByAttrValue(@CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode,
                                  @CjOpenportParameter(name = "segCode", usage = "信息段编码") String segCode,
                                  @CjOpenportParameter(name = "attrCode", usage = "属性编码") String attrCode,
                                  @CjOpenportParameter(name = "value", usage = "属性值") String value);

    @CjOpenport(usage = "列也全局角色", type = GlobalRole.class)
    List<GlobalRole> listGlobalRoleOfAccount(@CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode,
                                             @CjOpenportParameter(name = "accountCode", usage = "账户标识") String accountCode);

    @CjOpenport(usage = "列出租户角色", type = ArrayList.class, elementType = TenantRole.class)
    List<TenantRole> listTenantRoleOfAccount(@CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode,
                                             @CjOpenportParameter(name = "accountCode", usage = "账户标识") String accountCode);

    @CjOpenport(usage = "列出租户岗位", type = ArrayList.class, elementType = TenantPost.class)
    List<TenantPost> listTenantPostOfAccount(@CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode,
                                             @CjOpenportParameter(name = "accountCode", usage = "账户标识") String accountCode);

    @CjOpenport(usage = "列出租户群组", type = ArrayList.class, elementType = TenantGroup.class)
    List<TenantGroup> listTenantGroupOfAccount(@CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode,
                                               @CjOpenportParameter(name = "accountCode", usage = "账户标识") String accountCode);

    @CjOpenport(usage = "列出租户机构", type = ArrayList.class, elementType = Organization.class)
    List<Organization> listTenantOrganizationOfAccount(
            @CjOpenportParameter(name = "tenantCode", usage = "租户") String tenantCode,
            @CjOpenportParameter(name = "accountCode", usage = "账户标识") String accountCode);

}
