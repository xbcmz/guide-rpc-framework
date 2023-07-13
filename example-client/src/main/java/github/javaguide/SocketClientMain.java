package github.javaguide;

import github.javaguide.config.RpcServiceConfig;
import github.javaguide.proxy.HxsRpcClientProxy;
import github.javaguide.remoting.transport.RpcRequestTransport;
import github.javaguide.remoting.transport.socket.SocketRpcClient;

/**
 * @author shuang.kou
 * @createTime 2020年05月10日 07:25:00
 */
public class SocketClientMain {
    public static void main(String[] args) {
        // Register service via annotation
        RpcRequestTransport rpcRequestTransport = new SocketRpcClient();
        RpcServiceConfig rpcServiceConfig = new RpcServiceConfig();


        HxsRpcClientProxy hxsRpcClientProxy = new HxsRpcClientProxy(rpcRequestTransport, rpcServiceConfig);
        ContractService contractService = hxsRpcClientProxy.getProxy(ContractService.class);
        String contract = contractService.createContract("HT000001");
        System.out.println(contract);

        // 采用动态代理的方式获取代理对象 jdk动态代理
//        RpcClientProxy rpcClientProxy = new RpcClientProxy(rpcRequestTransport, rpcServiceConfig);
//        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
//        String hello = helloService.hello(new Hello("111", "222"));
//        System.out.println(hello);
    }
}
