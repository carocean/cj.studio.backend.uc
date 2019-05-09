
# uc

## 用户中心
[下载存根](https://github.com/carocean/cj.studio.backend.uc/blob/master/outputs/cj.studio.backend.uc.stub-1.0.jar)
- 将存根引入网关的前置项目即可直接使用。如果不想使用网关前置，也可以通过http client等第三方工具按以下api的要求调用。
- 推荐使用postman进行api测试

## API

******************************************************
       usercenter
         标识：3AD05D29-80AE-440B-AC52-C9D9150F9797
         版本：1.0.0.0
         产品：cj.studio.backend.uc
         公司：cj工作室
         版权：Copyright 2011
         描述：cj工作室出品，lns平台制造
******************************************************
http://localhost:9090/uc/tenant.service
    cj.studio.backend.uc.stub.ITenantStub
    用法:租户存根

    getTenant
        用法:获取tenant
        返回值类型:cj.studio.backend.uc.bo.Tenant,说明:返回租户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command getTenant
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码

    getAccount
        用法:获取指定租户下的一个账户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command getAccount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户编码

    addAccount
        用法:申请租户账户。正常申请顺序：先注册统一用户，而后使用该用户再申请租户账户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command addAccount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户编码
                arg2
                    类型:java.lang.String
                    方式：InParameter accountName
                    用法:账户名
                arg3
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户编码，如果为已知用户创建指定租户下的账户则赋值，如果未知则为空系统自动生成账户所对应的用户
                arg4
                    类型:java.lang.String
                    方式：InParameter face
                    用法:头像路径

    removeAccount
        用法:移除指定租户的账户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command removeAccount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户编码

    getAccountCount
        用法:获取租户下账户数
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command getAccountCount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码

    addTenant
        用法:添加tenant
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command addTenant
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter tenantName
                    用法:租户名
                arg2
                    类型:java.lang.String
                    方式：InParameter ownerCode
                    用法:租户所有者标识
                arg3
                    类型:java.lang.String
                    方式：InParameter ownerType
                    用法:租户所有者类型，只有两种：personal（个人租户）,company(企业租户)

    removeTenant
        用法:移除tenant
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command removeTenant
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码

    getSegmentsOfTenant
        用法:获取租户的信息段
        返回值类型:java.util.ArrayList,说明:返回
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command getSegmentsOfTenant
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码

    addSegmentOfTenant
        用法:为租户添加扩展信息段
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command addSegmentOfTenant
        参数:
                arg0
                    类型:cj.studio.backend.uc.bo.TenantSegment
                    方式：InParameter seg
                    用法:信息段

    removeSegmentOfTenant
        用法:移除租户指定关联的信息段
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command removeSegmentOfTenant
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:信息段编码

    emptySegmentsOfTenant
        用法:清空该租户的信息段
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command emptySegmentsOfTenant
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码

    addTenantAttribute
        用法:添加用户属性
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command addTenantAttribute
        参数:
                arg0
                    类型:cj.studio.backend.uc.bo.TenantAttribute
                    方式：InParameter attr
                    用法:租户属性

    removeTenantAttribute
        用法:移除租户下指定的属性
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command removeTenantAttribute
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段代码
                arg2
                    类型:java.lang.String
                    方式：InParameter attrCode
                    用法:属性代码

    emptyTenantAttributes
        用法:清空租户下的属性
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command emptyTenantAttributes
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段代码

    getTenantAttributes
        用法:清空租户下的属性
        返回值类型:java.util.ArrayList,说明:租户的属性
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command getTenantAttributes
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段代码

    getTenantAttribute
        用法:获取租户下指定的属性值
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command getTenantAttribute
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段代码
                arg2
                    类型:java.lang.String
                    方式：InParameter attrCode
                    用法:属性代码

    setCompanyOnTenant
        用法:为指定租户设置企业
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command setCompanyOnTenant
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter companyCode
                    用法:公司编码
                arg1
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码

    unsetCompanyOnTenant
        用法:清除租户关联的企业
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command unsetCompanyOnTenant
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码

    getTenantCount
        用法:获取租户数
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command getTenantCount
        参数:

    pageTenant
        用法:获取一页
        返回值类型:java.util.ArrayList,说明:返回
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command pageTenant
        参数:
                arg0
                    类型:int
                    方式：InParameter currPage
                    用法:当前页
                arg1
                    类型:int
                    方式：InParameter pageSize
                    用法:页大小

    pageAccount
        用法:获取租户下一页账户
        返回值类型:java.lang.Void,说明:账户集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantStub
                Rest-Command pageAccount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码
                arg1
                    类型:int
                    方式：InParameter currPage
                    用法:当前页
                arg2
                    类型:int
                    方式：InParameter pageSize
                    用法:页大小


http://localhost:9090/uc/authentication.service
    cj.studio.backend.uc.stub.IAuthenticationStub
    用法:身份认证服务

    getAuthenticatorInfo
        用法:获取认证器信息
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAuthenticationStub
                Rest-Command getAuthenticatorInfo
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter authName
                    用法:认证器名

    enumAuthenticatorNames
        用法:列出支持的认证器名
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAuthenticationStub
                Rest-Command enumAuthenticatorNames
        参数:

    authenticate
        用法:认证指定主体的身份
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAuthenticationStub
                Rest-Command authenticate
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter authName
                    用法:认证器名
                arg1
                    类型:java.lang.String
                    方式：InParameter tenant
                    用法:租户或租户令牌
                arg2
                    类型:java.lang.String
                    方式：InParameter principals
                    用法:要认证的主体，可以是用户名，也可是令牌(如果是令牌：结合password以认证令牌是密码持有者的）
                arg3
                    类型:java.lang.String
                    方式：InParameter password
                    用法:密码
                arg4
                    类型:long
                    方式：InParameter ttlMillis
                    用法:令牌过期时间


http://localhost:9090/uc/tenant/organization.service
    cj.studio.backend.uc.stub.ITenantOrganizationStub
    用法:机构存根

    addOrganization
        用法:添加机构
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantOrganizationStub
                Rest-Command addOrganization
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码
                arg2
                    类型:java.lang.String
                    方式：InParameter orgName
                    用法:机构名
                arg3
                    类型:java.lang.String
                    方式：InParameter pid
                    用法:父机构代码
                arg4
                    类型:java.lang.String
                    方式：InParameter comment
                    用法:说明

    removeOrganization
        用法:移除机构
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantOrganizationStub
                Rest-Command removeOrganization
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码

    getOrganizationCount
        用法:获取机构总数
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantOrganizationStub
                Rest-Command getOrganizationCount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码

    listChilds
        用法:获取子机构
        返回值类型:java.util.ArrayList,说明:返回机构集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantOrganizationStub
                Rest-Command listChilds
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter pid
                    用法:父机构代码

    getAccountsOnOrg
        用法:获取机构下的账户
        返回值类型:java.util.ArrayList,说明:一页数
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantOrganizationStub
                Rest-Command getAccountsOnOrg
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码

    pageAccountsOnOrg
        用法:获取指定机构下的一页账户数据
        返回值类型:java.util.ArrayList,说明:一页数
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantOrganizationStub
                Rest-Command pageAccountsOnOrg
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码
                arg2
                    类型:int
                    方式：InParameter currPage
                    用法:当前页码
                arg3
                    类型:int
                    方式：InParameter pageSize
                    用法:页大小

    addAccountOnOrg
        用法:为指定机构清加账户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantOrganizationStub
                Rest-Command addAccountOnOrg
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户代码
                arg2
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码

    removeAccountOnOrg
        用法:移除指定机构下的一个账户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantOrganizationStub
                Rest-Command removeAccountOnOrg
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户代码
                arg2
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码

    emptyAccountsOnOrg
        用法:清空机构下的账户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantOrganizationStub
                Rest-Command emptyAccountsOnOrg
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码

    childCount
        用法:返回子机构数
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantOrganizationStub
                Rest-Command childCount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter pid
                    用法:父机构代码

    getOrganization
        用法:获取机构
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantOrganizationStub
                Rest-Command getOrganization
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码


http://localhost:9090/uc/role.service
    cj.studio.backend.uc.stub.IGlobalRoleStub
    用法:角色存根

    addRole
        用法:添加角色
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IGlobalRoleStub
                Rest-Command addRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码
                arg1
                    类型:java.lang.String
                    方式：InParameter roleName
                    用法:角色名
                arg2
                    类型:java.lang.String
                    方式：InParameter comment
                    用法:角色描述

    removeRole
        用法:移除角色
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IGlobalRoleStub
                Rest-Command removeRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码

    getRole
        用法:获取角色
        返回值类型:cj.studio.backend.uc.bo.GlobalRole,说明:返回角色
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IGlobalRoleStub
                Rest-Command getRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码

    getRoleCount
        用法:角色数
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IGlobalRoleStub
                Rest-Command getRoleCount
        参数:

    getUsersOnRole
        用法:获取一页角色
        返回值类型:java.util.ArrayList,说明:返回角色，Json格式
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IGlobalRoleStub
                Rest-Command getUsersOnRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码

    addUserOnRole
        用法:添加用户到角色
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IGlobalRoleStub
                Rest-Command addUserOnRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码

    removeUserOnRole
        用法:移除用户在角色
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IGlobalRoleStub
                Rest-Command removeUserOnRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码

    emptyUsersOnRole
        用法:清空角色上的用户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IGlobalRoleStub
                Rest-Command emptyUsersOnRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码

    getPage
        用法:获取一页角色
        返回值类型:java.util.ArrayList,说明:返回角色，Json格式
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IGlobalRoleStub
                Rest-Command getPage
        参数:
                arg0
                    类型:int
                    方式:InContent currPage
                    用法:当前页码
                arg1
                    类型:int
                    方式:InContent pageSize
                    用法:页大小


http://localhost:9090/uc/user.service
    cj.studio.backend.uc.stub.IUserStub
    用法:用户存根

    getUsersByAttrValue
        用法:按信息段及其属性值查询用户
        返回值类型:java.util.ArrayList,说明:返回用户集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IUserStub
                Rest-Command getUsersByAttrValue
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:信息段编码
                arg1
                    类型:java.lang.String
                    方式：InParameter attrCode
                    用法:属性编码
                arg2
                    类型:java.lang.String
                    方式：InParameter value
                    用法:属性值

    saveUser
        用法:保存用户
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IUserStub
                Rest-Command saveUser
        参数:
                arg0
                    类型:cj.studio.backend.uc.bo.User
                    方式:InContent user
                    用法:用户对象。说明：在user.userCode为空的时候自动产生数据编码

    getUser
        用法:按编码查询用户
        返回值类型:cj.studio.backend.uc.bo.User,说明:返回用户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IUserStub
                Rest-Command getUser
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter UserCode
                    用法:用户编码

    getUserCount
        用法:用户数
        返回值类型:java.lang.Long,说明:返回用户数
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IUserStub
                Rest-Command getUserCount
        参数:

    removeUser
        用法:删除用户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IUserStub
                Rest-Command removeUser
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter UserCode
                    用法:用法编码

    addUserAttribute
        用法:添加用户属性
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IUserStub
                Rest-Command addUserAttribute
        参数:
                arg0
                    类型:cj.studio.backend.uc.bo.UserAttribute
                    方式:InContent attr
                    用法:用户属性

    removeUserAttribute
        用法:移除用户下指定的属性
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IUserStub
                Rest-Command removeUserAttribute
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段编码
                arg2
                    类型:java.lang.String
                    方式：InParameter attrCode
                    用法:属性编码

    getUserAttribute
        用法:获用户下指定的属性值
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IUserStub
                Rest-Command getUserAttribute
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段编码
                arg2
                    类型:java.lang.String
                    方式：InParameter attrCode
                    用法:属性编码

    emptyUserAttributes
        用法:清空用户所有属性
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IUserStub
                Rest-Command emptyUserAttributes
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段编码

    getUserAttributes
        用法:获取用户属性
        返回值类型:java.util.ArrayList,说明:用户属性
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IUserStub
                Rest-Command getUserAttributes
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段编码

    getAccountOfUserOnTenant
        用法:获取用户的账户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IUserStub
                Rest-Command getAccountOfUserOnTenant
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码

    listAccountOfUser
        用法:列出用户账户
        返回值类型:java.util.ArrayList,说明:集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IUserStub
                Rest-Command listAccountOfUser
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户编码

    listGlobalRoleOfUser
        用法:列出全局角色
        返回值类型:java.util.ArrayList,说明:集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IUserStub
                Rest-Command listGlobalRoleOfUser
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户编码

    listTenantRoleOfUser
        用法:列出租户角色
        返回值类型:java.util.ArrayList,说明:集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IUserStub
                Rest-Command listTenantRoleOfUser
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户

    listTenantPostOfUser
        用法:列出租户岗位
        返回值类型:java.util.ArrayList,说明:集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IUserStub
                Rest-Command listTenantPostOfUser
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户

    listTenantGroupOfUser
        用法:列出租户群组
        返回值类型:java.util.ArrayList,说明:集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IUserStub
                Rest-Command listTenantGroupOfUser
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户

    listTenantOrganizationOfUser
        用法:列出租户机构
        返回值类型:java.util.ArrayList,说明:集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IUserStub
                Rest-Command listTenantOrganizationOfUser
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户

    getPage
        用法:获取一页用户
        返回值类型:java.util.ArrayList,说明:返回一页用户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IUserStub
                Rest-Command getPage
        参数:
                arg0
                    类型:int
                    方式：InParameter currPage
                    用法:当前分页位置
                arg1
                    类型:int
                    方式：InParameter pageSize
                    用法:分页大小


http://localhost:9090/uc/tenant/group.service
    cj.studio.backend.uc.stub.ITenantGroupStub
    用法:租户群组存根

    addGroup
        用法:添加群组
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantGroupStub
                Rest-Command addGroup
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter groupCode
                    用法:组代码
                arg2
                    类型:java.lang.String
                    方式：InParameter groupName
                    用法:组名
                arg3
                    类型:java.lang.String
                    方式：InParameter comment
                    用法:说明

    removeGroup
        用法:移除群组
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantGroupStub
                Rest-Command removeGroup
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter groupCode
                    用法:组代码

    getAccountsOnGroup
        用法:获取指定群组的账户
        返回值类型:java.lang.Void,说明:账户集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantGroupStub
                Rest-Command getAccountsOnGroup
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter groupCode
                    用法:组代码

    pageAccountsOnGroup
        用法:获取指定群组的账户
        返回值类型:java.lang.Void,说明:一页
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantGroupStub
                Rest-Command pageAccountsOnGroup
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter groupCode
                    用法:组代码
                arg2
                    类型:int
                    方式：InParameter currPage
                    用法:当前页
                arg3
                    类型:int
                    方式：InParameter pageSize
                    用法:页大小

    addAccountOnGroup
        用法:添加账户到指定群组
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantGroupStub
                Rest-Command addAccountOnGroup
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户代码
                arg2
                    类型:java.lang.String
                    方式：InParameter groupCode
                    用法:组代码

    removeAccountOnGroup
        用法:移除群组的一个账户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantGroupStub
                Rest-Command removeAccountOnGroup
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户代码
                arg2
                    类型:java.lang.String
                    方式：InParameter groupCode
                    用法:组代码

    emptyAccountsOnGroup
        用法:清空群组上的账户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantGroupStub
                Rest-Command emptyAccountsOnGroup
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter groupCode
                    用法:组代码

    getGroup
        用法:获取群组
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantGroupStub
                Rest-Command getGroup
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter groupCode
                    用法:组代码

    pageGroup
        用法:分页
        返回值类型:java.lang.Void,说明:一页
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantGroupStub
                Rest-Command pageGroup
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:int
                    方式：InParameter currPage
                    用法:当前页
                arg2
                    类型:int
                    方式：InParameter pageSize
                    用法:页大小


http://localhost:9090/uc/principals.service
    cj.studio.backend.uacc.security.stub.IPrincipalsStub
    用法:主体。

    getAllPrincipalCollections
        用法:获取所有主体表定义
        返回值类型:java.util.ArrayList,说明:主体表列表
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uacc.security.stub.IPrincipalsStub
                Rest-Command getAllPrincipalCollections
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter sysCode
                    用法:系统代码

    getChildPrincipals
        用法:获取子主体
        返回值类型:java.util.ArrayList,说明:主体列表
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uacc.security.stub.IPrincipalsStub
                Rest-Command getChildPrincipals
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter sysCode
                    用法:系统代码
                arg1
                    类型:java.lang.String
                    方式：InParameter principalColName
                    用法:主体集合名
                arg2
                    类型:java.lang.String
                    方式：InParameter parentPrincipalCode
                    用法:父主体代码
                arg3
                    类型:int
                    方式：InParameter currPage
                    用法:当前页
                arg4
                    类型:int
                    方式：InParameter pageSize
                    用法:页大小

    getContainsPrincipals
        用法:获取关联主体指定代码包含的相关主体列表
        返回值类型:java.util.ArrayList,说明:主体列表
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uacc.security.stub.IPrincipalsStub
                Rest-Command getContainsPrincipals
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter sysCode
                    用法:系统代码
                arg1
                    类型:java.lang.String
                    方式：InParameter principalColName
                    用法:主体集合名
                arg2
                    类型:java.lang.String
                    方式：InParameter relactionshipPrincipalColName
                    用法:关系主体表名
                arg3
                    类型:java.lang.String
                    方式：InParameter principalCode
                    用法:主体代码
                arg4
                    类型:int
                    方式：InParameter currPage
                    用法:当前页
                arg5
                    类型:int
                    方式：InParameter pageSize
                    用法:页大小

    getPrincipalCollection
        用法:获取指定主体表的定义
        返回值类型:java.util.ArrayList,说明:主体表
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uacc.security.stub.IPrincipalsStub
                Rest-Command getPrincipalCollection
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter sysCode
                    用法:系统代码
                arg1
                    类型:java.lang.String
                    方式：InParameter principalColName
                    用法:主体集合名


http://localhost:9090/uc/protectedObject.service
    cj.studio.backend.uacc.security.stub.IProtectedObjectStub
    用法:受保护对象

    getAllProtectedObjectCollection
        用法:获取受保护对象集合定义
        返回值类型:java.util.ArrayList,说明:对象集合列表
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uacc.security.stub.IProtectedObjectStub
                Rest-Command getAllProtectedObjectCollection
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter sysCode
                    用法:系统代码

    getChildObjects
        用法:获取子对象
        返回值类型:java.util.ArrayList,说明:对象列表
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uacc.security.stub.IProtectedObjectStub
                Rest-Command getChildObjects
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter sysCode
                    用法:系统代码
                arg1
                    类型:java.lang.String
                    方式：InParameter objColName
                    用法:对象集合名
                arg2
                    类型:java.lang.String
                    方式：InParameter parentObjCode
                    用法:父对象代码
                arg3
                    类型:int
                    方式：InParameter currPage
                    用法:当前页
                arg4
                    类型:int
                    方式：InParameter pageSize
                    用法:页大小

    getProtectedObjectCollection
        用法:获取受保护对象集合
        返回值类型:cj.studio.backend.uacc.security.ProtectedObjectCollection,说明:对象集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uacc.security.stub.IProtectedObjectStub
                Rest-Command getProtectedObjectCollection
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter sysCode
                    用法:系统代码
                arg1
                    类型:java.lang.String
                    方式：InParameter objColName
                    用法:对象集合名


http://localhost:9090/uc/tenant/post.service
    cj.studio.backend.uc.stub.ITenantPostStub
    用法:租户岗位存根

    pagePost
        用法:岗位分页
        返回值类型:java.util.ArrayList,说明:一页数
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantPostStub
                Rest-Command pagePost
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:int
                    方式：InParameter currPage
                    用法:当前页码
                arg2
                    类型:int
                    方式：InParameter pageSize
                    用法:页大小

    getPost
        用法:获取岗位
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantPostStub
                Rest-Command getPost
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter postCode
                    用法:岗位代码

    addPost
        用法:添加岗位
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantPostStub
                Rest-Command addPost
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter postCode
                    用法:岗位代码
                arg2
                    类型:java.lang.String
                    方式：InParameter postName
                    用法:岗位名
                arg3
                    类型:java.lang.String
                    方式：InParameter comment
                    用法:说明

    removePost
        用法:移除岗位
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantPostStub
                Rest-Command removePost
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter postCode
                    用法:岗位代码

    getAccountsOnPost
        用法:获取岗位下的账户
        返回值类型:java.util.ArrayList,说明:一页数
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantPostStub
                Rest-Command getAccountsOnPost
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter postCode
                    用法:岗位代码

    pageAccountsOnPost
        用法:获取岗位下的账户
        返回值类型:java.util.ArrayList,说明:一页数
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantPostStub
                Rest-Command pageAccountsOnPost
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter postCode
                    用法:岗位代码
                arg2
                    类型:int
                    方式：InParameter currPage
                    用法:当前页码
                arg3
                    类型:int
                    方式：InParameter pageSize
                    用法:页大小

    addAccountOnPost
        用法:添加一个岗位到指定账户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantPostStub
                Rest-Command addAccountOnPost
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户代码
                arg2
                    类型:java.lang.String
                    方式：InParameter postCode
                    用法:岗位代码

    removeAccountOnPost
        用法:移除指定岗位一个账户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantPostStub
                Rest-Command removeAccountOnPost
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户代码
                arg2
                    类型:java.lang.String
                    方式：InParameter postCode
                    用法:岗位代码

    emptyAccountsOnPost
        用法:清空指定岗位的账户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantPostStub
                Rest-Command emptyAccountsOnPost
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter postCode
                    用法:岗位代码


http://localhost:9090/uc/segment.service
    cj.studio.backend.uc.stub.ISegmentStub
    用法:信息段存根

    removeSegment
        用法:删除信息段
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ISegmentStub
                Rest-Command removeSegment
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:信息段编码

    emptyAttributesOfSegment
        用法:置空段的所有属性
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ISegmentStub
                Rest-Command emptyAttributesOfSegment
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:信息段编码

    getSegmentCount
        用法:获取段个数
        返回值类型:java.lang.Long,说明:返回段个数
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ISegmentStub
                Rest-Command getSegmentCount
        参数:

    removeAttribute
        用法:移除一个属性
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ISegmentStub
                Rest-Command removeAttribute
        参数:
                arg0
                    类型:java.lang.String
                    方式:InContent segCode
                    用法:信息段编码
                arg1
                    类型:java.lang.String
                    方式:InContent attrCode
                    用法:属性编码

    getPage
        用法:获取一页信息段
        返回值类型:java.util.ArrayList,说明:返回一页段
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ISegmentStub
                Rest-Command getPage
        参数:
                arg0
                    类型:int
                    方式:InContent currPage
                    用法:当前页位置
                arg1
                    类型:int
                    方式:InContent pageSize
                    用法:分页大小

    getSegment
        用法:获取信息段
        返回值类型:cj.studio.backend.uc.bo.Segment,说明:返回信息段
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ISegmentStub
                Rest-Command getSegment
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:信息段编码

    addSegment
        用法:添加信息段
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ISegmentStub
                Rest-Command addSegment
        参数:
                arg0
                    类型:cj.studio.backend.uc.bo.Segment
                    方式:InContent seg
                    用法:信息段实体，Json格式

    getAttributesOfSegment
        用法:获取段属性
        返回值类型:java.util.ArrayList,说明:属性集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ISegmentStub
                Rest-Command getAttributesOfSegment
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:信息段编码

    addAttribute
        用法:添加属性
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ISegmentStub
                Rest-Command addAttribute
        参数:
                arg0
                    类型:cj.studio.backend.uc.bo.Attribute
                    方式:InContent attr
                    用法:属性实体，Json格式


http://localhost:9090/uc/tenant/role.service
    cj.studio.backend.uc.stub.ITenantRoleStub
    用法:租户的角色存根

    page
        用法:获取一页角色
        返回值类型:java.util.ArrayList,说明:返回角色，Json格式
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantRoleStub
                Rest-Command page
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码
                arg1
                    类型:int
                    方式:InContent currPage
                    用法:当前页码
                arg2
                    类型:int
                    方式:InContent pageSize
                    用法:页大小

    addRole
        用法:添加角色
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantRoleStub
                Rest-Command addRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码
                arg2
                    类型:java.lang.String
                    方式：InParameter roleName
                    用法:角色名
                arg3
                    类型:java.lang.String
                    方式：InParameter comment
                    用法:角色描述

    removeRole
        用法:移除角色
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantRoleStub
                Rest-Command removeRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码

    getRole
        用法:获取角色
        返回值类型:cj.studio.backend.uc.bo.TenantRole,说明:返回角色
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantRoleStub
                Rest-Command getRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码

    getRoleCount
        用法:角色数
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantRoleStub
                Rest-Command getRoleCount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码

    emptyAccountsOnRole
        用法:清空角色上的账户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantRoleStub
                Rest-Command emptyAccountsOnRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码

    removeAccountOnRole
        用法:移除账户在角色
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantRoleStub
                Rest-Command removeAccountOnRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户代码
                arg2
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码

    addAccountOnRole
        用法:添加账户到角色
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantRoleStub
                Rest-Command addAccountOnRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户代码
                arg2
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码

    getAccountsOnRole
        用法:获取一页角色
        返回值类型:java.util.ArrayList,说明:返回角色，Json格式
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantRoleStub
                Rest-Command getAccountsOnRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户编码
                arg1
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码


http://localhost:9090/uc/password.service
    cj.studio.backend.uc.stub.IPasswordStub
    用法:密码服务

    setPassword
        用法:设置密码
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IPasswordStub
                Rest-Command setPassword
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter pwd
                    用法:用户密码

    updatePassword
        用法:更新密码
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IPasswordStub
                Rest-Command updatePassword
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter oldpwd
                    用法:旧密码
                arg2
                    类型:java.lang.String
                    方式：InParameter newpwd
                    用法:新密码


http://localhost:9090/uc/tenantToken.service
    cj.studio.backend.uc.stub.ITenantTokenStub
    用法:租户令牌生成存根

    genToken
        用法:生成令牌
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITenantTokenStub
                Rest-Command genToken
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenant
                    用法:租户
                arg1
                    类型:java.lang.String
                    方式：InParameter user
                    用法:申请者
                arg2
                    类型:java.lang.String
                    方式：InParameter pwd
                    用法:申请者密码
                arg3
                    类型:long
                    方式：InParameter ttlMillis
                    用法:令牌过期日期


http://localhost:9090/uc/tenant/account.service
    cj.studio.backend.uc.stub.IAccountStub
    用法:账户存根

    getAccountByAttrValue
        用法:按信息段及其属性值查询账户
        返回值类型:cj.studio.backend.uc.bo.Account,说明:返回用户，如果不存在则返回null
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command getAccountByAttrValue
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:信息段编码
                arg2
                    类型:java.lang.String
                    方式：InParameter attrCode
                    用法:属性编码
                arg3
                    类型:java.lang.String
                    方式：InParameter value
                    用法:属性值

    getAccount
        用法:获取账户
        返回值类型:cj.studio.backend.uc.bo.Account,说明:返回账户，如果不存在则返回null
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command getAccount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户

    listTenantRoleOfAccount
        用法:列出租户角色
        返回值类型:java.util.ArrayList,说明:集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command listTenantRoleOfAccount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户标识

    listTenantPostOfAccount
        用法:列出租户岗位
        返回值类型:java.util.ArrayList,说明:集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command listTenantPostOfAccount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户标识

    listTenantGroupOfAccount
        用法:列出租户群组
        返回值类型:java.util.ArrayList,说明:集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command listTenantGroupOfAccount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户标识

    listTenantOrganizationOfAccount
        用法:列出租户机构
        返回值类型:java.util.ArrayList,说明:集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command listTenantOrganizationOfAccount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户标识

    getAccountCount
        用法:返回账户数
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command getAccountCount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户

    getSegmentsOfAccount
        用法:获取账户的信息段
        返回值类型:java.util.ArrayList,说明:返回Json
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command getSegmentsOfAccount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户

    addSegmentOfAccount
        用法:添加账户的信息段
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command addSegmentOfAccount
        参数:
                arg0
                    类型:cj.studio.backend.uc.bo.AccountSegment
                    方式:InContent seg
                    用法:账户信息段

    removeSegmentOfAccount
        用法:移除账户的信息段
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command removeSegmentOfAccount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户
                arg2
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段号

    emptySegmentsOfAccount
        用法:清空账户的信息段
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command emptySegmentsOfAccount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户

    addAccountAttribute
        用法:添加账户的属性
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command addAccountAttribute
        参数:
                arg0
                    类型:cj.studio.backend.uc.bo.AccountAttribute
                    方式:InContent attr
                    用法:账户属性

    removeAccountAttribute
        用法:移除账户的属性
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command removeAccountAttribute
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户
                arg2
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段号
                arg3
                    类型:java.lang.String
                    方式：InParameter attrCode
                    用法:属性

    emptyAccountAttributes
        用法:清空账户指定段下的所有属性
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command emptyAccountAttributes
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户
                arg2
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段号

    getAccountAttributes
        用法:获取账户指定段下的所有属性
        返回值类型:java.util.ArrayList,说明:返回Json
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command getAccountAttributes
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户
                arg2
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段号

    listGlobalRoleOfAccount
        用法:列也全局角色
        返回值类型:cj.studio.backend.uc.bo.GlobalRole,说明:全局角色
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command listGlobalRoleOfAccount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户
                arg1
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户标识

    getPage
        用法:获取一页账户
        返回值类型:java.util.ArrayList,说明:返回一页账户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command getPage
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter tenantCode
                    用法:租户
                arg1
                    类型:int
                    方式：InParameter currPage
                    用法:当前页号
                arg2
                    类型:int
                    方式：InParameter pageSize
                    用法:页大小


http://localhost:9090/uc/token.service
    cj.studio.backend.uc.stub.ITokenStub
    用法:令牌存根。验证uc发放的令牌或解析它

    verify
        用法:验证是否是uc发放的令牌
        返回值类型:java.lang.Boolean,说明:验证结果
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITokenStub
                Rest-Command verify
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter token
                    用法:令牌

    parse
        用法:解析令牌
        返回值类型:java.util.HashMap,说明:结果
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.ITokenStub
                Rest-Command parse
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter token
                    用法:令牌



