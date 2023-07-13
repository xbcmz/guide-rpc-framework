package github.javaguide.serviceimpl;


import github.javaguide.ContractService;

//@HxsRpcService(group = "contract", version = "001")
public class AtlasContractServiceImpl implements ContractService {
    @Override
    public String createContract(String contract) {
        return "Atlas Contract created：" + contract;
    }
}
