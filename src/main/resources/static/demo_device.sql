create table device
(
    id          varchar(36) not null
        primary key,
    device_code varchar(36) null,
    model       varchar(36) null,
    device_type varchar(36) null
)
    comment '设备表';

INSERT INTO demo.device (id, device_code, model, device_type) VALUES ('1', '03号矿车', 'w90d', '矿车');
INSERT INTO demo.device (id, device_code, model, device_type) VALUES ('2', '03号装载机', '855', '装载机');