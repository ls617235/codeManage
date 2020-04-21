package com.ls.springboot.config;

import com.ls.springboot.service.EmpService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description: EmpConfig <br>
 * date: 2020/4/16 21:17 <br>
 * author: liushuai <br>
 * version: 1.0 <br>
 *     @Configuration相当于配置文件
 */
@Configuration
public class EmpConfig {
    /* *
     * description: empService2 <br>
     * params:  <br>
     * @return  返回值就是组件中的对象
     */
    @Bean
    public EmpService empService2(){
        return new EmpService();
    }
}
