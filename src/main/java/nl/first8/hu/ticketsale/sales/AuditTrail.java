package nl.first8.hu.ticketsale.sales;

import lombok.Data;
import nl.first8.hu.ticketsale.registration.Account;

import javax.persistence.*;

/**
 * Created by rikde on 05/09/2017.
 */
@Entity
@Data
public class AuditTrail {

    @Id
    @OneToOne(mappedBy = "audit_trail")
    private Sale sale;

    @Id
    @OneToOne(mappedBy = "audit_trail")
    private Account account;

}
