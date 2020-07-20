package org.jeecg.modules.api.service.impl;

import org.jeecg.modules.api.entity.SpendRecord;
import org.jeecg.modules.api.mapper.SpendRecordMapper;
import org.jeecg.modules.api.service.ISpendRecordService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 消费记录主表
 * @Author: jeecg-boot
 * @Date:   2020-07-20
 * @Version: V1.0
 */
@Service
public class SpendRecordServiceImpl extends ServiceImpl<SpendRecordMapper, SpendRecord> implements ISpendRecordService {

}
