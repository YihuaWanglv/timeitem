# itimes 开发计划与进度记录

## [todo]

- 聚合报表展示
- group团队功能
- 报表下载
- 加入针对资源级别的认证
- 如果nginx静态文件无法实现，则考虑改用war包的方式

## [done]
【2016.05.05】report模块前后台技术框架大致调通
【2016.03.22】- 在虚拟机linux上完成nginx的部署
【2016.03.21】- 在虚拟机linux上部署环境和项目
【2016.03.17】- 优化item列表内容
【2016.03.17】- 分开dev和pro环境代码，包括代码和打包编译等
【2016.03.17】- nginx 实现负载均衡、反向代理和静态文件缓存
【2016.03.17】- add nginx
【2016.03.16】- 界面上添加时间字段
【2016.03.16】- 全站细节完善
【2016.03.14】- item页，编辑功能实现
【2016.03.11】- #fff8e7（cosmic Latte）
【2016.03.04】- 邮件激活功能
【2016.03.03】- 添加发送邮件模块，mq模块
【2016.03.02】- 使用redis消息队列作为mq模块
【2016.02.28】巨幕首页
【2016.02.28】- 注册后台功能，并接入前台界面，完成注册功能
【2016.02.26】更换密码加密算法，强化安全
【2016.02.26】跨域session共享实现
【2016.02.24】- redis集成，分布式session共享
    https://github.com/alexxiyang/shiro-redis.git
【2016.02.23】- 密码加密
【2016.02.23】- 配置页面，完善
【2016.02.22】- item页，下一页从加载下一页，改为读取下一页再粘贴再上一页下面
【2016.02.22】- item页，删除功能修复
【2016.02.21】- 注册页，开发 - ok
【2016.02.20】- 使用aop或注解的方式实现清空或重载缓存
【2016.02.20】- Item列表首页的展示和实现
【2016.02.20】- http://www.htmleaf.com/jQuery/Menu-Navigation/201601082998.html
【2016.01.24】bower install --save angular-ui-utils
【2016.01.20】- 登录后保存用户id到session
【2016.01.20】- 使用mysql jdbcRealm替换原来的propertiesRealm
    + http://www.iyujian.me/java/shiro-custom-realm-of-authorizing-realm.html
【2016.01.19】- 页面模块：Location、Tags
【2016.01.19】project模块完成
【2016.01.13】- 引入登录认证框架
    + git clone https://github.com/boyazuo/shiro-spring-boot.git
    + http://www.cnblogs.com/LZYY/p/4678749.html
    + http://blog.csdn.net/jadyer/article/details/12208847
    + http://blog.csdn.net/qiuqiupeng/article/details/38984779
    + http://www.infoq.com/cn/articles/apache-shiro
    + http://stackoverflow.com/questions/25241801/how-to-configure-shiro-with-spring-boot
    + http://shiro.apache.org/spring.html
    + https://github.com/qiuqiupeng/wf/blob/master/src/main/java/me/leep/wf/services/system/impl/ShiroRealmImpl.java
    + https://www.ibm.com/developerworks/cn/java/j-lo-shiro/
【2016.01.13】加入精美登录页面
【2016.01.12】加入shiro实现简单页面登录
【2016.01.11】- 定时mvc接口，引入angularjs作为前端应用框架，并实现Item和Category模块的雏形
【2016.01.11】- 使用mybatis配置文件映射实现复杂查询
【2016.01.10】- 定义模型和服务接口，并实现service层业务逻辑
【2016.01.09】- 引入dubbo实现分布式服务和服务的垂直拆分
【2016.01.08】- 使用maven构建项目模块组织
【2016.01.07】- 引入Spring Data jpa和mybatis
【2016.01.06】- 初始项目搭建，使用spring boot搭建初始项目

