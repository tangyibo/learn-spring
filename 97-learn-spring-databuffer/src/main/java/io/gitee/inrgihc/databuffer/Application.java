package io.gitee.inrgihc.databuffer;

import java.nio.ByteBuffer;

import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferFactory;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.core.io.buffer.DefaultDataBufferFactory;

public class Application {

	public static void main(String[] args) {
		DataBufferFactory factory = new DefaultDataBufferFactory(true);
		DataBuffer buffer = factory.allocateBuffer();

		try {
			ByteBuffer bb = ByteBuffer.allocateDirect(16);
			bb.putInt(0xCAFEBABE);
			bb.putShort((short) 3);
			bb.putLong(45L);

			buffer.write(bb);
			System.out.println(buffer.toString());
		} finally {
			DataBufferUtils.release(buffer);
		}

	}

}
