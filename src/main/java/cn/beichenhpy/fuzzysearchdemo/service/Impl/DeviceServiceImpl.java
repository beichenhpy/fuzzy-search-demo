package cn.beichenhpy.fuzzysearchdemo.service.Impl;

import cn.beichenhpy.fuzzysearchdemo.entity.Device;
import cn.beichenhpy.fuzzysearchdemo.mapper.DeviceMapper;
import cn.beichenhpy.fuzzysearchdemo.service.IDeviceService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class DeviceServiceImpl extends ServiceImpl<DeviceMapper,Device> implements IDeviceService {

    @Resource(type = DeviceMapper.class)
    private DeviceMapper deviceMapper;
    @Override
    public void deviceList(List<String> searchList) {
        Page<Device> devicePage = new Page<Device>().setCurrent(0).setSize(10);
        String concat = "CONCAT_WS('',device_code,model,device_type) like '%";
        StringBuilder column = new StringBuilder();
        if (searchList.size() == 1){
            column.append(concat).append(searchList.get(0)).append("%").append("'");
        }else {
            for (int i = 0; i < searchList.size(); i++) {
                if (i == searchList.size() -1){
                    column.append(concat).append(searchList.get(i)).append("%").append("'");
                    break;
                }
                column.append(concat).append(searchList.get(i)).append("%").append("'").append(" and ");
            }
        }
        log.info("sql:{}",column.toString());
        //根据分词模糊查询？for循环
        IPage<Device> devices = deviceMapper.selectAllByDeviceCodeAndDeviceTypeAndModelDeviceIPage(devicePage,column.toString());
        log.info("result:{}",devices.getRecords());
    }
}
