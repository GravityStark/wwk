package com.wwk.model;

import com.wwk.model.core.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import message.RoomMsgProto.JoinerStatus;

/**
 * 
 * 游戏参与者
 * Created by liuwei on 2017/6/20.
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class Joiner extends BaseModel{
    private Player player; //玩家信息
    private int status;//当前状态 (枚举JoinerStatus)
    private int deadReason;//死亡原因 (枚举DeadReason)
    private int role;//角色枚举Role)
    
	public Joiner(Player player) {
		super();
		this.player = player;
		status = JoinerStatus.WAIT_VALUE;
	}
}
