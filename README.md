# Bee-MOM-MES
Industrial Digital Architecture Project.About MOM/MES system, industrial big data, industrial private cloud, DevIndOps, blockchain

## Doc

### 0.目标

工业生产一体化管理系统的设计与实现——基于区块链、人工智能和大数据技术的工业云平台

基于ArchiMate和TOGAF进行工业云平台架构，抽象通用逻辑中台，维护复杂定制化业务。

对工艺管理，生产管理，生产排期，生产质量管理，生产物流管理，设备管理，实现人机料法环测一体，基于区块链，把零售和生产串起来，以达到产品防伪，质量追踪，数据透明。

预期 实现工业云，和基本的MOM软件，整合区块链技术，实现数据透明，并基于大数据技术，赋能工业，打造数据资产，实现数据和业务双轮驱动。

#### 工作计划

一个月准备启动输出PRD和CI环境，ddl：2023-11-6；

一个月准备后端输出coding，ddl：2023-12-6；

一个月准备云输出上云脚本和自动化运维脚本，ddl：2024-1-6；

一个月准备大数据生态，ddl：2024-2-6；

一个月准备排程算法，ddl：2024-4-6；

一个月准备前端，ddl：2024-5-6。

### 1.毕设文档

毕设的过程文档，包括开题、中期答辩等报告文档，

### 2. 其他文档
etc...

## code

### 目录结构规范

- VO（View Object）：显示层对象。
- DTO（Data Transfer Object）：数据传输对象。
- BO（Business Object）：业务对象，内部业务对象。
- PO（Persistent Object）：持久化对象
- Controller：主要是对外部访问控制进行转发，各类基本参数校验，或者不复用的业务简单处理等。
- FeignClient：由于微服务之间存在互相调用，这里是内部请求的接口。
- FeignController：主要是对内部访问控制进行转发，各类基本参数校验，或者不复用的业务简单处理等。
- Service 层：相对具体的业务逻辑服务层。
- Manager 层：通用业务处理层，它有如下特征：
  - 1） 对第三方平台封装的层，预处理返回结果及转化异常信息，适配上层接口。
  - 2） 对 Service 层通用能力的下沉，如缓存方案、中间件通用处理。
  - 3） 与 DAO 层交互，对多个 DAO 的组合复用。
- DAO（Data Access Object）：数据访问对象。
- Listener：监听 `RabbitMQ` 进行处理

### 目录结构

```sh
# etc...
```

### 技术选型

#### 后端技术

| 技术                   | 说明             | 官网                                             |
| ---------------------- | ---------------- | ------------------------------------------------ |
| Spring Cloud           | 微服务框架       | https://spring.io/projects/spring-cloud          |
| Spring Cloud Alibaba   | 微服务框架       | https://github.com/alibaba/spring-cloud-alibaba  |
| Spring Boot            | 容器+MVC框架     | https://spring.io/projects/spring-boot           |
| Spring Security Oauth2 | 认证和授权框架   | https://spring.io/projects/spring-security-oauth |
| MyBatis                | ORM框架          | http://www.mybatis.org/mybatis-3/zh/index.html   |
| Mybatis Plus           | ORM框架增强      | https://baomidou.com/                            |
| Easy Code              | 数据层代码生成   | https://github.com/makejavas/EasyCode            |
| Knife4j                | 文档生产工具     | https://github.com/xiaoymin/swagger-bootstrap-ui |
| RabbitMq               | 消息队列         | https://www.rabbitmq.com/                        |
| Redis                  | 分布式缓存       | https://redis.io/                                |
| Docker                 | 应用容器引擎     | https://www.docker.com/                          |
| Druid                  | 数据库连接池     | https://github.com/alibaba/druid                 |
| MinIO                  | 对象存储         | https://github.com/minio/minio                   |
| JWT                    | JWT登录支持      | https://github.com/jwtk/jjwt                     |
| Lombok                 | 简化对象封装工具 | https://github.com/rzwitserloot/lombok           |
| Jenkins                | 自动化部署工具   | https://github.com/jenkinsci/jenkins             |
| Kubernetes             | 应用容器管理平台 | https://kubernetes.io/                           |

#### 前端技术

etc...

### 开发工具

| 工具                 | 说明                | 官网                                                  |
| -------------------- | ------------------- | ----------------------------------------------------- |
| IDEA                 | 开发IDE             | https://www.jetbrains.com/idea/download               |
| RedisDesktop         | redis客户端连接工具 | https://github.com/qishibo/AnotherRedisDesktopManager |
| X-shell              | Linux远程连接工具   | http://www.netsarang.com/download/software.html       |
| Navicat              | 数据库连接工具      | http://www.formysql.com/xiazai.html                   |
| PowerDesigner        | 数据库设计工具      | http://powerdesigner.de/                              |
| MindMaster           | 思维导图设计工具    | http://www.edrawsoft.cn/mindmaster                    |
| ProcessOn            | 流程图绘制工具      | https://www.processon.com/                            |
| Draw.io              | UML绘制工具         | https://app.diagrams.net/                             |
| Enterprise Architect | TOGAF架构工具       | https://sparxsystems.com/products/ea/                 |
| Archi                | AchiMate架构工具    | https://www.archimatetool.com/                        |
| PicPick              | 图片处理工具        | https://picpick.app/zh/                               |
| Snipaste             | 屏幕截图工具        | https://www.snipaste.com/                             |
| Postman              | API接口调试工具     | https://www.postman.com/                              |
| Typora               | Markdown编辑器      | https://typora.io/                                    |

### 开发环境

| 工具     | 版本号 | 下载                                                         |
| -------- | ------ | ------------------------------------------------------------ |
| JDK      | 17     | https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html |
| MySQL    | 8.0.23 | https://www.mysql.com/                                       |
| Redis    | 7.0    | https://redis.io/download                                    |
| RabbitMq | 3.10.5 | http://www.rabbitmq.com/download.html                        |
| nginx    | 1.22   | http://nginx.org/en/download.html                            |

etc...

# 补充
welcome to join us(https://www.yuque.com/xyong-9fuoz/hg8kgr/lg625y278c2f60sd).
etc...