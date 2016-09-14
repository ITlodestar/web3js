package org.web3j.protocol.jsonrpc20;

import java.math.BigInteger;

import org.web3j.methods.request.EthCall;
import org.web3j.methods.request.EthSendTransaction;

/**
 * Mordon Testnet Configuration.
 */
public class MordenTestnetConfig extends IntegrationTestConfig {

    @Override
    public String validBlockHash() {
        https://testnet.etherscan.io/block/1627453
        return "0xd67e59db999c3bd78bd4c2ba54689dba0c372ebcad09c8b9677970f37d64ca46";
    }

    @Override
    public BigInteger validBlock() {
        https://testnet.etherscan.io/block/1627453
        return BigInteger.valueOf(1627453);
    }

    @Override
    public BigInteger validBlockTransactionCount() {
        return BigInteger.valueOf(7);
    }

    @Override
    public BigInteger validBlockUncleCount() {
        return BigInteger.ZERO;
    }

    @Override
    public String validAccount() {
        https://testnet.etherscan.io/address/0xCB10FBad79F5e602699fFf2Bb4919Fbd87AbC8CC
        return "0xCB10FBad79F5e602699fFf2Bb4919Fbd87AbC8CC";
    }

    @Override
    public String validContractAddress() {
        https://testnet.etherscan.io/address/0xbe5422d15f39373eb0a97ff8c10fbd0e40e29338
        return "0xBe5422D15F39373Eb0a97Ff8c10Fbd0e40e29338";
    }

    @Override
    public String validContractAddressPositionZero() {
        return "0x00000000000000000000000066cb7d88784d0b48b85fd9dc8ff032ad255249ed";
    }

    @Override
    public String validContractCode() {
        return "0x606060405236156100da5760e060020a60003504630d4159df81146100e257806311da60b41461017357806330c6caa41461018e578063337dd81e1461027a57806333f6832a146102e2578063365e80681461033c5780633e72a4691461034f57806348d15f341461039b5780634b45116b146103fd5780635ef8b21d146104175780637c48bbda146104315780638f77583914610444578063934814e514610457578063a45850311461046b578063b14233f014610496578063c245f203146104f8578063defb5dfe1461076c578063e5106c7b14610793575b610955610002565b6109596004355b6000805b60035460ff821610156109d0578260ff1660036000508260ff168154811015610002576000919091526000805160206112ad833981519152015460ff1614156109db576003805460ff831690811015610002576000805160206112ad83398151915201546901000000000000000000900460ff161590506109db578060010191506109d5565b61095560015460a860020a900460ff1615156109e357610002565b6109556004808035906020019082018035906020019191908080601f0160208091040260200160405190810160405280939291908181526020018383808284375094965050933593505050507f6eb63117e97f14dd952b62e4ba4f5fb400097881826dd03340d65c4702fdd03082826040518080602001836000191681526020018281038252848181518152602001915080519060200190808383829060006004602084601f0104600f02600301f150905090810190601f1680156102675780820380516001836020036101000a031916815260200191505b50935050505060405180910390a15b5050565b6109706004355b6000805b60045460ff821610156109d05782600160a060020a031660046000508260ff168154811015610002576000919091526000805160206112cd8339815191520154600160a060020a03161415610a4b578060010160ff1691506109d5565b61098860043560038054829081101561000257506000526000805160206112ad833981519152015460ff81811691610100810463ffffffff9081169265010000000000830490911691690100000000000000000090041684565b6109bc60015460a060020a900460ff1681565b600160a060020a0360043516600090815260026020908152604080832060ff60243516845290915290205463ffffffff165b6040805163ffffffff929092168252519081900360200190f35b6109556004808035906020019082018035906020019191908080601f0160208091040260200160405190810160405280939291908181526020018383808284375094965050505050505060015460a860020a900460ff161515610ae657610002565b61095560015460a860020a900460ff1615610afd57610002565b61095560015460a060020a900460ff1615610b6557610002565b6109bc60015460a860020a900460ff1681565b6109bc60015460b060020a900460ff1681565b61097060015460b860020a900461ffff1681565b6002602090815260043560009081526040808220909252602435815220546103819063ffffffff1681565b6109556004808035906020019082018035906020019191908080601f0160208091040260200160405190810160405280939291908181526020018383808284375094965050505050505060015460a860020a900460ff161515610bcc57610002565b6109556004808035906020019082018035906020019191908080601f016020809104026020016040519081016040528093929190818152602001838380828437509496505050505050505b6000808080805b60045461ffff86161015610c7b57600093505b60035460ff85161015610cb7576004805460029160009161ffff89169081101561000257600380546000805160206112cd8339815191529290920154600160a060020a031684526020949094526040832093915060ff881690811015610002576000805160206112ad833981519152015460ff16825250602091909152604081205463ffffffff169350831115610760576003805460ff8616908110156100025760009182526000805160206112ad833981519152019050546004805461010090920463ffffffff16935083850292507fdbd9e0ed524d25d383cc4fe520360a13e4e9071ff29dbebeb2fe5bb8b11ae35e9188919061ffff8916908110156100025760009182526000805160206112cd83398151915201909054906101000a9004600160a060020a0316600160179054906101000a900461ffff168460036000508960ff168154811015610002576000828152604080516000805160206112ad8339815191529390930154602084810189905291840187905267ffffffffffffffff8616606085015260ff166080840181905260a080855289519085015288519094849360c08501938b81019392839286928492879291600491601f860191909104600f0201f150905090810190601f16801561074e5780820380516001836020036101000a031916815260200191505b50965050505050505060405180910390a15b6001939093019261055d565b61095560043560243560443560643560015460a860020a900460ff161515610cc357610002565b6040805160206004803580820135838102858101850190965280855261095595929460249490939285019282918501908490808284375050604080518735808a013560208181028481018201909552818452989a99604499939850919091019550935083925085019084908082843750506040805196358089013560208181028a81018201909452818a529799986064989097506024929092019550935083925085019084908082843750506040805196358089013560208181028a81018201909452818a529799986084989097506024929092019550935083925085019084908082843750506040805196358089013560208181028a81018201909452818a5297999860a4989097506024929092019550935083925085019084908082843750506040805196358089013560208181028a81018201909452818a5297999860c4989097506024929092019550935083925085019084908082843750506040805196358089013560208181028a81018201909452818a5297999860e49890975060249290920195509350839250850190849080828437509496505050505050506000600060006000600160149054906101000a900460ff1615610e0957610002565b005b565b6040805160ff929092168252519081900360200190f35b6040805161ffff929092168252519081900360200190f35b6040805160ff95909516855263ffffffff938416602086015291909216838201529015156060830152519081900360800190f35b604080519115158252519081900360200190f35b600091505b50919050565b6001016100ed565b60015460b060020a900460ff16156109fa57610002565b6001805476ff00000000000000000000000000000000000000000000191660b060020a1790556040517fcda70ec5282f76a05c8462b79f1c9bc5b90100ac136a729d68bb9e7db13c224f90600090a1565b600101610285565b7fdbb8bde728ca2ef1f4018da51888d308d91fd05867e52323881eabbd3f2706cc8160405180806020018281038252838181518152602001915080519060200190808383829060006004602084601f0104600f02600301f150905090810190601f168015610ad55780820380516001836020036101000a031916815260200191505b509250505060405180910390a15b50565b60015460b060020a900460ff1615610a5357610002565b60015460a060020a900460ff161515610b1557610002565b6001805475ff000000000000000000000000000000000000000000191660a860020a1790556040517f88e36caf24c93958bdbc1e36f2108ef050f199cc5d70d94ead55a47dee039d8690600090a1565b600054600160a060020a03908116339091161415610957576001805474ff0000000000000000000000000000000000000000191660a060020a1790556040517f12e1f7611ddafc6f2baab057e430a7db763c15625b1444e71b193b377b7dfc6790600090a1565b60015460b060020a900460ff1615610be357610002565b7f58cc5721f1141bb77a97e09d7c37929ea9defb1efb140cdb494ef3827e6226488160405180806020018281038252838181518152602001915080519060200190808383829060006004602084601f0104600f02600301f150905090810190601f168015610c655780820380516001836020036101000a031916815260200191505b509250505060405180910390a1610ae381610543565b6001805460b860020a80820461ffff1683010278ffff000000000000000000000000000000000000000000000019909116179055505050505050565b6001949094019361054a565b60015460b060020a900460ff1615610cda57610002565b600160a060020a038416600090815260026020908152604080832060ff8616845290915290205463ffffffff82811691161015610d1657610002565b610d1f826100e9565b60ff1660001415610d2f57610002565b600160a060020a03848116600090815260026020818152604080842060ff8816808652908352818520805463ffffffff1981811663ffffffff9283168b900317909255968a1686529383528185209085529091529091208054918216919092168301179055610da2848461124181610281565b6040805133600160a060020a039081168252868116602083015285168183015260ff8416606082015263ffffffff8316608082015290517fcc792e071e271d99497d2dd9475464ef4db18e7ad4223645a8f552bc243aafc39181900360a00190a150505050565b6000935060009250600091505b8a518260ff161015610e795760038054600181018083558281838015829011610e86576000839052610e86906000805160206112ad8339815191529081019083015b8082111561107757805469ffffffffffffffffffff19168155600101610e58565b5050505050505050505050565b5050509190906000526020600020900160006080604051908101604052808f8760ff168151811015610002579060200190602002015181526020018e8760ff168151811015610002579060200190602002015181526020018d8760ff168151811015610002579060200190602002015181526020018c8760ff168151811015610002576020908102909101810151909152815184549183015160408401516060949094015169010000000000000000000265010000000000949094026101009190910260ff199390931690911764ffffffff0019169190911768ffffffff000000000019161769ff00000000000000000019161790915550849150505b868260ff1681518110156100025790602001906020020151840161ffff168161ffff16101561107b57848161ffff168151811015610002579060200190602002015160026000506000888461ffff1681518110156100025790602001906020020151600160a060020a0316815260200190815260200160002060005060008d8560ff16815181101561000257602090810290910181015160ff1682529190915260409020805463ffffffff191690911790558451859061ffff83169081101561000257906020019060200201518301925082506110ca868261ffff1681518110156100025790602001906020020151610281565b5090565b868260ff1681518110156100025790602001906020020151840193508350888260ff168151811015610002579060200190602002015163ffffffff168363ffffffff1614151561117357610002565b61ffff166000141561116b5760048054600181018083558281838015829011611120576000839052611120906000805160206112cd8339815191529081019083015b80821115611077576000815560010161110c565b505050919090600052602060002090016000888461ffff1681518110156100025760209081029091010151825473ffffffffffffffffffffffffffffffffffffffff19161790915550505b600101610f83565b6000925082507f87a55d5207b00dd1f01df93e3e3f0ca71c341f411396e2b99212ace28185ecd98b8360ff16815181101561000257906020019060200201518b8460ff16815181101561000257906020019060200201518b8560ff16815181101561000257906020019060200201518b8660ff1681518110156100025790602001906020020151604051808560ff1681526020018463ffffffff1681526020018363ffffffff168152602001821515815260200194505050505060405180910390a160019190910190610e16565b61ffff1660001415610276576004805460018101808355828183801582901161127d5781836000526020600020918201910161127d919061110c565b505050600092835250602090912001805473ffffffffffffffffffffffffffffffffffffffff191690911790555056c2575a0e9e593c00f959f8c92f12db2869c3395a3b0502d05e2516446f71f85b8a35acfbc15ff81a39ae7d344fd709f28e8600b4aa8c65c6b64bfe7fe36bd19b";
    }

    @Override
    public EthSendTransaction ethSendTransaction() {
        return new EthSendTransaction(
                validAccount(),
                validContractCode()
        );
    }

    @Override
    public EthCall ethCall() {
        return new EthCall(
                validAccount(),
                validContractCode()
        );
    }

    @Override
    public String validTransactionHash() {
        return "0xf26d441775da4e01cb557dfe35e09ab8c8a69134b2687209e34348c11ae54509";
    }

    @Override
    public String validUncleBlockHash() {
        return "0x9d512dd0cad173dd3e7ec568794db03541c4a98448cc5940b695da604d118754";
    }

    @Override
    public BigInteger validUncleBlock() {
        return BigInteger.valueOf(1640092);
    }
}
