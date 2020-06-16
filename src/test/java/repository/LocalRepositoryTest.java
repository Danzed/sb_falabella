package repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import org.junit.jupiter.api.Test;

import com.test.falabella.entity.LocalEntity;
import com.test.falabella.repository.LocalRepository;

@DataJpaTest
public class LocalRepositoryTest {
	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private LocalRepository localRepository;

	@Test
	public void whenFindByLocalNombre_thenReturnLocal() {
		// given
		LocalEntity recoleta = new LocalEntity(Long.parseLong("1"), "16-06-2020", "534", "TORRES MPD", "RECOLETA", "RECOLETA",
				"AVENIDA EL SALTO 2972", "10:30 hrs.", "19:30 hrs.", "+560225053570", "-33.3996351",
				"-70.62894990000001", "martes", "7", "122");
		entityManager.persist(recoleta);
		entityManager.flush();

		// when
		List<LocalEntity> found = localRepository.findByLocalNombre(recoleta.getLocal_nombre());

		// then
		assertThat(found.get(0).getLocal_nombre()).isEqualTo(recoleta.getLocal_nombre());
	}
}
