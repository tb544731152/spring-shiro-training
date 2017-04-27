#用户名 admin 密码 test


# Spring Shiro学习系统

## 简介
基于springmvc、spring、mybatis-plus、shiro、easyui、Log4j2简单实用的权限系统。

界面基于EasyUI，图标采用较为开放的`Foundation Icon`(MIT协议)。

`文档vs思维导图`：[开源项目spring-shiro-training思维导图，让项目不再难懂](https://my.oschina.net/u/3080373/blog/875697)

`代码生成详见`：[src/test/java/com/wangzhixuan/generator/MysqlGenerator](http://git.oschina.net/wangzhixuan/spring-shiro-training/tree/master/src/test/java/com/wangzhixuan/generator)

`ueditor`: https://shiro.dreamlu.net/static/ueditor/index.html

## 技术和功能
> Spring-cache

> Spring-data-redis

> Spring-Task

> Shiro

> Spring-cache-shiro

> maven profile多环境配置

> 权限管理

> 角色管理

> 用户管理

> 部门管理

> 登陆日志

> 图标管理

## 学习vs开发
项目导入请百度`eclipse`、`myeclipse`、`idea`等IDE导入`maven web`项目。

项目启动可采用内置jetty maven plugin，`mvn jerry:run`！

你需要根据自己的业务添加`shiro注解`，实现请求控制。

如果觉得数据校验不够，请自行添加`hibernate-validator`在Bean上做校验！

更多`shiro`的教程请参考（开涛博客`《跟我学Shiro》`）：http://jinnianshilongnian.iteye.com/category/305053

另外欢迎`Pull Requests`，和我们一起完善该项目！

## 运行环境
`jdk7 + tomcat7`或以上！

采用`maven profile`配置线下`dev`和线上`production`环境，默认读取`src\main\conf\dev`开发环境下的配置文件。

线上环境使用`mvn`run、打包时添加`-Pproduction`变量则会使用`src/main/conf/production`目录下的配置文件。

线上`production`请注意添加一份`cofing/application.properties`配置文件（由于开源，使用`.gitignore`进行了屏蔽）

## 说明
`Webhook`是结合`osc@git`[Webhook功能](http://git.mydoc.io/?t=83172)开发的项目自动更新打包部署功能！

如果不需要该功能可以删除`event`目录和`controller`目录下的`WebHooks`相关java文件！

## 效果图
<p>
<img src="http://static.oschina.net/uploads/img/201512/06161620_HLY6.jpg"/>
</p>
<p>
<img src="http://static.oschina.net/uploads/img/201512/06161621_NIlr.jpg"/>
</p>
<p>
<img src="http://static.oschina.net/uploads/img/201512/06161621_63ZV.jpg"/>
</p>
<p>
<img src="http://static.oschina.net/uploads/img/201512/06164718_18nx.jpg"/>
</p>
<p>
<img src="http://static.oschina.net/uploads/img/201512/06161621_NiiM.jpg"/>
</p>

## License

( The MIT License )