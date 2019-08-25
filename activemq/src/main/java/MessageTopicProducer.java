import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Message;



public class MessageTopicProducer {

    //定义ActivMQ的连接地址
    private static final String ACTIVEMQ_URL = "tcp://127.0.0.1:61616";
    //定义发送消息的主题名称
    private static final String TOPIC_NAME = "MyTopicMessage";

    public static void main(String[] args) throws Exception {
        //创建连接工厂
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
        //创建连接
        Connection connection = activeMQConnectionFactory.createConnection();
        //打开连接
        connection.start();
        //创建会话
        javax.jms.Session session = connection.createSession(false, javax.jms.Session.AUTO_ACKNOWLEDGE);
        //创建队列目标
        Destination destination = session.createTopic(TOPIC_NAME);
        //创建一个生产者
        javax.jms.MessageProducer producer = session.createProducer(destination);
        //创建模拟100个消息
        for (int i = 1; i <= 100; i++) {
            Properties prop = new Properties();
            prop.setProperty("mail.host", "smtp.exmail.qq.com");
            prop.setProperty("mail.transport.protocol", "smtp");
            prop.setProperty("mail.smtp.auth", "true");
            //使用JavaMail发送邮件的5个步骤
            //1、创建session
            javax.mail.Session session1 = javax.mail.Session.getInstance(prop);
            //开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
            session1.setDebug(true);
            //2、通过session得到transport对象
            Transport ts = session1.getTransport();
            //3、使用邮箱的用户名和密码连上邮件服务器，发送邮件时，发件人需要提交邮箱的用户名和密码给smtp服务器，用户名和密码都通过验证之后才能够正常发送邮件给收件人。
            ts.connect("smtp.exmail.qq.com", "lipengliang@sinosoft.com.cn", "lplLPL123");
            //4、创建邮件
            Message message = createSimpleMail(session1);
            //5、发送邮件
            ts.sendMessage(message, message.getAllRecipients());
            ts.close();
           //===============================
            TextMessage message1;
            message1 = session.createTextMessage("当前message是(主题模型):" + i);
//            message1 = session.createTextMessage(ts.sendMessage(message, message.getAllRecipients()));
            //发送消息

            producer.send(message1);
            //在本地打印消息
            System.out.println("我现在发的消息是：" + message1.getText());
        }
        //关闭连接
        connection.close();
    }
    public static MimeMessage createSimpleMail(Session session)
            throws Exception {
        //创建邮件对象
        MimeMessage message = new MimeMessage(session);
        //指明邮件的发件人
        message.setFrom(new InternetAddress("lipengliang@sinosoft.com.cn"));
        //指明邮件的收件人，现在发件人和收件人是一样的，那就是自己给自己发
        message.setRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress("facerisk@sina.com"));
        //邮件的标题
        message.setSubject("只包含文本的简单邮件");
        //邮件的文本内容
        message.setContent("你好啊！", "text/html;charset=UTF-8");
        //返回创建好的邮件对象
        return message;
    }
}
