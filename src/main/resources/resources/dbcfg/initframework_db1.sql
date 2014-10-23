/*==============================================================*/
/* Table: T_SYS_APP (多应用、多子系统定义)                                           */
/*==============================================================*/
create table T_SYS_APP  (
   APP_ID               VARCHAR(32)                    not null,
   APP_NAME             VARCHAR(160),
   APP_ICON             VARCHAR(20),
   ORDER_NO             INT,
   APP_PATH             VARCHAR(200),
   APP_SHORTNAME        VARCHAR(30),
   constraint PK_T_SYS_APP primary key (APP_ID)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;