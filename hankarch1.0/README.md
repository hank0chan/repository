# Hank Architecture Explore (hankarch-1.0)
#### （也是之前分享的architecture-of-web-chats通用开发范例的一个总结）
## 基于Maven管理工具和Spring、SpringMVC、Mybatis框架的web应用开发架构用例

### Spring管理整个项目，对数据库如dataSource等通过配置方式管理Beans；对业务层通过XML配置方式管理Beans。
### SpringMVC在Controller层通过注解方式管理。
### Mybatis采用原来开发方式，通过定义一个MybatisRepository抽象类对Mybatis进行封装，并且提供泛型的CRUD方法。由其子类DataRepository继承，子类同时实现抽象类的一个抽象无参方法init(),在该方法中调用父类的init()有参方法，该init()有参方法的形参就是需要使用到的实体类对象。
### 通过JSON支持，对外只提供API接口。客户端浏览器通过ajax调用等获取JSON数据

## 整个项目主要由父pom项目、jar包项目和war包web项目组成。
### 具体划分情况：
#### hankarch-parent: 父pom.xml项目，只负责管理jar包依赖关系（pom）
#### hankarch-web: web应用项目，对外提供接口（war包项目） 
#### hankarch-portal: 前端项目 
#### hankarch-util: 自定义工具类（jar包项目） 
#### hankarch-common: 自定义公共类（jar包项目） 
#### hankarch-data: 数据实体类及对应的Mapper接口和Mapper配置文件（jar包项目） 
#### hankarch-mybatis: Mybatis封装类，采用原始开发方式（jar包项目） 
#### hankarch-service: 业务层接口类（jar包项目） 
#### hankarch-module-1（如：hankarch-user）: 业务层接口实现类，作为一个子模块-1项目（jar包项目） 
#### hankarch-module-2（如：hankarch-article）: 业务层接口实现类，作为一个子模块-2项目（jar包项目），以此类推！
