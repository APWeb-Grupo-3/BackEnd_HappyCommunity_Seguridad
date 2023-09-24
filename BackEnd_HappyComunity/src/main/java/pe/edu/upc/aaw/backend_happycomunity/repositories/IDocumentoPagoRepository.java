package pe.edu.upc.aaw.backend_happycomunity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.backend_happycomunity.entities.DocumentoPago;

import java.util.List;

@Repository
public interface IDocumentoPagoRepository extends JpaRepository<DocumentoPago,Integer> {
    //HU44	Visualizar el mes con mayor deuda
    @Query(value = " select to_char(fecha_vencimeinto, 'Month')  mes, sum(total)  sumatotal\n" +
            "   from documento_pago\n" +
            "   where estado = 'Pendiente' and extract(year from fecha_vencimeinto) = extract(year from current_date)\n" +
            "   group by mes\n" +
            "   having sum(total) = (\n" +
            "       select max(max_sumatotal)\n" +
            "       from (\n" +
            "           select to_char(fecha_vencimeinto, 'Month') mes, sum(total)  max_sumatotal\n" +
            "           from documento_pago\n" +
            "           where estado = 'Pendiente' and extract(year from fecha_vencimeinto) = extract(year from current_date)\n" +
            "           group by mes\n" +
            "       ) temporal\n" +
            "   );", nativeQuery = true)
    List<Object[]> MesMayorDeuda();

    /*
//HU45	Visualizar el monto total de deudas por cada mes

    @Query(value = " select to_char(fecha_vencimeinto, 'Month')  mes, sum(total)  sumames\n" +
            "   from documento_pago\n" +
            "   where estado = 'Pendiente' and extract(year from fecha_vencimeinto) = extract(year from current_date)\n" +
            "   group by mes", nativeQuery = true)
    List<Object[]> MesDeuda();

     */


}
