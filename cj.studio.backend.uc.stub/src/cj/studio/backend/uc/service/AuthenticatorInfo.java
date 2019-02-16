package cj.studio.backend.uc.service;

import java.util.HashMap;
import java.util.Map;

/**
 * 认证者信息，如：本平台、第三方（微信、支付宝等）
 * 
 * @author caroceanjofers
 *
 */
public class AuthenticatorInfo {
	String name;
	String displayTitle;
	public AuthenticatorInfo(String name,String displayTitle,String icon,String url) {
		this.name=name;
		this.displayTitle=displayTitle;
		this.icon=icon;
		this.authenUrl=url;
		this.props=new HashMap<>();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayTitle() {
		return displayTitle;
	}

	public void setDisplayTitle(String displayTitle) {
		this.displayTitle = displayTitle;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getAuthenUrl() {
		return authenUrl;
	}

	public void setAuthenUrl(String authenUrl) {
		this.authenUrl = authenUrl;
	}

	public Map<String, String> getProps() {
		return props;
	}

	String icon;
	String authenUrl;// 认证地址
	Map<String, String> props;
}
