package nl.first8.hu.ticketsale.sales;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Sale implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumns({
        @JoinColumn(name = "ticket_account_id", referencedColumnName = "account_id")
        ,
        @JoinColumn(name = "ticket_concert_id", referencedColumnName = "concert_id")})
    private Ticket ticket;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "audit_trail_account_id", referencedColumnName = "account_id")
            ,
            @JoinColumn(name = "audit_trail_sale_id", referencedColumnName = "sale_id")})
    private AuditTrail auditTrail;

    @Temporal(TemporalType.TIMESTAMP)
    private Date sellDate;

    @Min(1)
    private int price;

    public Long getId() {
        return id;
    }
}
