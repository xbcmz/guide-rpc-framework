package github.javaguide;

import github.javaguide.config.RpcServiceConfig;
import github.javaguide.proxy.HxsRpcClientProxy;
import github.javaguide.remoting.transport.RpcRequestTransport;
import github.javaguide.remoting.transport.socket.SocketRpcClient;

public class SocketClientMain {
    public static void main(String[] args) {
        RpcRequestTransport rpcRequestTransport = new SocketRpcClient();
        RpcServiceConfig rpcServiceConfig = new RpcServiceConfig();

        HxsRpcClientProxy hxsRpcClientProxy = new HxsRpcClientProxy(rpcRequestTransport, rpcServiceConfig);
        ContractService contractService = hxsRpcClientProxy.getProxy(ContractService.class);
        String contract = contractService.createContract("HT000001");
        System.out.println(contract);
    }
}
