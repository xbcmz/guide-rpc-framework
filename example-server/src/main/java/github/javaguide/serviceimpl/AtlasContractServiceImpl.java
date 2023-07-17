package github.javaguide.serviceimpl;


import github.javaguide.ContractService;

//@RpcService(group = "contract", version = "001")
public class AtlasContractServiceImpl implements ContractService {
    static {
        System.out.println("Atlas 合同被创建");
    }

    @Override
    public String createContract(String contract) {
        return "Atlas Contract created：" + contract;
    }
}
