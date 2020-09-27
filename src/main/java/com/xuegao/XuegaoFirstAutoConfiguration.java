package com.xuegao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <br/> @PackageName：com.xuegao.xuegao_first_spring_boot_starter
 * <br/> @ClassName：XuegaoFirstAutoConfiguration
 * <br/> @Description：自动配置类
 * <br/> @author：xuegao
 * <br/> @date：2020/9/27 15:36
 */
// 配置
@Configuration
// 判断当前环境是web环境
@ConditionalOnClass(XuegaoFirst.class)
// 向容器内部导入 XuegaoFirstProperties 类
@EnableConfigurationProperties(XuegaoFirstProperties.class)
public class XuegaoFirstAutoConfiguration {

    // @ConditionalOnClass，当classpath下发现该类的情况下进行自动配置。
    // @ConditionalOnMissingBean，当Spring Context中不存在该Bean时。
    // @ConditionalOnProperty(prefix = "xuegao.first", value = "enabled", havingValue = "true")，
    //     当配置文件中example.service.enabled=true时。

    @Autowired
    private XuegaoFirstProperties xuegaoFirstProperties;
    // 从容器中获取 XuegaoFirstProperties 组件

    @Bean
    @ConditionalOnMissingBean
    // @ConditionalOnProperty(prefix = "xuegao.first")
    // @ConditionalOnProperty(prefix = "xuegao.first", value = "enabled", havingValue = "true")
    public XuegaoFirst xuegaoFirst() {
        XuegaoFirst xuegaoFirst = new XuegaoFirst();
        // 将容器里面获得的组件传给 helloworld，然后将 helloworld 组件丢到容器
        xuegaoFirst.setXuegaoFirstProperties(xuegaoFirstProperties);
        return xuegaoFirst;
    }

}
