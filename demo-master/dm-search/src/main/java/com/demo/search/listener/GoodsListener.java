package com.demo.search.listener;

import com.demo.search.service.SearchService;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jensen
 * @date 2016/9/28
 */
@Component
public class GoodsListener {

    @Autowired
    private SearchService searchService;

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "dm.search.insert.queue", durable = "true"),
            exchange = @Exchange(name = "dm.item.exchange",
                    type = ExchangeTypes.TOPIC,
                    ignoreDeclarationExceptions = "true"),
            key = {"item.insert", "item.update"}
            ))
    public void listenInsert(Long id) {
        //监听新增或更新
        if (id != null) {
            searchService.insertOrUpdate(id);
        }

    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "dm.search.insert.queue", durable = "true"),
            exchange = @Exchange(name = "dm.item.exchange",
                    type = ExchangeTypes.TOPIC,
                    ignoreDeclarationExceptions = "true"),
            key = "item.delete"
    ))
    public void listenDelete(Long id) {
        //监听删除
        if (id != null) {
            searchService.delete(id);
        }
    }
}
