1.IDEA web项目启动失败：多看控制台，其实都是端口问题。。。。。。。。

2.maven自动依赖，applicationContext.xml中配置quartz,但是schedle包依赖版本不能高于2.0，否则编译报错，如下：

https://www.cnblogs.com/shizhijie/p/8243934.html

需要引入的jar包, 这里是采用maven的dependency依赖; 如果没有使用maven, 可以对照着上面的jar包截图一一进行下载. 
这里唯一需要注意的就是, 如果使用spring 3.1以下的版本, quartz就需要相应的2.0以下版本, 
否则会导致 org.springframework.beans.factory.CannotLoadBeanClassException: 
Error loading class [org.springframework.scheduling.quartz.CronTriggerBean] for bean with name 'cronTrigger_1' 
defined in file [E:\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\git-common\WEB-INF\classes\applicationContext.xml]: 
problem with class file or dependent class; nested exception isjava.lang.IncompatibleClassChangeError:
class org.springframework.scheduling.quartz.CronTriggerBean has interface org.quartz.CronTrigger as super class 错误.
