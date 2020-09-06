package bootstrap;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.apache.log4j.Logger;

public class SocketServerHandler extends SimpleChannelInboundHandler<String> {
  private static Logger logger = Logger.getLogger(SocketServerHandler.class);

  @Override
  public void exceptionCaught(ChannelHandlerContext arg0, Throwable arg1) {
    // TODO Auto-generated method stub

  }

  @Override
  public void channelRead(ChannelHandlerContext arg0, Object msg) {
    // TODO Auto-generated method stub
    String data = msg.toString();
    logger.info("数据内容：data=" + data);
  }

  @Override
  protected void channelRead0(ChannelHandlerContext ctx, String msg) {

  }
}