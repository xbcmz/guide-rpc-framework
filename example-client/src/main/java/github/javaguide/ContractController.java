package github.javaguide;

import github.javaguide.annotation.RpcReference;
import org.springframework.stereotype.Component;

@Component
public class ContractController {

    @RpcReference(version = "001", group = "contract")
    private ContractService contractService;

    public void test() {
        System.out.println(contractService.createContract("HT000001"));
    }
}
