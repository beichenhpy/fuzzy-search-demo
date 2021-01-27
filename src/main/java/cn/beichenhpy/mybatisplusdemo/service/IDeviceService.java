package cn.beichenhpy.mybatisplusdemo.service;


import cn.beichenhpy.mybatisplusdemo.entity.Device;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface IDeviceService extends IService<Device> {
    void deviceList(List<String> searchList);
}
