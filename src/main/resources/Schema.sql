CREATE TABLE ORDERS
(
    ID serial primary key,
    BUS_NAME character varying(50),
	LOCN_NBR integer not null default 0,
	COMPANY  character varying(100), -- is gift
	DIVISION  character varying(100), -- is gift
	BUS_UNIT  character varying(3) NOT NULL,
	EXT_BATCH_NBR character varying(50),
	BATCH_NBR character varying(50),
    ORDER_NBR character varying(50),
    STAT_CODE  integer DEFAULT 0,
    ORDER_DTTM timestamp not null, 
    SHIP_BY_DTTM timestamp not null,
    EXPECTED_DELIVERY_DTTM timestamp not null,
    DELIVERY_TYPE character varying(50), -- express, overnight
	IS_GIFT character varying(1), -- is gift
	GIFT_MSG  character varying(100), -- is gift
	TRANSACTION_NAME character varying(50),
	CUST_FIRST_NAME character varying(50),
	CUST_LAST_NAME character varying(50),
	CUST_MIDDLE_NAME character varying(50),
	CUST_ADDR_1 character varying(50),
	CUST_ADDR_2 character varying(50),
	CUST_ADDR_3 character varying(50),
	CUST_CITY character varying(50),
	CUST_STATE character varying(50),
	CUST_COUNTRY character varying(50),
	CUST_PHONE_NBR character varying(50),
	BILL_FIRST_NAME character varying(50),
	BILL_LAST_NAME character varying(50),
	BILL_MIDDLE_NAME character varying(50),
	BILL_ADDR_1 character varying(50),
	BILL_ADDR_2 character varying(50),
	BILL_ADDR_3 character varying(50),
	BILL_CITY character varying(50),
	BILL_STATE character varying(50),
	BILL_COUNTRY character varying(50),
	BILL_PHONE_NBR character varying(50),
	DEL_FIRST_NAME character varying(50),
	DEL_LAST_NAME character varying(50),
	DEL_MIDDLE_NAME character varying(50),
	DEL_ADDR_1 character varying(50),
	DEL_ADDR_2 character varying(50),
	DEL_ADDR_3 character varying(50),
	DEL_CITY character varying(50),
	DEL_STATE character varying(50),
	DEL_COUNTRY character varying(50),
	DEL_PHONE_NBR character varying(50),
	REF_FIELD_1  character varying(50),
	REF_FIELD_2  character varying(50),
	SOURCE character varying(50),
	HOST_NAME  character varying(50),
    CREATED_DTTM  timestamp not null default NOW(),
    UPDATED_DTTM  timestamp not null default NOW(),
    CREATED_BY character varying(25),
    UPDATED_BY character varying(25),
    unique (BUS_NAME, LOCN_NBR,COMPANY,DIVISION,BUS_UNIT,ORDER_NBR)
);

CREATE TABLE ORDER_LINES
(
    ID serial primary key,
	LOCN_NBR integer not null,
    ORDER_ID integer not null REFERENCES ORDERS (ID),
    ITEM_BRCD character varying(25) NULL,
    ORIG_ORDER_QTY integer NOT NULL DEFAULT 0,
    ORDER_QTY integer NOT NULL DEFAULT 0,
    CANCELLED_QTY integer NOT NULL DEFAULT 0,
    SHORT_QTY integer NOT NULL DEFAULT 0,
    PICKED_QTY integer NOT NULL DEFAULT 0,
    PACKED_QTY integer NOT NULL DEFAULT 0,
    SHIPPED_QTY integer NOT NULL DEFAULT 0,
    STAT_CODE  integer DEFAULT 0,
	OLPN  character varying(50),
	SOURCE character varying(50),
	TRANSACTION_NAME character varying(50),
	REF_FIELD_1  character varying(50),
	REF_FIELD_2  character varying(50),
	HOST_NAME  character varying(50),
    CREATED_DTTM  timestamp not null default NOW(),
    UPDATED_DTTM  timestamp not null default NOW(),
    CREATED_BY character varying(25),
    UPDATED_BY character varying(25)
);



