import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.apache.log4j.Logger;

public class SocketClientHandler extends SimpleChannelInboundHandler<String> {
  private static Logger logger = Logger.getLogger(MainCmd.class);

  @Override
  public void exceptionCaught(ChannelHandlerContext arg0, Throwable arg1) throws Exception {
    // TODO Auto-generated method stub
  }

  @Override
  public void channelRead(ChannelHandlerContext arg0, Object msg) throws Exception {
    // TODO Auto-generated method stub
    String data = msg.toString();
    logger.info("数据内容：data=" + data);
  }

  @Override
  protected void channelRead0(ChannelHandlerContext arg0, String data) throws Exception {
    // TODO Auto-generated method stub
    logger.info("数据内容：data=" + data);
  }

}
