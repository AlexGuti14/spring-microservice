package microservices.book.multiplication.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.Before;
import org.junit.Test;


public class RandomGeneratorServiceImplTest {

	private RandomGeneratorServiceImpl randomGeneratorServiceImpl;

	@Before
	public void setUp() {
		randomGeneratorServiceImpl = new RandomGeneratorServiceImpl();
	}
	
	
	@Test
	public void generateRandomFactorIsBetweenExpectedLimits() throws Exception{
		
		// when a good sample of randomly generated factors is generated
		List<Integer> randomFactors = IntStream.range(0, 1000)
				.map(i -> randomGeneratorServiceImpl.generateRandomFactor())
				//.peek(i -> System.out.println(i))
				.boxed()
				.collect(Collectors.toList());
		//Boxed empaqueta dentro del wraper
		//Conversion del tipo de dato en la colleccion de primitivos a integer
		
		assertThat(randomFactors).allMatch(factor -> factor <= 100 && factor >=11);
															
	}
}
