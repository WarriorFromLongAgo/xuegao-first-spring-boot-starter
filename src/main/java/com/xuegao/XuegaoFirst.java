package com.xuegao;

/**
 * <br/> @PackageName：com.xuegao.xuegao_first_spring_boot_starter
 * <br/> @ClassName：XuegaoFirst
 * <br/> @Description：逻辑处理
 * <br/> @author：xuegao
 * <br/> @date：2020/9/27 15:39
 */
public class XuegaoFirst {

	private XuegaoFirstProperties xuegaoFirstProperties;

	public XuegaoFirstProperties getXuegaoFirstProperties() {
		return xuegaoFirstProperties;
	}

	public void setXuegaoFirstProperties(XuegaoFirstProperties xuegaoFirstProperties) {
		this.xuegaoFirstProperties = xuegaoFirstProperties;
	}

	public String sayHelloWorld(String info) {
		return xuegaoFirstProperties.getBefore() + "===" + info + "===" + xuegaoFirstProperties.getAfter();
	}
}
