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
 * @Description: 卡主表
 * @Author: jeecg-boot
 * @Date:   2020-07-20
 * @Version: V1.0
 */
@Data
@TableName("card")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="card对象", description="卡主表")
public class Card {
    
	/**ID*/
	@TableId(type = IdType.ID_WORKER_STR)
    @ApiModelProperty(value = "ID")
	private java.lang.String id;
	/**用户ID*/
	@Excel(name = "用户ID", width = 15)
    @ApiModelProperty(value = "用户ID")
	private java.lang.String userId;
	/**银行*/
	@Excel(name = "银行", width = 15)
    @ApiModelProperty(value = "银行")
	private java.lang.String bank;
	/**卡号*/
	@Excel(name = "卡号", width = 15)
    @ApiModelProperty(value = "卡号")
	private java.lang.Integer cardNo;
	/**固定额度*/
	@Excel(name = "固定额度", width = 15)
    @ApiModelProperty(value = "固定额度")
	private java.lang.Integer fixedQuota;
	/**账单日*/
	@Excel(name = "账单日", width = 15)
    @ApiModelProperty(value = "账单日")
	private java.lang.Integer billDay;
	/**还款日*/
	@Excel(name = "还款日", width = 15)
    @ApiModelProperty(value = "还款日")
	private java.lang.Integer dueDay;
	/**初始剩余额度*/
	@Excel(name = "初始剩余额度", width = 15)
    @ApiModelProperty(value = "初始剩余额度")
	private java.math.BigDecimal remainQuota;
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
