package networking;

public class InboundDataHandler extends ChannelInboundHandlerAdapter {
//	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
//		System.out.println(((ByteBuf) msg).toString(io.netty.util.CharsetUtil.US_ASCII));
	}

//	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
//		cause.printStackTrace();
//		ctx.close();
	}
}
