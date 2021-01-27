package cn.beichenhpy.mybatisplusdemo.controller;

import cn.beichenhpy.mybatisplusdemo.service.IDeviceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class DeviceController {

    @Resource(name = "deviceServiceImpl")
    private IDeviceService iDeviceService;
    @GetMapping("/list")
    public void getDeviceList(){
        List<String> selectList = new ArrayList<>();
        selectList.add("装载机");
        selectList.add("855");
        iDeviceService.deviceList(selectList);
    }
}
