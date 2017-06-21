package com.wwk.model;

public class GameMsg {
	private long time;//时间
	private int type;//0:系统;1：玩家   GameMsgType
	private String pMsg;//玩家发送信息
	private SysMsg sysMsg ;//系统信息
	
	
	/**
	 * 系统信息
	 * @author LiuWei
	 *
	 */
	class SysMsg{
		private int type;//枚举类型 SysMsgType
		private int target1;//
		private int target2;//
	}
}
