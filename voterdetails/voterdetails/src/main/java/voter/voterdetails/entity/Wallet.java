package voter.voterdetails.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String walletAddress;
}