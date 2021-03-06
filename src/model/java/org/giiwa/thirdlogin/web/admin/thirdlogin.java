package org.giiwa.thirdlogin.web.admin;

import org.giiwa.app.web.admin.setting;
import org.giiwa.core.bean.X;
import org.giiwa.core.conf.Global;

public class thirdlogin extends setting {

  @Override
  public void get() {
    this.set("page", "/admin/setting.thirdlogin.html");
  }

  @Override
  public void set() {
    Global.setConfig("thirdlogin.baidu.on", X.isSame("on", this.getString("baidu_on")) ? 1 : 0);
    Global.setConfig("thirdlogin.sina.on", X.isSame("on", this.getString("sina_on")) ? 1 : 0);
    Global.setConfig("thirdlogin.linkin.on", X.isSame("on", this.getString("linkin_on")) ? 1 : 0);
    Global.setConfig("thirdlogin.qq.on", X.isSame("on", this.getString("qq_on")) ? 1 : 0);
    Global.setConfig("thirdlogin.github.on", X.isSame("on", this.getString("github_on")) ? 1 : 0);
    Global.setConfig("thirdlogin.wechat.on", X.isSame("on", this.getString("wechat_on")) ? 1 : 0);

    Global.setConfig("thirdlogin.github.clientid", this.getString("github_clientid"));
    Global.setConfig("thirdlogin.github.secret", this.getString("github_secret"));

    Global.setConfig("thirdlogin.wechat.appid", this.getString("wechat_appid"));
    Global.setConfig("thirdlogin.wechat.secret", this.getString("wechat_secret"));

    Global.setConfig("thirdlogin.sina.appkey", this.getString("sina_appkey"));
    Global.setConfig("thirdlogin.sina.secret", this.getString("sina_secret"));

    Global.setConfig("thirdlogin.qq.appid", this.getString("qq_appid"));
    Global.setConfig("thirdlogin.qq.appkey", this.getString("qq_appkey"));

    get();
  }

}
