package cn.beichenhpy.fuzzysearchdemo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "device")
public class Device {
    @TableId(value = "id")
    private String id;
    private String deviceCode;
    private String model;
    private String deviceType;
}
