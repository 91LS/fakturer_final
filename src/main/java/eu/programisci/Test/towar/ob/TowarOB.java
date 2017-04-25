package eu.programisci.Test.towar.ob;

import eu.programisci.Test.towar.dto.TowarDTO;

import javax.persistence.*;
import java.util.Date;
/**
 * Created by student on 25.04.17.
 */
@Entity
@Table(name = "test_towary")
@SequenceGenerator(allocationSize = 1, name = "SEKWENCJA", sequenceName = "gen_test_towary_id")
public class TowarOB {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEKWENCJA")
    private Long id;

    @Column(name = "dataUtworzenia", columnDefinition = "TIMESTAMP")
    private Date dataUtworzenia;

    @Column(name = "nazwa")
    private String nazwa;

    @Column(name = "pkwiu")
    private String pkwiu;

    @Enumerated(EnumType.STRING)
    @Column(name = "jednostkaMiary")
    private TowarDTO.EJednostkaMiary jednostkaMiary;

    @Column(name = "vat")
    private Integer vat;

    @Column(name = "cenaNetto")
    private Integer cenaNetto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataUtworzenia() {
        return dataUtworzenia;
    }

    public void setDataUtworzenia(Date dataUtworzenia) {
        this.dataUtworzenia = dataUtworzenia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getPkwiu() {
        return pkwiu;
    }

    public void setPkwiu(String pkwiu) {
        this.pkwiu = pkwiu;
    }

    public TowarDTO.EJednostkaMiary getJednostkaMiary() {
        return jednostkaMiary;
    }

    public void setJednostkaMiary(TowarDTO.EJednostkaMiary jednostkaMiary) {
        this.jednostkaMiary = jednostkaMiary;
    }

    public Integer getVat() {
        return vat;
    }

    public void setVat(Integer vat) {
        this.vat = vat;
    }

    public Integer getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(Integer cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

}
