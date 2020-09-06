package bootstrap;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.apache.log4j.Logger;

import java.io.IOException;

public class SocketServerHandler extends SimpleChannelInboundHandler<String> {
  private static Logger logger = Logger.getLogger(SocketServerHandler.class);

  @Override
  public void exceptionCaught(ChannelHandlerContext arg0, Throwable arg1) {

  }

  // todo Json decode
  @Override
  public void channelRead(ChannelHandlerContext ctx, Object msg) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();
    TestMsg testMsg = objectMapper.readValue((String) msg, TestMsg.class);
    logger.info("data=" + testMsg.testMsg);
  }

  @Override
  protected void channelRead0(ChannelHandlerContext ctx, String msg) {

  }
}