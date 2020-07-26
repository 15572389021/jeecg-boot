package org.jeecg.modules.api.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@TableName("spend_record")
public class SpendRecord {

    /**
     * ID
     */
    @TableId
    private String id;

    /**
     * 卡ID
     */
    private String cardId;

    /**
     * 消费金额
     */
    private BigDecimal amount;

    /**
     * 消费类型
     */
    private Integer amountType;

    /**
     * 费率
     */
    private BigDecimal rate;

    /**
     * 手续费
     */
    private BigDecimal fee;

    /**
     * 消费时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date spendDate;

    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdTime;

    /**
     * 更新时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedTime;
}
