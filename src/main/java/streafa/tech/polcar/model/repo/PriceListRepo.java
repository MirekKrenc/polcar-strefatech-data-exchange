package streafa.tech.polcar.model.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import streafa.tech.polcar.model.PriceProductData;

@Repository
public interface PriceListRepo extends CrudRepository<PriceProductData, String> {
}
