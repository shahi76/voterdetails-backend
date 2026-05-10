package voter.voterdetails.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import voter.voterdetails.entity.Wallet;
import voter.voterdetails.repository.WalletRepository;

@Service
@RequiredArgsConstructor
public class WalletService {

    private final WalletRepository walletRepository;

    public String saveWallet(String walletAddress) {

        Wallet wallet = new Wallet();

        wallet.setWalletAddress(walletAddress);

        walletRepository.save(wallet);

        return "Wallet Saved Successfully";
    }
}