package com.infogomes.historycountryapi.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.infogomes.historycountryapi.entity.History;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class UserRepositoryTest {

	@Autowired
	HistoryRepository historyRepository;

	@Before
	public void setUp() {
		History history = new History(LocalDateTime.now(), "Portugal");

		historyRepository.save(history);
	}

	@After
	public void tearDown() {
		historyRepository.deleteAll();
	}

	@Test
	public void testSave() {
		History history = new History(LocalDateTime.now(), "Brasil");

		History historyResponse = historyRepository.save(history);

		assertNotNull(historyResponse);
	}

	@Test
	public void testFindAll() {
		List<History> historyList = historyRepository.findAll();

		assertEquals(historyList.size(), 1);
	}

}
