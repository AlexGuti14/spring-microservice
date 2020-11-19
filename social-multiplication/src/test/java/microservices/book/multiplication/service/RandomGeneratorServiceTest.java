package microservices.book.multiplication.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RandomGeneratorServiceTest {
	
	@Autowired
	private RandomGeneratorService randomGeneratorService;
	
	@Test
	public void generateRandomFactorIsBetweenExpectedLimits() throws Exception{
		
		// when a good sample of randomly generated factors is generated
		List<Integer> randomFactors = IntStream.range(0, 1000)
				.map(i -> randomGeneratorService.generateRandomFactor())
				//.peek(i -> System.out.println(i))
				.boxed()
				.collect(Collectors.toList());
		//Boxed empaqueta dentro del wraper
		//Conversion del tipo de dato en la colleccion de primitivos a integer
		
		assertThat(randomFactors).allMatch(factor -> factor <= 100 && factor >=11);
															
	}

}
