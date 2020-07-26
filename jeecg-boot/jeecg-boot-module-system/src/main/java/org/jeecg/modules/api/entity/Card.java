package org.jeecg.modules.api.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class Card {
    
	@TableId
	private String id;

	private String userId;

	private String bank;

	private String cardNo;

	/** 固定额度 */
	private Integer fixedQuota;

	private Integer billDay;

	private Integer dueDay;

	/** 初始剩余额度 */
	private BigDecimal remainQuota;

	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
  @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private java.util.Date createdTime;

	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
  @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private java.util.Date updatedTime;
}
