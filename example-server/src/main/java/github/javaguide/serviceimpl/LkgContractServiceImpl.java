package github.javaguide.serviceimpl;


import github.javaguide.ContractService;
import github.javaguide.annotation.RpcService;

@RpcService(group = "contract", version = "001")
public class LkgContractServiceImpl implements ContractService {

    static {
        System.out.println("LKG 合同被创建");
    }

    @Override
    public String createContract(String contract) {
        return "LKG Contract created：" + contract;
    }
}
