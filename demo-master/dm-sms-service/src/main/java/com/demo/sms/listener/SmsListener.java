package com.demo.sms.listener;

import com.demo.sms.properties.SmsProperties;
import com.demo.sms.utils.SmsUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author jensen
 * @date 2016/9/29
 */
@Slf4j
@Component
@EnableConfigurationProperties(value = SmsProperties.class)
public class SmsListener {

    @Autowired
    private SmsProperties props;

    @Autowired
    private SmsUtil smsUtil;

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "dm.sms.verify.queue"),
            exchange = @Exchange(name = "dm.sms.exchange", type = ExchangeTypes.TOPIC),
            key = "sms.verify.code"
    ))
    public void listenVerifyCode(Map<String, Object> msg) {
        if (msg == null) {
            return;
        }
        String phone = (String) msg.remove("phone");
        if (StringUtils.isBlank(phone)) {
            return;
        }
        smsUtil.sendSms(props.getSignName(), props.getVerifyCodeTemplate(), phone, msg);
    }


}
