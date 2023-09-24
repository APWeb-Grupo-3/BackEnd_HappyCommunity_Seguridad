package pe.edu.upc.aaw.backend_happycomunity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.backend_happycomunity.entities.Aviso;
import java.util.List;
@Repository
public interface IAvisoRepository extends JpaRepository<Aviso, Integer> {
    //Cantidad de avisos por mes
    //HU31: Visualizar la cantidad de avisos publicados por mes
    @Query(value ="SELECT\n" +
            " EXTRACT(YEAR FROM fecha_publicacion) AS anio,\n" +
            " CASE EXTRACT(MONTH FROM fecha_publicacion)\n" +
            " WHEN 1 THEN 'Enero'\n" +
            " WHEN 2 THEN 'Febrero'\n" +
            " WHEN 3 THEN 'Marzo'\n" +
            " WHEN 4 THEN 'Abril'\n" +
            " WHEN 5 THEN 'Mayo'\n" +
            " WHEN 6 THEN 'Junio'\n" +
            " WHEN 7 THEN 'Julio'\n" +
            " WHEN 8 THEN 'Agosto'\n" +
            " WHEN 9 THEN 'Setiembre'\n" +
            " WHEN 10 THEN 'Octubre'\n" +
            " WHEN 11 THEN 'Noviembre'\n" +
            " WHEN 12 THEN 'Diciembre'\n" +
            " END AS mes,\n" +
            " \tCOUNT(*) AS cantidad_de_avisos\n" +
            " FROM\n" +
            " aviso\n" +
            " GROUP BY\n" +
            " anio, mes",nativeQuery = true)
    public List<String[]> quantityAnnouncementPerMonth();
}
