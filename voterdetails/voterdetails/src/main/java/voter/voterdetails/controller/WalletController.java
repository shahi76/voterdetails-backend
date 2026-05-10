package voter.voterdetails.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import voter.voterdetails.service.WalletService;

@RestController
@RequestMapping("/wallet")
@RequiredArgsConstructor
@CrossOrigin("*")
public class WalletController {

    private final WalletService walletService;

    @PostMapping("/save")
    public String saveWallet(@RequestBody String walletAddress) {

        return walletService.saveWallet(walletAddress);
    }
}