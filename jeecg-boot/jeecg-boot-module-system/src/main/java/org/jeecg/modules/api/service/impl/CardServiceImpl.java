package org.jeecg.modules.api.service.impl;

import org.jeecg.modules.api.entity.Card;
import org.jeecg.modules.api.mapper.CardMapper;
import org.jeecg.modules.api.service.ICardService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 卡主表
 * @Author: jeecg-boot
 * @Date:   2020-07-20
 * @Version: V1.0
 */
@Service
public class CardServiceImpl extends ServiceImpl<CardMapper, Card> implements ICardService {

}
