package eu.programisci.Test.kontrahent.ob;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by student on 25.04.17.
 */
@Entity
@Table(name = "test_kontrahenci")
@SequenceGenerator(allocationSize = 1, name = "SEKWENCJA", sequenceName = "gen_test_kontrahenci_id")
public class KontrahentOB {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEKWENCJA")
    private Long id;

    @Column(name = "creation_date", columnDefinition = "TIMESTAMP")
    private Date creationDate;

    @Column(name = "nazwa")
    private String nazwa;

    @Column(name = "adres")
    private String adres;

    @Column(name = "nip")
    private String nip;
}
