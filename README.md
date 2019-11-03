# 项目中接入 flyway 的几种方式
> flyway 5.x 版本

## 第一种方式
使用 FlywayConfiguration + FlywayTest
数据库配置信息写在 yml 文件中
在 FlywayConfiguration 中调用修复和迁移方法，启动默认执行
调用 FlywayTest 中的方法进行数据更新及其其他操作

## 第二种方式
使用脚本进行处理
flyway-6.0.7-mac 脚本存放位置

## 第三种方式(不推荐)
使用 pom.xml
数据库信息配置写在 pom.xml 文件中，
可以使用 plugin 插件进行数据更新操作

## 第四种方式(炒鸡不推荐)
使用 FlywayConfiguration + FlywayDBController + FlywayDBServiceImpl + IFlywayDBService
数据库配置信息写在 yml 文件中
调用 接口 中的方法进行数据更新操作

## 第五种方式
自己开发 idea 插件进行封装操作


<hr>

写的不好的地方还请大伙多多包涵哈~
要是能帮忙指出更是十分感谢了！
要是有写得不清不楚的地方，也欢迎小伙伴们来交流呀~

![](wechat.png)

博客原文地址：https://blog.csdn.net/QAC_Boy/article/details/102692055
