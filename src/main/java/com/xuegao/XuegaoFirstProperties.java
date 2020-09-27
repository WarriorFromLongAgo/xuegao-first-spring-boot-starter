package com.xuegao;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <br/> @PackageName：com.xuegao.xuegao_first_spring_boot_starter
 * <br/> @ClassName：XuegaoFirstProperties
 * <br/> @Description：类和配置文件的绑定
 * <br/> @author：xuegao
 * <br/> @date：2020/9/27 15:39
 */
@ConfigurationProperties(prefix = "xuegao.first")
public class XuegaoFirstProperties {
	private String before;
	private String after;

	public String getBefore() {
		return before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public String getAfter() {
		return after;
	}

	public void setAfter(String after) {
		this.after = after;
	}
}
