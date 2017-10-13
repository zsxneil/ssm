# ssm
spring,springmvc,mybatis集成demo。这只是一个框架集成的demo，只测试了简单的必须的功能。使用的数据源是druid。可以通过网页监控数据源情况

集成swagger，可以通过swagger-ui自动生成接口文档，查看接口信息.
  修改swagger/index.html文件，默认是从连接http://petstore.swagger.io/v2/swagger.json获取 API 的 JSON，
  这里需要将url值修改为http://{ip}:{port}/{projectName}/api-docs的形式
  访问地址：http://{ip}:{port}/{projectName}/swagger/index.html
