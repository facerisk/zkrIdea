1.IDEA web��Ŀ����ʧ�ܣ��࿴����̨����ʵ���Ƕ˿����⡣��������������

2.maven�Զ�������applicationContext.xml������quartz,����schedle�������汾���ܸ���2.0��������뱨�����£�

https://www.cnblogs.com/shizhijie/p/8243934.html

��Ҫ�����jar��, �����ǲ���maven��dependency����; ���û��ʹ��maven, ���Զ����������jar����ͼһһ��������. 
����Ψһ��Ҫע��ľ���, ���ʹ��spring 3.1���µİ汾, quartz����Ҫ��Ӧ��2.0���°汾, 
����ᵼ�� org.springframework.beans.factory.CannotLoadBeanClassException: 
Error loading class [org.springframework.scheduling.quartz.CronTriggerBean] for bean with name 'cronTrigger_1' 
defined in file [E:\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\git-common\WEB-INF\classes\applicationContext.xml]: 
problem with class file or dependent class; nested exception isjava.lang.IncompatibleClassChangeError:
class org.springframework.scheduling.quartz.CronTriggerBean has interface org.quartz.CronTrigger as super class ����.
