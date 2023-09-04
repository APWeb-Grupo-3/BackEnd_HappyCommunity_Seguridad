package pe.edu.upc.aaw.backend_happycomunity.dtos;

public class CondominioDTO {

    private int idCondominio;
    private String nameCondominio;
    private String regionCondominio;
    private String districtCondominio;
    private String addressCondominio;

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
