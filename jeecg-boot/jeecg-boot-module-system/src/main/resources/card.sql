CREATE TABLE `card`.`Untitled`  (
  `ID` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'ID',
  `USER_ID` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户ID',
  `BANK` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '银行',
  `CARD_NO` bigint(20) NOT NULL COMMENT '卡号',
  `FIXED_QUOTA` int(11) NOT NULL COMMENT '固定额度',
  `BILL_DAY` int(11) NOT NULL COMMENT '账单日',
  `DUE_DAY` int(11) NOT NULL COMMENT '还款日',
  `REMAIN_QUOTA` decimal(7, 2) NOT NULL COMMENT '初始剩余额度',
  `CREATED_TIME` datetime(0) NOT NULL COMMENT '创建时间',
  `UPDATED_TIME` datetime(0) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '卡 ' ROW_FORMAT = Dynamic;