package org.jeecg.modules.api.entity;

import java.io.Serializable;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;

/**
 * @Description: 消费记录主表
 * @Author: jeecg-boot
 * @Date:   2020-07-20
 * @Version: V1.0
 */
@Data
@TableName("spend_record")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="spend_record对象", description="消费记录主表")
public class SpendRecord {
    
	/**ID*/
	@TableId(type = IdType.ID_WORKER_STR)
    @ApiModelProperty(value = "ID")
	private java.lang.String id;
	/**卡ID*/
	@Excel(name = "卡ID", width = 15)
    @ApiModelProperty(value = "卡ID")
	private java.lang.String cardId;
	/**消费时间*/
	@Excel(name = "消费时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "消费时间")
	private java.util.Date spendDate;
	/**消费金额*/
	@Excel(name = "消费金额", width = 15)
    @ApiModelProperty(value = "消费金额")
	private java.math.BigDecimal amount;
	/**消费类型*/
	@Excel(name = "消费类型", width = 15)
    @ApiModelProperty(value = "消费类型")
	private java.lang.Integer amountType;
	/**费率*/
	@Excel(name = "费率", width = 15)
    @ApiModelProperty(value = "费率")
	private java.math.BigDecimal rate;
	/**手续费*/
	@Excel(name = "手续费", width = 15)
    @ApiModelProperty(value = "手续费")
	private java.math.BigDecimal fee;
	/**创建时间*/
	@Excel(name = "创建时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
	private java.util.Date createdTime;
	/**更新时间*/
	@Excel(name = "更新时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "更新时间")
	private java.util.Date updatedTime;
}
