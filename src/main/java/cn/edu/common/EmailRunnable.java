package cn.edu.common;

import cn.edu.bean.Patient;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.messaging.MessagingException;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.internet.MimeMessage;

/**
 * @author Devin
 * @description 发送邮件通知工具
 * @create 2019/10/7
 */
public class EmailRunnable implements Runnable {
    private Patient patient;
    private JavaMailSender javaMailSender;
    private TemplateEngine tpatientlateEngine;
    private String emailAddress;

    public EmailRunnable(Patient patient,
                         JavaMailSender javaMailSender,
                         TemplateEngine tpatientlateEngine,String emailAddress) {
        this.patient = patient;
        this.javaMailSender = javaMailSender;
        this.tpatientlateEngine = tpatientlateEngine;
        this.emailAddress = emailAddress;
    }
    @Override
    public void run() {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo(patient.getEmail());
            helper.setFrom(emailAddress);
            helper.setSubject("消息邮件通知");
            Context ctx = new Context();
            ctx.setVariable("name", patient.getName());
            ctx.setVariable("workID", patient.getWorkID());
            ctx.setVariable("contractTerm", patient.getContractTerm());
            ctx.setVariable("beginContract", patient.getBeginContract());
            ctx.setVariable("endContract", patient.getEndContract());
            ctx.setVariable("departmentName", patient.getDepartmentName());
            ctx.setVariable("posName", patient.getPosName());
            String mail = tpatientlateEngine.process("email.html", ctx);
            helper.setText(mail, true);
            javaMailSender.send(message);
        } catch (MessagingException e) {
            System.out.println("发送失败");
        } catch (javax.mail.MessagingException e) {
            e.printStackTrace();
        }
    }
}
