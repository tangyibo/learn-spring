package io.gitee.inrgihc.mail.controller;

import java.io.File;
import java.util.ArrayList;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import io.gitee.inrgihc.mail.service.MailService;

@RestController
public class TestController {

	@Autowired
	private MailService mailService;

	@Autowired
	private TemplateEngine templateEngine;

	@GetMapping("/")
	public String index() throws MessagingException {
		// 简单邮件
		mailService.sendSimpleMail("inrgihc@163.com", "Simple Mail", "第一封简单邮件");

		// HTML格式邮件
		Context context = new Context();
		context.setVariable("username", "tang");
		mailService.sendHtmlMail("inrgihc@163.com", "HTML Mail", templateEngine.process("mail/mail", context));

		// HTML格式邮件，带附件
		Context context2 = new Context();
		context2.setVariable("username", "join");
		ArrayList<File> files = new ArrayList<>();
		// File对象
		files.add(new File("C:\\Users\\Administrator\\Desktop\\上传测试.txt"));
		files.add(new File("C:\\Users\\Administrator\\Desktop\\上传测试2.txt"));
		mailService.sendAttachmentsMail("inrgihc@163.com", "Attachments Mail",
				templateEngine.process("mail/attachment", context2), files);

		return "success to send mail！";
	}
}
