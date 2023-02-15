

### application

这个 module 主要用于测试 jsp 和 servlet

```shell
# 启动项目
./gradlew application:appRun
# 首页
curl http://localhost:8888/mflyyou
# 测试 hello world servlet
curl http://localhost:8888/mflyyou/hello
# 添加人
http://localhost:8888/mflyyou/register.jsp
# 展示已添加的人
http://localhost:8888/mflyyou/showAllPersons.jsp
```



## html

这个启动用于测试 jsonp 和 cors

```shell
./gradlew html:appRun
```





## Jetty 与 Java EE 的版本对应

Jetty maintains the following versions (currently)

| Jetty      | Servlet     | EE           | Namespace         |
| ---------- | ----------- | ------------ | ----------------- |
| Jetty 10.x | Servlet 4.0 | Jakarta EE 8 | `javax.servlet`   |
| Jetty 11.x | Servlet 5.0 | Jakarta EE 9 | `jakarta.servlet` |

```groovy
compileOnly group: 'jakarta.servlet', name: 'jakarta.servlet-api', version: '6.0.0'
```

