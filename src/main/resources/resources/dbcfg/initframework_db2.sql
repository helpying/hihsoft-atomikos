/*==============================================================*/
/* Table: T_SYS_POST   岗位表                                         */
/*==============================================================*/
create table T_SYS_POST  (
   POST_ID              VARCHAR(32)                    not null,
   POST_NAME            VARCHAR(100),
   REMARK               VARCHAR(200),
   POST_TYPE            VARCHAR(4),
   PARENT_POSTID        VARCHAR(32),
   constraint PK_T_SYS_POST primary key (POST_ID)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;