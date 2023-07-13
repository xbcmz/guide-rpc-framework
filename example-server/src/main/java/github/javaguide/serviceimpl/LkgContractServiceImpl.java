package github.javaguide.serviceimpl;


import github.javaguide.ContractService;

//@HxsRpcService(group = "contract", version = "001")
public class LkgContractServiceImpl implements ContractService {
    @Override
    public String createContract(String contract) {
        return "LKG Contract created：" + contract;
    }
}
