package pe.edu.upc.aaw.backend_happycomunity.entities;

import javax.persistence.*;

@Entity
@Table(name = "Condominio")
public class Condominio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCondominio;
    @Column(name = "nameCondominio",nullable = false,length = 45)
    private String nameCondominio;
    @Column(name = "regionCondominio",nullable = false,length = 25)
    private String regionCondominio;
    @Column(name = "districtCondominio",nullable = false,length = 25)
    private String districtCondominio;
    @Column(name = "addressCondominio",nullable = false,length = 45)
    private String addressCondominio;

    public Condominio(int idCondominio, String nameCondominio, String regionCondominio, String districtCondominio, String addressCondominio) {
        this.idCondominio = idCondominio;
        this.nameCondominio = nameCondominio;
        this.regionCondominio = regionCondominio;
        this.districtCondominio = districtCondominio;
        this.addressCondominio = addressCondominio;
    }

    public Condominio() {

    }

    public int getIdCondominio() {
        return idCondominio;
    }

    public void setIdCondominio(int idCondominio) {
        this.idCondominio = idCondominio;
    }

    public String getNameCondominio() {
        return nameCondominio;
    }

    public void setNameCondominio(String nameCondominio) {
        this.nameCondominio = nameCondominio;
    }

    public String getRegionCondominio() {
        return regionCondominio;
    }

    public void setRegionCondominio(String regionCondominio) {
        this.regionCondominio = regionCondominio;
    }

    public String getDistrictCondominio() {
        return districtCondominio;
    }

    public void setDistrictCondominio(String districtCondominio) {
        this.districtCondominio = districtCondominio;
    }

    public String getAddressCondominio() {
        return addressCondominio;
    }

    public void setAddressCondominio(String addressCondominio) {
        this.addressCondominio = addressCondominio;
    }


}
