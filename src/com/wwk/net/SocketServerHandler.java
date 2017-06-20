package com.wwk.net;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import message.core.ClientActionProto.ClientAction;
import message.core.PBMessageProto.PBMessage;

public class SocketServerHandler extends ChannelInboundHandlerAdapter {

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
			PBMessage pbMessage = (PBMessage)msg;
			System.out.println(ClientAction
					.valueOf(pbMessage.getCode()).name());
	}


}
