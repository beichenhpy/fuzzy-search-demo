package cn.beichenhpy.mybatisplusdemo.mapper;

import cn.beichenhpy.mybatisplusdemo.entity.Device;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Select;



public interface DeviceMapper extends BaseMapper<Device> {
    @Select("select * from device where ${value}")
    IPage<Device> selectAllByDeviceCodeAndDeviceTypeAndModelDeviceIPage(Page<Device> page,String value);
}
