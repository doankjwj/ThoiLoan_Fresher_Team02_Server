package cmd.receive.demo;

import bitzero.server.extensions.data.BaseCmd;
import bitzero.server.extensions.data.DataCmd;

import bitzero.util.common.business.CommonHandle;

import java.nio.ByteBuffer;

import service.DemoHandler.DemoDirection;


public class RequestBuild extends BaseCmd{
    public short id;
    public short row;
    public short col;
    
    public RequestBuild(DataCmd dataCmd) {
        super(dataCmd);
        unpackData();
    }
    
    @Override
    public void unpackData() {
        ByteBuffer bf = makeBuffer();
        try {
            id = readShort(bf);   
            row = readShort(bf);
            col = readShort(bf);
            System.out.println("build: " + id + " row: " + row + " col: " + col);
        } catch (Exception e) {
//            direction = DemoDirection.UP.getValue();
//            CommonHandle.writeErrLog(e);
        }
    }
}
