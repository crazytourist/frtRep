import com.blockchain.tools.eth.codec.EthAbiCodecTool;
import com.blockchain.tools.eth.contract.util.EthContractUtil;
import com.blockchain.tools.eth.contract.util.model.SendModel;
import com.blockchain.tools.eth.contract.util.model.SendResultModel;
import com.codeborne.selenide.Configuration;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.generated.Uint256;

import java.math.BigInteger;

public class FirstTest {

    public static void main(String[] args) {
        // Write data to the contract

//        Configuration.proxyHost = "";
//        Configuration.proxyPort = 121;
//        Configuration.proxyEnabled = true;


//        EthContractUtil ethContractUtil = null;
//        String contractAddress = "";
//        SendResultModel sendResultModel = ethContractUtil.sendRawTransaction(
//                SendModel.builder()
//                        .setSenderAddress("0xb4e32492E9725c3215F1662Cf28Db1862ed1EE84") // Address of the caller
//                        .setPrivateKey("")// Private key of senderAddress
//                        .setToAddress(contractAddress) // Contract Address
//                        .setValue(new BigInteger("1000000000")) // coin amount, If you want to use the default value, you can pass null directly or leave this parameter out.
//                        .setGasPrice(new BigInteger("1000")) // gasPrice，If you want to use the default value, you can pass null directly or leave this parameter out.
//                        .setGasLimit(new BigInteger("800000")) // gasLimit，If you want to use the default value, you can pass null directly or leave this parameter out.
//                EthAbiCodecTool.getInputData(
//                        "transfer", // Name of the method to be called
//                        new Address(toAddress), // Parameter 1
//                        new Uint256(new BigInteger("1000000000000000000")) // Parameter 2，If there are other parameters, you can go ahead and pass in the next
//                ) // The inputData of the method to be called
//        );
//
//        sendResultModel.getEthSendTransaction(); // Results after sending a transaction
//        sendResultModel.getEthGetTransactionReceipt(); // Results after the transaction is broadcast
    }




}
