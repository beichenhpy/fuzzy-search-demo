package cn.beichenhpy.fuzzysearchdemo.mapper;

import cn.beichenhpy.fuzzysearchdemo.entity.Device;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Select;



public interface DeviceMapper extends BaseMapper<Device> {
    @Select("select * from device where ${value}")
    IPage<Device> selectAllByDeviceCodeAndDeviceTypeAndModelDeviceIPage(Page<Device> page,String value);
}
