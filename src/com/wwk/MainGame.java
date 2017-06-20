package com.wwk;

import com.wwk.action.core.ActionSet;
import com.wwk.net.NetManager;

/**
 * 
 * @author LiuWei
 *
 */
public class MainGame {

	public static void main(String[] args) {
		try {
			//初始化网络服务
			NetManager.getInstance().init();
			//初始化操作码映射列表
			ActionSet.getInstance().init();
			
			System.out.println("game server started...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
