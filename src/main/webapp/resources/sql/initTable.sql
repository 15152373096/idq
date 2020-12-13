#成员配置表
CREATE TABLE t_member (
	id VARCHAR (32) PRIMARY KEY DEFAULT 'UUID' COMMENT 'id',
	name VARCHAR (32) NOT NULL COMMENT '姓名',
	phone VARCHAR (11)  COMMENT '电话',
	comment VARCHAR (256) COMMENT '备注',
	createTime TIMESTAMP DEFAULT NOW() COMMENT '创建时间',
	updateTime TIMESTAMP DEFAULT NOW() COMMENT '更新时间'
) COMMENT='成员配置表' ENGINE = INNODB DEFAULT CHARSET = utf8;

#基金收入表
CREATE TABLE t_fund_income (
	id VARCHAR (32) PRIMARY KEY DEFAULT 'UUID' COMMENT 'id',
	fundDate VARCHAR (8) NOT NULL COMMENT '基金记录日期，字符形式，精确到月，yyyy年MM月',
	memberId VARCHAR (32) NOT NULL COMMENT '成员ID',
	donateAmount DECIMAL (14, 2) NOT NULL COMMENT '捐赠金额',
	comment VARCHAR (256) COMMENT '备注',
	createTime TIMESTAMP DEFAULT NOW() COMMENT '创建时间',
	updateTime TIMESTAMP DEFAULT NOW() COMMENT '更新时间'
) COMMENT='基金收入表' ENGINE = INNODB DEFAULT CHARSET = utf8;

#基金扶持项目表
CREATE TABLE t_fund_project (
	id VARCHAR (32) PRIMARY KEY DEFAULT 'UUID' COMMENT 'id',
	name VARCHAR (32) NOT NULL COMMENT '项目名称',
	description VARCHAR (512) COMMENT '项目描述',
	comment VARCHAR (256) COMMENT '备注',
	createTime TIMESTAMP DEFAULT NOW() COMMENT '创建时间',
	updateTime TIMESTAMP DEFAULT NOW() COMMENT '更新时间'
) COMMENT='基金扶持项目表' ENGINE = INNODB DEFAULT CHARSET = utf8;

#基金支出表
CREATE TABLE t_fund_expense (
	id VARCHAR (32) PRIMARY KEY DEFAULT 'UUID' COMMENT 'id',
	fundDate VARCHAR (8) NOT NULL COMMENT '基金记录日期，字符形式，精确到月，yyyy年MM月',
	projectId VARCHAR (32) NOT NULL COMMENT '支出项目',
	expenseAmount DECIMAL (14, 2) NOT NULL COMMENT '支出金额',
	description VARCHAR (512) COMMENT '支出描述',
	comment VARCHAR (256) COMMENT '备注',
	createTime TIMESTAMP DEFAULT NOW() COMMENT '创建时间',
	updateTime TIMESTAMP DEFAULT NOW() COMMENT '更新时间'
) COMMENT='基金支出表' ENGINE = INNODB DEFAULT CHARSET = utf8;


#t_member32位uuid主键触发器
CREATE TRIGGER trigger_t_member_auto_uuid BEFORE INSERT ON t_member FOR EACH ROW
BEGIN
IF new.id = 'UUID' THEN
SET new.id = (SELECT REPLACE (UUID(), '-', ''));
END IF;
END;

#t_fund_income32位uuid主键触发器
CREATE TRIGGER trigger_t_fund_income_auto_uuid BEFORE INSERT ON t_fund_income FOR EACH ROW
BEGIN
IF new.id = 'UUID' THEN
SET new.id = (SELECT REPLACE (UUID(), '-', ''));
END IF;
END;

#t_fund_project32位uuid主键触发器
CREATE TRIGGER trigger_t_fund_project_auto_uuid BEFORE INSERT ON t_fund_project FOR EACH ROW
BEGIN
IF new.id = 'UUID' THEN
SET new.id = (SELECT REPLACE (UUID(), '-', ''));
END IF;
END;

#t_fund_expense32位uuid主键触发器
CREATE TRIGGER trigger_t_fund_expense_auto_uuid BEFORE INSERT ON t_fund_expense FOR EACH ROW
BEGIN
IF new.id = 'UUID' THEN
SET new.id = (SELECT REPLACE (UUID(), '-', ''));
END IF;
END;

#初始化删除
DROP TABLE IF EXISTS t_member;
DROP TABLE IF EXISTS t_fund_income;
DROP TABLE IF EXISTS t_fund_project;
DROP TABLE IF EXISTS t_fund_expense;
DROP TRIGGER IF EXISTS trigger_t_member_auto_uuid;
DROP TRIGGER IF EXISTS trigger_t_fund_income_auto_uuid;
DROP TRIGGER IF EXISTS trigger_t_fund_project_auto_uuid;
DROP TRIGGER IF EXISTS trigger_t_fund_expense_auto_uuid;


