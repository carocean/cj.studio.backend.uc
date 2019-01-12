
# uc

## 用户中心

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
http://localhost:9090/uc/segment.service
    cj.studio.backend.uc.stub.ISegmentStub
    用法:信息段存根

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


http://localhost:9090/uc/user.service
    cj.studio.backend.uc.stub.IUserStub
    用法:用户存根

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
                    用法:用法编码

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


