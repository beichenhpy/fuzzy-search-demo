package cn.beichenhpy.fuzzysearchdemo.service;


import cn.beichenhpy.fuzzysearchdemo.entity.Device;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface IDeviceService extends IService<Device> {
    /**
     * 模糊查询拼接分页
     * @param searchList 分词集合
     */
    void deviceList(List<String> searchList);
}
