
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
http://localhost:9090/uc/authentication.service
    cj.studio.backend.uc.stub.IAuthenticationStub
    用法:身份认证服务

    enumAuthenticatorNames
        用法:列出支持的认证器名
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAuthenticationStub
                Rest-Command enumAuthenticatorNames
        参数:

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

    authenticate
        用法:认证指定主体的身份
        方法别名:
        命令:post
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
                    方式：InParameter principals
                    用法:要认证的主体，可以是用户名，也可是令牌(如果是令牌：结合password以认证令牌是密码持有者的）
                arg2
                    类型:java.lang.String
                    方式：InParameter password
                    用法:密码
                arg3
                    类型:java.util.Map
                    方式:InContent props
                    用法:属性，可以为空


http://localhost:9090/uc/role.service
    cj.studio.backend.uc.stub.IRoleStub
    用法:角色存根

    getUsersOnRole
        用法:获取一页角色
        返回值类型:java.util.ArrayList,说明:返回角色，Json格式
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IRoleStub
                Rest-Command getUsersOnRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码

    getRolesOnUser
        用法:获取用户的所有角色
        返回值类型:java.util.ArrayList,说明:角色集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IRoleStub
                Rest-Command getRolesOnUser
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户代码

    getRolesOnOrgMember
        用法:获取机构成员的所有角色
        返回值类型:java.util.ArrayList,说明:角色集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IRoleStub
                Rest-Command getRolesOnOrgMember
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码
                arg2
                    类型:java.lang.String
                    方式：InParameter appCode
                    用法:应用代码

    getPage
        用法:获取一页角色
        返回值类型:java.util.ArrayList,说明:返回角色，Json格式
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IRoleStub
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

    getRole
        用法:获取角色
        返回值类型:cj.studio.backend.uc.bo.Role,说明:返回角色
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IRoleStub
                Rest-Command getRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码

    addRole
        用法:添加角色
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IRoleStub
                Rest-Command addRole
        参数:
                arg0
                    类型:cj.studio.backend.uc.bo.Role
                    方式:InContent role
                    用法:角色

    removeRole
        用法:移除角色
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IRoleStub
                Rest-Command removeRole
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
                Rest-StubFace cj.studio.backend.uc.stub.IRoleStub
                Rest-Command getRoleCount
        参数:

    addUserOnRole
        用法:添加用户到角色
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IRoleStub
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
                Rest-StubFace cj.studio.backend.uc.stub.IRoleStub
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
                Rest-StubFace cj.studio.backend.uc.stub.IRoleStub
                Rest-Command emptyUsersOnRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码

    getOrgMembersOnRole
        用法:获取角色上的机构成员
        返回值类型:java.util.ArrayList,说明:返回机构成员，Json格式
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IRoleStub
                Rest-Command getOrgMembersOnRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码
                arg1
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码

    addOrgMemberOnRole
        用法:添加机构成员到角色
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IRoleStub
                Rest-Command addOrgMemberOnRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码
                arg2
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码

    removeOrgMemberOnRole
        用法:移除角色上的机构成员
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IRoleStub
                Rest-Command removeOrgMemberOnRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户代码
                arg1
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码
                arg2
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码

    emptyOrgMembersOnRole
        用法:清空角色上的所有机构成员
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IRoleStub
                Rest-Command emptyOrgMembersOnRole
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码
                arg1
                    类型:java.lang.String
                    方式：InParameter roleCode
                    用法:角色代码


http://localhost:9090/uc/user.service
    cj.studio.backend.uc.stub.IUserStub
    用法:用户存根

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
                    用法:用户对象

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


http://localhost:9090/uc/application.service
    cj.studio.backend.uc.stub.IApplicationStub
    用法:应用存根

    getPage
        用法:获取一页
        返回值类型:java.util.ArrayList,说明:返回
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IApplicationStub
                Rest-Command getPage
        参数:
                arg0
                    类型:int
                    方式:InContent currPage
                    用法:当前页
                arg1
                    类型:int
                    方式:InContent pageSize
                    用法:页大小

    addApp
        用法:添加app
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IApplicationStub
                Rest-Command addApp
        参数:
                arg0
                    类型:cj.studio.backend.uc.bo.Application
                    方式:InContent app
                    用法:应用实例，json

    getApp
        用法:获取app
        返回值类型:cj.studio.backend.uc.bo.Application,说明:返回应用
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IApplicationStub
                Rest-Command getApp
        参数:
                arg0
                    类型:java.lang.String
                    方式:InContent appCode
                    用法:应用编码

    removeApp
        用法:移除app
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IApplicationStub
                Rest-Command removeApp
        参数:
                arg0
                    类型:java.lang.String
                    方式:InContent appCode
                    用法:应用编码

    getAppCount
        用法:获取应用数
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IApplicationStub
                Rest-Command getAppCount
        参数:

    getSegmentsOfApp
        用法:获取应用的信息段
        返回值类型:java.util.ArrayList,说明:返回
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IApplicationStub
                Rest-Command getSegmentsOfApp
        参数:
                arg0
                    类型:java.lang.String
                    方式:InContent appCode
                    用法:应用编码

    addSegmentOfApp
        用法:为应用添加扩展信息段
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IApplicationStub
                Rest-Command addSegmentOfApp
        参数:
                arg0
                    类型:cj.studio.backend.uc.bo.AppSegment
                    方式:InContent seg
                    用法:信息段

    removeSegmentOfApp
        用法:移除应用指定关联的信息段
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IApplicationStub
                Rest-Command removeSegmentOfApp
        参数:
                arg0
                    类型:java.lang.String
                    方式:InContent appCode
                    用法:应用编码
                arg1
                    类型:java.lang.String
                    方式:InContent segCode
                    用法:信息段编码

    emptySegmentsOfApp
        用法:清空该应用的信息段
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IApplicationStub
                Rest-Command emptySegmentsOfApp
        参数:
                arg0
                    类型:java.lang.String
                    方式:InContent appCode
                    用法:应用编码

    addAppAttribute
        用法:添加用户属性
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IApplicationStub
                Rest-Command addAppAttribute
        参数:
                arg0
                    类型:cj.studio.backend.uc.bo.AppAttribute
                    方式:InContent attr
                    用法:应用属性

    removeAppAttribute
        用法:移除应用下指定的属性
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IApplicationStub
                Rest-Command removeAppAttribute
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter appCode
                    用法:应用代码
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段代码
                arg2
                    类型:java.lang.String
                    方式：InParameter attrCode
                    用法:属性代码

    emptyAppAttributes
        用法:清空应用下的属性
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IApplicationStub
                Rest-Command emptyAppAttributes
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter appCode
                    用法:应用代码
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段代码

    getAppAttributes
        用法:清空应用下的属性
        返回值类型:java.util.ArrayList,说明:应用的属性
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IApplicationStub
                Rest-Command getAppAttributes
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter appCode
                    用法:应用代码
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段代码


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
        返回值类型:java.util.ArrayList,说明:对象集合
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


http://localhost:9090/uc/organization.service
    cj.studio.backend.uc.stub.IOrganizationStub
    用法:机构存根

    getPage
        用法:获取一页机构
        返回值类型:java.util.ArrayList,说明:返回机构集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IOrganizationStub
                Rest-Command getPage
        参数:
                arg0
                    类型:int
                    方式：InParameter currPage
                    用法:当前页码
                arg1
                    类型:int
                    方式：InParameter pageSize
                    用法:页大小

    getOrganization
        用法:获取机构
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IOrganizationStub
                Rest-Command getOrganization
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码

    addOrganization
        用法:添加机构
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IOrganizationStub
                Rest-Command addOrganization
        参数:
                arg0
                    类型:cj.studio.backend.uc.bo.Organization
                    方式:InContent org
                    用法:机构json

    removeOrganization
        用法:移除机构
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IOrganizationStub
                Rest-Command removeOrganization
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码

    getOrganizationCount
        用法:获取机构数
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IOrganizationStub
                Rest-Command getOrganizationCount
        参数:

    getSegmentsOfOrganization
        用法:获取机构信息段
        返回值类型:java.util.ArrayList,说明:返回机构段集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IOrganizationStub
                Rest-Command getSegmentsOfOrganization
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码

    addSegmentOfOrganization
        用法:添加机构信息段
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IOrganizationStub
                Rest-Command addSegmentOfOrganization
        参数:
                arg0
                    类型:cj.studio.backend.uc.bo.OrgSegment
                    方式:InContent seg
                    用法:机构信息段json

    removeSegmentOfOrganization
        用法:移除机构信息段
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IOrganizationStub
                Rest-Command removeSegmentOfOrganization
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段代码

    emptySegmentsOfOrganization
        用法:清空机构下的所有信息段
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IOrganizationStub
                Rest-Command emptySegmentsOfOrganization
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码

    addOrganizationAttribute
        用法:添加机构属性
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IOrganizationStub
                Rest-Command addOrganizationAttribute
        参数:
                arg0
                    类型:cj.studio.backend.uc.bo.OrgAttribute
                    方式:InContent attr
                    用法:机构属性json

    removeOrganizationAttribute
        用法:移除机构属性
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IOrganizationStub
                Rest-Command removeOrganizationAttribute
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段代码
                arg2
                    类型:java.lang.String
                    方式：InParameter attrCode
                    用法:属性代码

    emptyOrganizationAttributes
        用法:清空机构信息段下的所有属性
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IOrganizationStub
                Rest-Command emptyOrganizationAttributes
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段代码

    getOrganizationAttributes
        用法:获取机构属性
        返回值类型:java.util.ArrayList,说明:返回属性集合
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IOrganizationStub
                Rest-Command getOrganizationAttributes
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段代码

    addOrgMember
        用法:添加机构成员
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IOrganizationStub
                Rest-Command addOrgMember
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter appCode
                    用法:应用代码
                arg1
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户代码
                arg2
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码

    removeOrgMember
        用法:移除机构成员
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IOrganizationStub
                Rest-Command removeOrgMember
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter appCode
                    用法:应用代码
                arg1
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户代码
                arg2
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码

    emptyOrgMembers
        用法:清空机构成员
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IOrganizationStub
                Rest-Command emptyOrgMembers
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter appCode
                    用法:应用代码
                arg1
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码

    getOrgMembers
        用法:获取机构成员
        返回值类型:java.util.ArrayList,说明:返回成员列表
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IOrganizationStub
                Rest-Command getOrgMembers
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter appCode
                    用法:应用代码
                arg1
                    类型:java.lang.String
                    方式：InParameter orgCode
                    用法:机构代码

    getOrganizationsOfUser
        用法:获取机构成员
        返回值类型:java.util.ArrayList,说明:返回机构列表
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IOrganizationStub
                Rest-Command getOrganizationsOfUser
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter appCode
                    用法:应用代码
                arg1
                    类型:java.lang.String
                    方式：InParameter userCode
                    用法:用户代码


http://localhost:9090/uc/segment.service
    cj.studio.backend.uc.stub.ISegmentStub
    用法:信息段存根

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


http://localhost:9090/uc/account.service
    cj.studio.backend.uc.stub.IAccountStub
    用法:账户存根

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
                    类型:int
                    方式：InParameter currPage
                    用法:当前页号
                arg1
                    类型:int
                    方式：InParameter pageSize
                    用法:页大小

    addAccount
        用法:添加账户
        方法别名:
        命令:post
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command addAccount
        参数:
                arg0
                    类型:cj.studio.backend.uc.bo.Account
                    方式:InContent account
                    用法:账户

    removeAccount
        用法:移除账户
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command removeAccount
        参数:
                arg0
                    类型:java.lang.String
                    方式：InParameter accountCode
                    用法:账户

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
                    方式：InParameter accountCode
                    用法:账户

    getAccountCount
        用法:返回账户数
        方法别名:
        命令:get
        协议:http/1.1
        Rest Header:
                Rest-StubFace cj.studio.backend.uc.stub.IAccountStub
                Rest-Command getAccountCount
        参数:

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
                    方式：InParameter accountCode
                    用法:账户
                arg1
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
                    方式：InParameter accountCode
                    用法:账户
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段号
                arg2
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
                    方式：InParameter accountCode
                    用法:账户
                arg1
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
                    方式：InParameter accountCode
                    用法:账户
                arg1
                    类型:java.lang.String
                    方式：InParameter segCode
                    用法:段号

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


http://localhost:9090/uc/password.service
    cj.studio.backend.uc.stub.IPasswordStub
    用法:密码服务

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



