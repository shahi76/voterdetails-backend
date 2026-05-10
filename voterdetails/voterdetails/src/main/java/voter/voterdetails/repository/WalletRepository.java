package voter.voterdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import voter.voterdetails.entity.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long> {

}